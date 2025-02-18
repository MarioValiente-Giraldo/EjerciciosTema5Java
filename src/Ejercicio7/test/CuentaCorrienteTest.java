package Ejercicio7.test;

import Ejercicio7.CuentaCorriente;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {
    @Test
    public void test1(){
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1253,850);
        assertEquals(1253,cuentaCorriente.numero);
        assertEquals(850,cuentaCorriente.saldo,0.1);
    }
    @Test
    public void test2 (){
            CuentaCorriente cuentaCorriente = new CuentaCorriente(1253,850);
            cuentaCorriente.añadirDinero(100);
            assertEquals(1253,cuentaCorriente.numero);
            assertEquals(950,cuentaCorriente.saldo,0.1);
            cuentaCorriente.retirarDinero(200);
            assertEquals(750,cuentaCorriente.saldo,0.1);
            cuentaCorriente.retirarDinero(1000);
            assertEquals(750,cuentaCorriente.saldo,0.1);
    }



}