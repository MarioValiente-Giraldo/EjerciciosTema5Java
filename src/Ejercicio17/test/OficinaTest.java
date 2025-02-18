package Ejercicio17.test;

import Ejercicio17.Oficina;
import org.junit.Test;

import static org.junit.Assert.*;

public class OficinaTest {
    @Test(expected =java. lang.IllegalArgumentException.class)
    public void testFallo(){
        Oficina oficina = new Oficina("Oficina",4);
        fail("No se ha lanzado el el error IllegalArgumentException");
    }

}