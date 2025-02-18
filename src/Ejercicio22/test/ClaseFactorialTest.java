package Ejercicio22.test;

import Ejercicio22.ClaseFactorial;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClaseFactorialTest {
    @Test
    public void test1(){
        ClaseFactorial claseFactorial = new ClaseFactorial();
        assertEquals(1,claseFactorial.factorial(0));
    }
    @Test
    public void test2(){
        ClaseFactorial claseFactorial = new ClaseFactorial();
        assertEquals(1,claseFactorial.factorial(1));
    }

    @Test
    public void test3(){
        ClaseFactorial claseFactorial = new ClaseFactorial();
        assertEquals(120,claseFactorial.factorial(5));
    }

    @Test
    public void test4(){
        ClaseFactorial claseFactorial = new ClaseFactorial();
        assertEquals(5040,claseFactorial.factorial(7));
    }

    @Test
    public void test5(){
        ClaseFactorial claseFactorial = new ClaseFactorial();
        assertEquals(-2102132736,claseFactorial.factorial(20));
    }

    @Test
    public void test6(){
        try {
            ClaseFactorial claseFactorial = new ClaseFactorial();
                claseFactorial.factorial(2000000);
        }catch (StackOverflowError e){
        }
    }
    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test7(){
        ClaseFactorial claseFactorial = new ClaseFactorial();
        claseFactorial.factorial(-2);
    }



}