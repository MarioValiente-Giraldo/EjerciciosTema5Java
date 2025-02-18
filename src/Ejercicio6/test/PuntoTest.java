package Ejercicio6.test;

import Ejercicio6.Punto;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class PuntoTest {
    @Test
    public void test1(){
        Punto punto = new Punto(120,90);
        assertEquals(120,punto.x);
        assertEquals(90,punto.y);
    }
    @Test
    public void test2(){
        Punto punto = new Punto(-200,10000);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        assertEquals(dimension.width,punto.x);
        assertEquals(dimension.height,punto.y);
    }
    @Test
    public void test3(){
        Punto punto = new Punto(120,90);
        Punto punto1 = new Punto(punto);
        assertEquals(60,punto1.x);
        assertEquals(45,punto1.y);
    }
    @Test
    public void test4(){
        Punto punto = new Punto(45.0,100.0);
        assertEquals(70,punto.x);
        assertEquals(70,punto.y);

    }

}