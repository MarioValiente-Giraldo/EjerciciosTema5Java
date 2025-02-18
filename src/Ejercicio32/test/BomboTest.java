package Ejercicio32.test;

import Ejercicio32.Bombo;
import org.junit.Test;

import static org.junit.Assert.*;

public class BomboTest {
    @Test
    public void test1(){
        Bombo bombo = new Bombo(100);
        assertEquals(100, bombo.getNumeroBolas());
        while (bombo.getNumeroBolas()>0){
            bombo.sacarBola();
        }
        assertEquals(0,bombo.getNumeroBolas());


    }

}