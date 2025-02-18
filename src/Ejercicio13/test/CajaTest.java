package Ejercicio13.test;

import Ejercicio13.Caja;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CajaTest {
 @Test
    public void test1(){
     //Caja caja = new Caja("Hola");
     Caja caja = new Caja("Hola");
     caja.setMensaje("Adios");
     assertEquals("Hola",caja.getMensaje());
 }
 @Test
    public void test2(){
     Caja caja = new Caja(true,"Hola");
     caja.setMensaje("Adios");
     assertEquals("Adios",caja.getMensaje());

 }
 @Test
    public void test3(){
     Caja caja = new Caja(true,"Hola");
     caja.pasarMayusculas();
     assertEquals("HOLA",caja.getMensaje());

 }
 @Test
  public void test4(){
  Caja caja = new Caja("Hola");
  caja.abrir();
  assertEquals("Hola",caja.getMensaje());
 }
}