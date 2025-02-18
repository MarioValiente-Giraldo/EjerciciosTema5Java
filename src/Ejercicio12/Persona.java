package Ejercicio12;

import Ejercicio1.DNI;
import Ejercicio10.CuentaCorriente;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechaNacimiento;
    private CuentaCorriente cuenta;

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
    public String getNombre(){
        return this.nombre;
    }
    public DNI getDni(){
        return this.dni;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public CuentaCorriente getCuenta(){
        return this.cuenta;
    }
    public boolean esMayorEdad(){
        if ((LocalDate.now().getYear()- fechaNacimiento.getYear())>18) {
            return true;
        } else {
            return false;
        }
    }
   public boolean tieneDinero(){
        if (cuenta.saldo<=0){
            return false;
        }else {
            return true;
        }
    }
    public boolean esMileurista(){
        if (sueldo<1200){
            return true;
        }else {
            return false;
        }
    }



}
