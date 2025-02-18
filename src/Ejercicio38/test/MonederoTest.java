package Ejercicio38.test;

import Ejercicio38.Monedero;
import org.junit.Test;

import static org.junit.Assert.*;
public class MonederoTest {
    @Test
    public void test1(){
        Monedero monedero = new Monedero();
        boolean añadir = monedero.añadirDinero(50);
        assertTrue(añadir);
        assertEquals(50,monedero.getDineroTotal(),0.01);
        boolean retirar = monedero.retirarDinero(30);
        assertTrue(retirar);
        assertEquals(20,monedero.getDineroTotal(),0.01);
        boolean retirar2 = monedero.retirarDinero(400);
        assertFalse(retirar2);
        assertEquals(20,monedero.getDineroTotal(),0.01);

    }
    @Test
    public void test2(){
        Monedero monedero = new Monedero();
         monedero.añadirDinero(50);
        assertEquals(50,monedero.getDineroTotal(),0.01);
        boolean añadir = monedero.añadirDinero(2000);
        assertFalse(añadir);
        assertEquals(50,monedero.getDineroTotal(),0.01);
        boolean añadir2 = monedero.añadirDinero(950);
        assertTrue(añadir2);
        assertEquals(1000,monedero.getDineroTotal(),0.001);
        boolean añadir3 = monedero.añadirDinero(1);
        assertFalse(añadir3);
        assertEquals(1000,monedero.getDineroTotal(),0.001);



    }
  
}