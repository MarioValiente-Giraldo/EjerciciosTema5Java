package Ejercicio15.test;

import Ejercicio15.MarcadorBaloncesto;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MarcadorBaloncestoTest {
    @Test
    public void test1(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada","Estudiantes");
        for (int i = 0;i<5;i++){
            marcadorBaloncesto.añadirCanasta('L',1);
        }
        for (int i = 0;i<8;i++){
            marcadorBaloncesto.añadirCanasta('L',2);
        } for (int i = 0;i<4;i++){
            marcadorBaloncesto.añadirCanasta('L',3);
        }

        for (int i = 0;i<3;i++){
            marcadorBaloncesto.añadirCanasta('V',1);
        } for (int i = 0;i<10;i++){
            marcadorBaloncesto.añadirCanasta('V',2);
        } for (int i = 0;i<1;i++){
            marcadorBaloncesto.añadirCanasta('V',3);
        }

        assertEquals(33,marcadorBaloncesto.getPuntosLocal());
        assertEquals(26,marcadorBaloncesto.getPuntosVisitante());

    }
    @Test
    public void test2(){
        LocalDate localDate = LocalDate.now();
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada",100,"Estudiantes",80,localDate);
        marcadorBaloncesto.reset();
        assertEquals(0,marcadorBaloncesto.getPuntosLocal());
        assertEquals(0,marcadorBaloncesto.getPuntosVisitante());
    }
    @Test
    public void test3(){
        LocalDate localDate = LocalDate.now();
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada",10,"Estudiantes",12,localDate);
        marcadorBaloncesto.añadirCanasta('L',4);
        assertEquals(10,marcadorBaloncesto.getPuntosLocal());
        assertEquals(12,marcadorBaloncesto.getPuntosVisitante());
    }
    @Test
    public void test4(){
        LocalDate localDate = LocalDate.now();
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada",80,"Estudiantes",80,localDate);
        assertTrue(marcadorBaloncesto.hayEmpate());
        assertFalse(marcadorBaloncesto.ganaLocal());
        assertFalse(marcadorBaloncesto.ganaVisitante());
    }
    @Test
    public void test5(){
        LocalDate localDate = LocalDate.now();
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada",90,"Estudiantes",80,localDate);
        assertTrue(marcadorBaloncesto.ganaLocal());
        assertFalse(marcadorBaloncesto.hayEmpate());
        assertFalse(marcadorBaloncesto.ganaVisitante());
    }
}