package Ejercicio18.test;

import Ejercicio18.MarcadorBaloncesto;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MarcadorBaloncestoTest {
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test1fallo(){
        LocalDate localDate = LocalDate.now();
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada",10,"Estudiantes",12,localDate);
        marcadorBaloncesto.añadirCanasta('J',4);
        fail("No se ha lanzado el error IllegalArgumentException deseado");

    }
}

