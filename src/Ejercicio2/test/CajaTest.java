package Ejercicio2.test;

import Ejercicio2.Caja;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CajaTest {
    @Test
    public void test1(){
        Caja caja = new Caja("Hola amigos");
        assertEquals("Hola amigos",caja.mensaje);
        assertEquals(false,caja.abierto);
    }
    @Test
    public void test2 (){
        Caja caja = new Caja(true,"Adios amigos");
        assertEquals("Adios amigos",caja.mensaje);
        assertEquals(true,caja.abierto);

    }
    @Test
    public void test3 (){
        Caja caja = new Caja();
        assertEquals("Viva el tema 4",caja.mensaje);
        assertEquals(false,caja.abierto);
    }

}