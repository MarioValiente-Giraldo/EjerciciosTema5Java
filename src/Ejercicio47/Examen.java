package Ejercicio47;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Examen {
    private Map<String,Double> notas;
    public Examen(){
        this.notas = new HashMap<>();
    }
    public void añadirNota (String alumno,double nota){
        if (nota>=0 && nota<=10) {
           this.notas.put(alumno,nota);
        }else {
            throw new IllegalArgumentException("ERROR: EL VALOR DE LA NOTA ESTÁ FUERA DE RANGO");
        }
    }
    public double getNota (String alumno){
        if (!this.notas.containsKey(alumno)){
            throw new IllegalArgumentException("ERROR: EL ALUMNO NO EXISTE");
        }
        return this.notas.get(alumno);
    }
    public double getNotaMedia(){
        if (this.notas.isEmpty()){
            throw new IllegalStateException("ERROR: NO EXISTEN ALUMNOS");
        }
        double sumaNotas = 0;
        for (int i = 0; i<this.notas.size();i++){
            sumaNotas+=this.notas.get((double)i);
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
        for (Map.Entry<String,Double> alumno : this.notas.entrySet()){
            if (alumno.getValue()>=5){
                aprobados.add(alumno.getKey());
            }
        }
        return aprobados;
    }
}
