package Ejercicio9.test;

import Ejercicio9.MarcadorBaloncesto;
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

        assertEquals(33,marcadorBaloncesto.puntosLocal);
        assertEquals(26,marcadorBaloncesto.puntosVisitante);

    }
    @Test
    public void test2(){
        LocalDate localDate = LocalDate.now();
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada",100,"Estudiantes",80,localDate);
        marcadorBaloncesto.reset();
        assertEquals(0,marcadorBaloncesto.puntosLocal);
        assertEquals(0,marcadorBaloncesto.puntosVisitante);
    }
    @Test
    public void test3(){
        LocalDate localDate = LocalDate.now();
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada",10,"Estudiantes",12,localDate);
        marcadorBaloncesto.añadirCanasta('L',4);
        assertEquals(10,marcadorBaloncesto.puntosLocal);
        assertEquals(12,marcadorBaloncesto.puntosVisitante);
    }
}