package Ejercicio46.test;

import Ejercicio46.Examen;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

import java.util.List;

import static org.junit.Assert.*;

public class ExamenTest {
    @Test
    public void test1(){
        Examen examen = new Examen();
        examen.añadirNota("Antonio",6);
        assertEquals(6,examen.getNota("Antonio"),0.01);
    }
    @Test
    public void test2(){
        Examen examen = new Examen();
        examen.añadirNota("Alicia",10);
        examen.añadirNota("Alejandro",0);
        examen.añadirNota("Juan Antonio",5);
        assertEquals(5,examen.getNotaMedia(),0.1);

    }
    @Test
    public void test3(){
        Examen examen = new Examen();
        examen.añadirNota("Alicia",10);
        examen.añadirNota("Alejandro",0);
        examen.añadirNota("Juan Antonio",5);
        assertTrue(examen.mediaAprobado());
    }
    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test4(){
        Examen examen = new Examen();
        examen.añadirNota("Antonio",-20);
        fail("No se ha lanzado el error esperado");
    }
    @Test
    public void test5(){
        Examen examen = new Examen();
        examen.añadirNota("Armando",3);
        examen.añadirNota("Matias",4.9);
        examen.añadirNota("Rigoberto",2);
        assertFalse(examen.mediaAprobado());

    }
    @Test
    public void test6(){
        Examen examen = new Examen();
        examen.añadirNota("Juan Antonio",6);
        examen.añadirNota("Jose Antonio",4);
        examen.añadirNota("Oscar",7);
        List<String> aprobados = examen.getAprobados();
        assertEquals("Juan Antonio",aprobados.get(0));
        assertEquals("Oscar",aprobados.get(1));
    }
    @Test (expected = java.lang.IllegalStateException.class)
    public void test7(){
        Examen examen = new Examen();
        examen.getNotaMedia();
        fail("No se ha lanzado la excepción esperada");

    }
}