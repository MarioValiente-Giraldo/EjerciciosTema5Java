package Ejercicio40.test;

import Ejercicio40.DepositoAguaInmutable;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepositoAguaInmutableTest {
    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test1(){
        DepositoAguaInmutable depositoAguaInmutable = new DepositoAguaInmutable(-100,50);
        fail("No se ha lanzado el error esperado");
    }
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test2(){
        DepositoAguaInmutable depositoAguaInmutable = new DepositoAguaInmutable(300,200);
        fail("No se ha lanzado el error esperado");

    }
    @Test
    public void test3(){
        DepositoAguaInmutable depositoAguaInmutable = new DepositoAguaInmutable(20,500);
        assertEquals(4,depositoAguaInmutable.getPorcentaje());
    }
    @Test
    public void test4(){
        DepositoAguaInmutable depositoAguaInmutable = new DepositoAguaInmutable(400,500);
        assertEquals(400,depositoAguaInmutable.capacidadActual());
        depositoAguaInmutable = depositoAguaInmutable.añadirLitro();
        assertEquals(401,depositoAguaInmutable.capacidadActual());
    }
}