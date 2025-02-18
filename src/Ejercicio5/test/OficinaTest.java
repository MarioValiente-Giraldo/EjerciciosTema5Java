package Ejercicio5.test;

import Ejercicio5.Oficina;
import org.junit.Test;

import static org.junit.Assert.*;
public class OficinaTest {
    @Test
    public void test1(){
        Oficina oficina = new Oficina("HP");
        assertEquals("HP",oficina.nombre);
        assertEquals(null,oficina.trabajadores);
    }
    @Test
    public void test2(){
        Oficina oficina0 = new Oficina("HP",0);
        assertEquals("HP",oficina0.nombre);
        assertEquals(null,oficina0.trabajadores);

        Oficina oficina1 = new Oficina("HP",1);
        assertEquals("HP",oficina1.nombre);
        assertEquals(1,oficina1.trabajadores.size());

        Oficina oficina2 = new Oficina("HP",2);
        assertEquals("HP",oficina2.nombre);
        assertEquals(2,oficina2.trabajadores.size());

        Oficina oficina3 = new Oficina("HP",3);
        assertEquals("HP",oficina3.nombre);
        assertEquals(3,oficina3 .trabajadores.size());

    }
    @Test
    public void test3(){
        Oficina oficina = new Oficina("HP",5);
        assertEquals("HP",oficina.nombre);
        assertEquals(null,oficina.trabajadores);
    }
    @Test
    public void test4 (){
        Oficina oficina = new Oficina("HP",3);
        assertEquals("HP",oficina.nombre);
        assertEquals(3,oficina.trabajadores.size());
        assertEquals(22222222,oficina.trabajadores.get(1).dni.numero);
        assertEquals('J',oficina.trabajadores.get(1).dni.letra);
        assertEquals(1000,oficina.trabajadores.get(1).sueldo,0.1);
        assertEquals(33333333,oficina.trabajadores.get(2).dni.numero);
        assertEquals('P',oficina.trabajadores.get(2).dni.letra);
        assertEquals(1200,oficina.trabajadores.get(2).sueldo,0.1);


    }
  
}