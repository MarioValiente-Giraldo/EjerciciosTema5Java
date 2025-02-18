package Ejercicio10;

import Ejercicio1.DNI;

import java.time.LocalDate;

public class Persona {
    public String nombre;
    public DNI dni;
    public double sueldo;
    public LocalDate fechaNacimiento;
    public CuentaCorriente cuenta;

    public Persona(String n, DNI d, double s, LocalDate fn){

        this(n,d.numero,d.letra,s,fn,new CuentaCorriente());
    }
    public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn, CuentaCorriente cuentaCorriente){
        this.nombre = n;
        this.dni = new DNI(numDNI,letraDNI);
        this.sueldo = s;
        this.fechaNacimiento = fn;
        this.cuenta = cuentaCorriente;

    }
    public Persona(String n, DNI d){

        this (n,d.numero,d.letra,900,LocalDate.now().minusYears(20),new CuentaCorriente());
    }
    public Persona(String n, int numDNI, char letraDNI){
        this (n,numDNI,letraDNI,900,LocalDate.now().minusYears(20),new CuentaCorriente());

    }
    public void aumentarSueldo (int porcentaje){
        this.sueldo = sueldo +((porcentaje*sueldo)/100);
    }
    public void cobrarSueldo(){
        this.cuenta.añadirDinero((int)sueldo);
    }
}
