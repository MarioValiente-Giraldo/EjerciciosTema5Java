package Ejercicio28.test;

import Ejercicio28.Matricula;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatriculaTest {
    @Test
    public void test() {
        Matricula matricula1 = new Matricula("Pepe", "Mates");
        Matricula matricula2 = new Matricula("Paco", "Lengua");
        Matricula matricula3 = new Matricula("Mario", "Historia");
        assertEquals(4,Matricula.siguienteNúmeroMatrícula);
    }


}