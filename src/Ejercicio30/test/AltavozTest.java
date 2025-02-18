package Ejercicio30.test;

import Ejercicio30.Altavoz;
import org.junit.Test;

import static org.junit.Assert.*;

public class AltavozTest {
    @Test
    public void test1(){
        Altavoz altavoz = new Altavoz();
        assertEquals(Altavoz.VOL_MIN,altavoz.getVolumen());
        altavoz.ponerVolumenMaximo();
        assertEquals(Altavoz.VOL_MAX,altavoz.getVolumen());
    }
    @Test (expected = IllegalArgumentException.class)
    public void test2(){
        Altavoz altavoz = new Altavoz();
        altavoz.setVolumen(-28);
        fail("No se ha lanzado el error esperado");

    }
    @Test
    public void test3(){
        Altavoz altavoz = new Altavoz();
        altavoz.setVolumen(127);
        System.out.println(altavoz.toString());
        altavoz.setVolumen(Altavoz.VOL_MAX);
        System.out.println(altavoz.toString());

    }

}