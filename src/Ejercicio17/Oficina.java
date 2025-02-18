package Ejercicio17;

import Ejercicio1.DNI;
import Ejercicio10.CuentaCorriente;
import Ejercicio12.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private String nombre;
    private List<Persona> trabajadores;

    public Oficina(String nombre){
        this(nombre,0);
    }
    public Oficina(String nombre, int tipo){
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
        Persona antonio = new Persona("Antonio Pérez Pérez",111111111,'H',900, LocalDate.of(2000,2,28),new CuentaCorriente());
        Persona luis = new Persona("Luis López López",22222222,'J',1000,LocalDate.of(1995,9,10),new CuentaCorriente());
        Persona ana = new Persona("Ana Díaz Díaz",33333333,'P',1200,LocalDate.of(1985,5,21),new CuentaCorriente());
        if (tipo == 0 ){
            this.trabajadores = new ArrayList<>();
       }
        else if (tipo == 1){
           trabajadores.add(antonio);
       }
        else if (tipo==2){
            trabajadores.add(antonio);
            trabajadores.add(luis);
       } else if (tipo == 3){
            trabajadores.add(antonio);
            trabajadores.add(luis);
            trabajadores.add(ana);
        } else if (tipo>3) {
            throw new IllegalArgumentException("El valor de tipo no puede ser mayor a 3");
        }

    }
    public Oficina(){
        this("Industrias DAW",3);
    }
    public void añadirEmpleado (Persona p){
        trabajadores.add(p);
    }
    public void añadirEmpleado(String nombre, String dni, double sueldo, LocalDate fechaNac){
        DNI aux = new DNI(dni);
        Persona persona = new Persona(nombre,aux,sueldo,fechaNac);
        trabajadores.add(persona);
    }
    public int getTotalEmpleados(){
        return trabajadores.size();
    }
    public int getTotalEmpleadosMileuristas(){
        int contador = 0;
        for (int i = 0; i< trabajadores.size();i++){
            if (trabajadores.get(i).esMileurista()){
                contador++;
            }
        }
        return contador;
    }
    public List<Persona> getMileuristas (){
        List<Persona> mileurista = new ArrayList<>();
        for (int i = 0; i< trabajadores.size();i++){
            if (trabajadores.get(i).esMileurista()){
                mileurista.add(trabajadores.get(i));
            }
        }
        return mileurista;
    }
    public boolean trabaja(Persona p){
        if (trabajadores.contains(p)){
            return true;
        }else {
            return false;
        }
    }
    public void pagarEmpleados(){
        for (Persona x: trabajadores){
            x.cobrarSueldo();
        }
    }
    public void mostrarInformeEmpleados(){
        for (int i = 0;i< trabajadores.size();i++){
            System.out.println(trabajadores.get(i).getNombre()+"\n"+trabajadores.get(i).getSueldo()+"\n"+trabajadores.get(i).esMileurista());
            }
    }


}
