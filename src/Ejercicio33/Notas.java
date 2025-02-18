package Ejercicio33;

import java.util.ArrayList;
import java.util.List;

public class Notas {
    private List<Double>notas;
    public Notas(){
        this.notas = new ArrayList<>();
    }
    public void añadirNotas(double n){
        this.notas.add(n);
    }
    public int getTotalNotas(){
        return this.notas.size();
    }
    public double calcularNotaMedia(){
        double sumaNotas = 0;
        if (this.notas.isEmpty()){
            throw new IllegalStateException("No hay notas para calcular la nota media");

        }else {

            for (double nota : this.notas){
                sumaNotas+=nota;
            }
        }
        return sumaNotas/this.notas.size();
    }
    public double calcularNotaMaxima(){
        double notaMaxima = 0;
        if (this.notas.isEmpty()){
            throw new IllegalStateException("No hay notas para calcular la nota maxima");
        }else {
           for (double nota: this.notas){
               if (notaMaxima<nota){
                   notaMaxima =nota;
               }
           }
        }
        return notaMaxima;
    }
}
