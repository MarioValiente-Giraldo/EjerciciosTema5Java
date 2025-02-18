package Ejercicio8.test;

import Ejercicio8.Caja;
import org.junit.Test;

import static org.junit.Assert.*;

public class CajaTest {
 @Test
    public void test1(){
     Caja caja = new Caja("Hola");
     caja.setMensaje("Adios");
     assertEquals("Hola",caja.mensaje);
 }
 @Test
    public void test2(){
     Caja caja = new Caja(true,"Hola");
     caja.setMensaje("Adios");
     assertEquals("Adios",caja.mensaje);

 }
 @Test
    public void test3(){
     Caja caja = new Caja(true,"Hola");
     caja.pasarMayusculas();
     assertEquals("HOLA",caja.mensaje);

 }
}