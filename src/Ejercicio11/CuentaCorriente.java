package Ejercicio11;

import java.util.Random;

public class CuentaCorriente {
    public int numero;
    public double saldo;

    public CuentaCorriente(){
        Random random = new Random();
        this.numero = random.nextInt(0,1001);
        this.saldo = 0;
    }
    public CuentaCorriente(int numero){
        this.numero = numero;
        this.saldo = 0;
    }
    public CuentaCorriente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public void añadirDinero(int cantidad){

        this.saldo =saldo+cantidad;
    }
    public void retirarDinero(int cantidad){
        double saldoFinal = saldo-cantidad;
        if (saldoFinal>0){
            this.saldo = saldoFinal;
        }
    }
}
