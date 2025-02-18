package Ejercicio39.test;

import Ejercicio39.Adinerado;
import Ejercicio39.Banco;
import org.junit.Test;

import static org.junit.Assert.*;

public class BancoTest {
    @Test
    public void test1(){
        Banco banco = new Banco();
        assertFalse(banco.tieneDinero());
    }
    @Test
    public void test2(){
        Banco banco1 = new Banco();
        Banco banco2 = new Banco();
        banco1.añadirDinero(7000);
        banco2.añadirDinero(5000);
        Adinerado.transferir(banco1,banco2,2500);
        assertEquals(4500,banco1.getDineroTotal(),0.001);
        assertEquals(7500,banco2.getDineroTotal(),0.001);
    }
    @Test
    public void test3(){
        Banco banco1 = new Banco();
        Banco banco2 = new Banco();
        banco1.añadirDinero(7000);
        banco2.añadirDinero(5000);
        banco1.transferirHacia(banco2,2500);
        banco2.transferirDesde(banco2,2500);
        assertEquals(4500,banco1.getDineroTotal(),0.001);
        assertEquals(7500,banco2.getDineroTotal(),0.001);
    }
    @Test
    public void test4(){
        Banco banco1 = new Banco();
        Banco banco2 = new Banco();
        banco1.añadirDinero(2000);
        banco2.añadirDinero(5000);
        boolean tranferir = Adinerado.transferir(banco1,banco2,500);
        assertFalse(tranferir);
        assertEquals(2000,banco1.getDineroTotal(),0.001);
        assertEquals(5000,banco2.getDineroTotal(),0.001);
    }

}