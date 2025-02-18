package Ejercicio26;

public class Fraccion {
    private int numerador;
    private int denominador;
    public Fraccion (int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public int getNumerador(){
        return this.numerador;
    }

    public int getDenominador() {
        return this.denominador;
    }
    public double getValorTotal(){
        return (double)numerador/denominador;
    }
    public Fraccion getInversa(){
        int numeradorInverso = this.denominador;
        int denominadorInverso = this.numerador;
        return new Fraccion(numeradorInverso,denominadorInverso);

    }
    public static Fraccion suma(Fraccion a,Fraccion b){
        int numerador=((a.getNumerador()*b.getDenominador())+(a.getDenominador()*b.getNumerador()));
        int denominador =a.getDenominador()*b.getDenominador();
         return new Fraccion(numerador,denominador);
    }
    public static Fraccion multiplicar (Fraccion a, Fraccion b){
        int numerador = a.getNumerador()*b.getNumerador();
        int denominador = a.getDenominador()*b.getDenominador();
        return new Fraccion(numerador,denominador);
    }
    public  static Fraccion dividir(Fraccion a, Fraccion b){
        int numerador = a.getNumerador()*b.getDenominador();
        int denominador= a.getDenominador()*b.getNumerador();
        return new Fraccion(numerador,denominador);
    }
}
