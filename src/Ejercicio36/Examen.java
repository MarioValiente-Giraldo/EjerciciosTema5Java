package Ejercicio36;

import java.util.HashMap;
import java.util.Map;

public class Examen {
    private String nombre;
    private Map<String,String>respuestas;
    public Examen(String nombre){
        this.nombre = nombre;
        this.respuestas = new HashMap<>();
    }
    public Examen(Examen c){
        this.nombre=c.nombre;
        this.respuestas=new HashMap<>();
        for (String pregunta: c.respuestas.keySet()){
            this.respuestas.put(pregunta,respuestas.get(pregunta));
        }
    }
    public void responder(String pregunta,String respuesta){
        this.respuestas.put(pregunta, respuesta);
    }
    public String getRespuesta(String pregunta){
        return this.respuestas.get(pregunta);
    }
    public double calificar(Map<String, String> respuestasCorrectas) {
        int preguntasCorrectas = 0;
        for (String pregunta : respuestasCorrectas.keySet()) {
            if (respuestasCorrectas.get(pregunta).equals(this.getRespuesta(pregunta))) {
                preguntasCorrectas++;
            }
        }
        return ((double) preguntasCorrectas / respuestasCorrectas.size()) * 10;
    }
}
