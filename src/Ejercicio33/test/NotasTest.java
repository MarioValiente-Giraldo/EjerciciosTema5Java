package Ejercicio33.test;

import Ejercicio33.Notas;
import org.junit.Test;

import java.io.NotSerializableException;

import static org.junit.Assert.*;

public class NotasTest {
    @Test
    public void test1(){
        Notas notas = new Notas();
        notas.añadirNotas(8);
        notas.añadirNotas(5);
        notas.añadirNotas(9);
        notas.añadirNotas(1);
        notas.añadirNotas(6);
        assertEquals(9,notas.calcularNotaMaxima(),0.01);
        assertEquals(5.8,notas.calcularNotaMedia(),0.01);
    }
    @Test(expected = java.lang.IllegalStateException.class)
    public void test2(){
        Notas notas = new Notas();
        notas.calcularNotaMaxima();
        fail("No ha salido el error esperado");

    }

}