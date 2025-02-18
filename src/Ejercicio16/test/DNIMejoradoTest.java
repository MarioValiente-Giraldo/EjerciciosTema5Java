package Ejercicio16.test;

import Ejercicio16.DNIMejorado;
import org.junit.Test;

import static org.junit.Assert.*;

public class DNIMejoradoTest {
    @Test
    public void test1() {
        DNIMejorado dni = new DNIMejorado(11111111);
        assertEquals(11111111, dni.getNúmero());
        assertEquals('H', dni.getLetra());
    }


}