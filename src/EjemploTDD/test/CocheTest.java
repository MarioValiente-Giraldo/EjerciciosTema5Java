package EjemploTDD.test;

import EjemploTDD.Coche;
import org.junit.Test;

import static org.junit.Assert.*;

public class CocheTest {
    @Test
    public void test1(){
        Coche coche = new Coche("1234ABC","Ferrari",15);
        assertEquals("1234ABC",coche.matricula);
        assertEquals("Ferrari",coche.marca);
        assertEquals(15,coche.velocidad);
    }
    @Test
    public void test2(){
        Coche coche = new Coche("2153ABX","Ferrari",-32);
        assertEquals("Ferrari",coche.marca);
        assertEquals("2153ABX",coche.matricula);
        assertEquals(0,coche.velocidad);

    }
    @Test
    public void test3(){
        Coche coche = new Coche("Ferrari");
        int num = Integer.parseInt(coche.matricula.substring(0,4));
        String letras = coche.matricula.substring(4);
        assertEquals(7,coche.matricula.length());
        if (num<1111 || num>9999 ){
            fail("El número no está en el rango correcto");
        }
        assertEquals("XYZ",letras);
        assertEquals(0,coche.velocidad);


    }

}