package Ejercicio26.test;

import Ejercicio26.Fraccion;
import org.junit.Test;

import static org.junit.Assert.*;

public class FraccionTest {
    @Test
    public void test(){
        Fraccion primera = new Fraccion(1,2);
        Fraccion segunda = new Fraccion(3,4);
        Fraccion fraccionFinal = Fraccion.suma(primera,segunda);
        assertEquals(10,fraccionFinal.getNumerador());
        assertEquals(8,fraccionFinal.getDenominador());
    }
    @Test
    public void test2(){
        Fraccion primera = new Fraccion(2,5);
        Fraccion segunda = new Fraccion(3,7);
        Fraccion fraccionFinal = Fraccion.suma(primera,segunda);
        assertEquals(29,fraccionFinal.getNumerador());
        assertEquals(35,fraccionFinal.getDenominador());
    }
    @Test
    public void test3(){
        Fraccion primera = new Fraccion(1,2);
        Fraccion segunda = new Fraccion(3,4);
        Fraccion segundaInversa = segunda.getInversa();
        Fraccion fraccionFinal = Fraccion.dividir(primera,segundaInversa);
        assertEquals(3,fraccionFinal.getNumerador());
        assertEquals(8,fraccionFinal.getDenominador());
    }
    @Test
    public void test4(){
        Fraccion primera = new Fraccion(1,2);
        Fraccion segunda = new Fraccion(3,7);
        Fraccion tercera = new Fraccion(8,5);
        Fraccion fraccionSumada = Fraccion.suma(segunda,tercera);
        Fraccion fraccionFinal = Fraccion.multiplicar(primera,fraccionSumada);
        assertEquals(71,fraccionFinal.getNumerador());
        assertEquals(70,fraccionFinal.getDenominador());

    }
    @Test
    public void test4V2(){
        Fraccion primera = new Fraccion(1,2);
        Fraccion segunda = new Fraccion(3,7);
        Fraccion tercera = new Fraccion(8,5);
        Fraccion fraccionFinal = Fraccion.multiplicar(primera,Fraccion.suma(segunda,tercera));
        assertEquals(71,fraccionFinal.getNumerador());
        assertEquals(70,fraccionFinal.getDenominador());
    }


}