package Ejercicio4;

import Ejercicio1.DNI;

import java.time.LocalDate;

public class Persona {
    public String nombre;
    public DNI dni;
    public double sueldo;
    public LocalDate fechaNacimiento;
    public Persona (String n,DNI d,double s,LocalDate fn){
        this(n,d.numero,d.letra,s,fn);
    }
    public Persona (String n, int numDNI, char letraDNI, double s, LocalDate fn){
        this.nombre = n;
        this.dni = new DNI(numDNI,letraDNI);
        this.sueldo = s;
        this.fechaNacimiento = fn;

    }
    public Persona (String n,DNI d){
        this (n,d.numero,d.letra,900,LocalDate.now().minusYears(20));
    }
    public Persona (String n,int numDNI, char letraDNI){
        this (n,numDNI,letraDNI,900,LocalDate.now().minusYears(20));

    }
}
