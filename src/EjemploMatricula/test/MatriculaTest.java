package EjemploMatricula.test;

import EjemploMatricula.Matricula;
import org.junit.Test;


import static org.junit.Assert.*;

public class MatriculaTest {
    @Test
    public void test1(){
        Matricula matricula = new Matricula(1234,"XYZ");
        assertEquals(1234,matricula.numero);
        assertEquals("XYZ",matricula.letras);
    }
    @Test
    public void test2 (){
        Matricula matricula = new Matricula(1234567,"XYZ");
        assertEquals(1234,matricula.numero);
        assertEquals("XYZ",matricula.letras);
    }
    @Test
    public void test3(){
        Matricula matricula = new Matricula(-80,"UFR");
        assertEquals(1234,matricula.numero);
        assertEquals("UFR",matricula.letras);
    }
    @Test
    public void test4(){
        Matricula matricula = new Matricula(1562,"%-A");
            assertEquals(1562,matricula.numero);
            assertEquals("ABC",matricula.letras);

    }
    @Test
    public void test5(){
        Matricula matricula = new Matricula(98650,"Y*A");
        assertEquals(1234,matricula.numero);
        assertEquals("ABC",matricula.letras);
    }
    //  Repetir los 5 test anteriores para el segundo constructor
    @Test
    public void test6(){
        Matricula matricula = new Matricula(1234,'X','Y','Z');
        assertEquals(1234,matricula.numero);
        assertEquals("XYZ",matricula.letras);
    }
    @Test
    public void test7(){
        Matricula matricula = new Matricula(1234567,'X','Y','Z');
        assertEquals(1234,matricula.numero);
        assertEquals("XYZ",matricula.letras);

    }
    @Test
    public void test8(){
        Matricula matricula = new Matricula(-80,'U','F','R');
        assertEquals(1234,matricula.numero);
        assertEquals("UFR",matricula.letras);
    }
    @Test
    public void test9(){
        Matricula matricula = new Matricula(1562,'%','-','A');
        assertEquals(1562,matricula.numero);
        assertEquals("ABC",matricula.letras);

    }

    @Test
    public void test10(){
        Matricula matricula = new Matricula(98650,'Y','*','A');
        assertEquals(1234,matricula.numero);
        assertEquals("ABC",matricula.letras);
    }
    //  Repetir los 5 test anteriores para el tercer constructor
    @Test
    public void test11(){
        Matricula matricula = new Matricula();
        assertEquals(1234,matricula.numero);
        assertEquals("ABC",matricula.letras);

    }
    //  Repetir los 5 test anteriores para el cuarto constructor






}