package Ejercicio49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurante {
    private String nombre;
    private Map<String,Integer> platos;
    public Restaurante(String n, String [] p, int [] pr){
        this.nombre = n;
        this.platos = new HashMap<>();
        for (int i = 0; i<p.length;i++){
            this.platos.put(p[i],pr[i]);
        }
    }
    public Restaurante(String n) {
        this.nombre = n;
        this.platos = new HashMap<>();
        this.platos.put("bocadillo",5);
        this.platos.put("filete",15);
        this.platos.put("sopa",8);
        this.platos.put("ensalada",9);
        this.platos.put("caviar",30);


    }
    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(String plato){
        for (int i = 0; i < this.platos.size(); i++) {
            if (this.platos.containsKey(plato)) {
                return this.platos.get(plato);
            }
        }
        throw new IllegalArgumentException("Plato no encontrado: " + plato);
    }
    public boolean estaDisponible(String plato){

        return this.platos.containsKey(plato);
    }
    public List<String>getPlatosBaratos(){
        List<String> platosBaratos = new ArrayList<>();
        for (Map.Entry<String,Integer> platos : this.platos.entrySet()){
            if (platos.getValue()<12){
                platosBaratos.add(platos.getKey());
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
