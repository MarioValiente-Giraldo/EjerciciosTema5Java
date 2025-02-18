package Ejercicio46;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    private List<String>alumnos;
    private List<Double>notas;

    public Examen(){
        this.alumnos = new ArrayList<>();
        this.notas = new ArrayList<>();
    }
    public void añadirNota (String alumno,double nota){
        this.alumnos.add(alumno);
        if (nota>=0 && nota<=10) {
            this.notas.add(nota);
        }else {
            throw new IllegalArgumentException("ERROR: EL VALOR DE LA NOTA ESTÁ FUERA DE RANGO");
        }
    }
    public double getNota (String alumno){
        if (!this.alumnos.contains(alumno)){
            throw new IllegalArgumentException("ERROR: EL ALUMNO NO EXISTE");
        }
        return this.notas.get(this.alumnos.indexOf(alumno));
    }
    public double getNotaMedia(){
        if (this.alumnos.isEmpty()){
            throw new IllegalStateException("ERROR: NO EXISTEN ALUMNOS");
        }
        double sumaNotas = 0;
        for (int i = 0; i<this.alumnos.size();i++){
            sumaNotas+=this.notas.get(i);
        }
        return sumaNotas/this.notas.size();
    }
    public boolean mediaAprobado(){
        boolean resultado = true;
        if (this.getNotaMedia()<5){
            resultado = false;
        }
        return resultado;
    }
    public List<String> getAprobados(){
        List<String> aprobados = new ArrayList<>();
        for (String alumno : this.alumnos){
            if (this.getNota(alumno)>=5){
                aprobados.add(alumno);
            }
        }
        return aprobados;
    }
}
