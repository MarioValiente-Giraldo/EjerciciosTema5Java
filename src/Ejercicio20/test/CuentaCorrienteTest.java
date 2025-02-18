package Ejercicio20.test;

import Ejercicio20.CuentaCorriente;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {
    @Test(expected = java.io.IOException.class)
    public void test() throws IOException  {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(11,2000);
        cuentaCorriente.retirarDinero(6000);

    }

}