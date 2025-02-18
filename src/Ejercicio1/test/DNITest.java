package Ejercicio1.test;

import Ejercicio1.DNI;
import org.junit.*;

import static org.junit.Assert.*;

public class DNITest {
    @Test
    public void test1(){
        DNI dni = new DNI(12345678,'Z');
        assertEquals(12345678,dni.numero);
        assertEquals('Z',dni.letra);
    }
    @Test
    public void test2(){
        DNI dni = new DNI("12345678X");
        assertEquals(12345678,dni.numero);
        assertEquals('X',dni.letra);
    }

}