package Ejercicio36.test;

import Ejercicio36.Examen;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ExamenTest {
    @Test
    public void test1(){
        Examen examen = new Examen("Jose");
        examen.responder("¿cuanto es 2+2?","24");
        examen.responder("¿cual es el planeta mas cercano al sol?","Mercurio");
        examen.responder("¿cual es la capital de España?","Madrid");
        examen.responder("cuantos kilos son 2500 gramos","2500");

        Map <String,String> respuestasCorrectas = new HashMap<>();
        respuestasCorrectas.put("¿cuanto es 2+2?","4");
        respuestasCorrectas.put("¿cual es el planeta mas cercano al sol?","Mercurio");
        respuestasCorrectas.put("¿cual es la capital de España?","Madrid");
        respuestasCorrectas.put("cuantos kilos son 2500 gramos","2.5");
        assertEquals(5,examen.calificar(respuestasCorrectas),0.01);


    }

}