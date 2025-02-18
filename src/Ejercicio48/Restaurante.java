package Ejercicio48;

import Ejercicio6.Punto;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private String [] platos;
    private int [] precios;
    public Restaurante(String n, String [] p, int [] pr){
        this.nombre = n;
        this.platos = p;
        this.precios = pr;
    }
    public Restaurante(String n) {
        this.nombre = n;
        this.platos = new String[]{"bocadillo", "filete", "sopa", "ensalada", "caviar"};
        this.precios = new int[]{5,15,8,9,30};
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(String plato){
        for (int i = 0; i < this.platos.length; i++) {
            if (this.platos[i].equals(plato)) {
                return this.precios[i];
            }
        }
        throw new IllegalArgumentException("Plato no encontrado: " + plato);
    }
    public boolean estaDisponible(String plato){
        boolean resultado = false;
        for (String pl : this.platos){
            if (pl.equals(plato)){
               resultado = true;
            }
        }
        return resultado;
    }
    public List<String>getPlatosBaratos(){
        List<String> platosBaratos = new ArrayList<>();
        for (int i = 0; i< this.platos.length;i++){
            if (this.precios[i]<12.0){
                platosBaratos.add(this.platos[i]);
            }
        }
        return platosBaratos;
    }
    public int getCuenta(String [] platosConsumidos){
        int cuenta = 0;
        for ( String plato : platosConsumidos){
            cuenta +=this.getPrecio(plato);
        }
        return cuenta;
    }

}
