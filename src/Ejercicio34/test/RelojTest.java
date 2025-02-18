package Ejercicio34.test;

import Ejercicio34.Reloj;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class RelojTest {
    @Test
    public void test1(){
        LocalTime localTime = LocalTime.of(16,0,0);
        Reloj reloj = new Reloj(localTime);
        reloj.añadir(3600);
        assertEquals(17,reloj.getHora().getHour());
    }
    @Test
    public void test2(){
        LocalTime localTime = LocalTime.of(23,59,0);
        Reloj reloj = new Reloj(localTime);
        reloj.añadir(60);
        assertEquals(0,reloj.getHora().getHour());
    }
    @Test
    public void test3(){
        LocalTime localTime = LocalTime.of(19,30,0);
        Reloj reloj = new Reloj(localTime);
        assertEquals(false,reloj.esNoche());
        reloj.añadir(3600);
        System.out.println(reloj.toString());
        assertEquals(true,reloj.esNoche());
    }
    @Test
    public void test4(){
        LocalTime localTime = LocalTime.of(7,30,0);
        Reloj reloj = new Reloj(localTime);
        assertEquals(true,reloj.esNoche());
        reloj.añadir(3600);
        assertEquals(false,reloj.esNoche());
    }
    @Test
    public void test5(){
        LocalTime localTime = LocalTime.of(15,28,0);
        Reloj reloj = new Reloj(localTime);
        assertEquals("15:28:00",reloj.toString());


    }

}