package Ejercicio11;

import Ejercicio1.DNI;
import Ejercicio4.Persona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Oficina {
    public String nombre;
    public List<Persona> trabajadores;

    public Oficina(String nombre){
        this(nombre,0);
    }
    public Oficina(String nombre, int tipo){
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
        Persona antonio = new Persona("Antonio Pérez Pérez",111111111,'H',900, LocalDate.of(2000,2,28));
        Persona luis = new Persona("Luis López López",22222222,'J',1000,LocalDate.of(1995,9,10));
        Persona ana = new Persona("Ana Díaz Díaz",33333333,'P',1200,LocalDate.of(1985,5,21));
        if (tipo == 0 || tipo >3){
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

}
