package Ejercicio21.test;

import Ejercicio21.MarcadorBaloncesto;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class MarcadorBaloncestoTest {
    @Test
    public void test1() {
        LocalDate localDate = LocalDate.now();
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada",12,"Estudiantes",8,localDate);
        try {
            marcadorBaloncesto.guardar("text.txt");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}