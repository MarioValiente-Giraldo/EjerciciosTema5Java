package Ejercicio38.test;

import Ejercicio38.Banco;
import org.junit.Test;

import static org.junit.Assert.*;

public class BancoTest {
    @Test
    public void test1(){
        Banco banco = new Banco();
        boolean añadir = banco.añadirDinero(1000);
        assertTrue(añadir);
        assertEquals(banco.getDineroTotal(),1000,0.01);
        boolean retirar = banco.retirarDinero(200);
        assertTrue(retirar);
        assertEquals(banco.getDineroTotal(),800,0.01);
        boolean retirar2 = banco.retirarDinero(4000);
        assertFalse(retirar2);
        assertEquals(banco.getDineroTotal(),800,0.01);


    }


}