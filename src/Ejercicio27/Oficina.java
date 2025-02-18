package Ejercicio27;

import Ejercicio4.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private String nombre;
    private List<Persona> trabajadores;

    private Oficina(String nombre){
        this(nombre,0);
    }
    private Oficina(String nombre, int tipo){
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
        Persona antonio = new Persona("Antonio Pérez Pérez",111111111,'H',900, LocalDate.of(2000,2,28));
        Persona luis = new Persona("Luis López López",22222222,'J',1000,LocalDate.of(1995,9,10));
        Persona ana = new Persona("Ana Díaz Díaz",33333333,'P',1200,LocalDate.of(1985,5,21));
        if (tipo == 0 || tipo >3){
            this.trabajadores = new ArrayList<>();
       }
        else if (tipo == 1){
            this.trabajadores.add(antonio);
       }
        else if (tipo==2){
            this.trabajadores.add(antonio);
            this.trabajadores.add(luis);
       } else if (tipo == 3){
            this.trabajadores.add(antonio);
            this.trabajadores.add(luis);
            this.trabajadores.add(ana);
        }
    }
    private Oficina(){
        this("Industrias DAW",3);

    }
    public int getTotalEmpleados(){
        return trabajadores.size();
    }
    public static Oficina getOficinaVacia(){
        return new Oficina("Oficina",0);
    }

    public static Oficina getOficinaPequeña(){
        return new Oficina("Oficina",1);
    }
    public static Oficina getOficinaMedina(){
        return new Oficina("Oficina",2);
    }public static Oficina getOficinaGrande(){
        return new Oficina("Oficina",3);
    }
}
