package Ejercicio11.test;

import Ejercicio11.Oficina;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class OficinaTest {
    @Test
    public void test1(){
        Oficina oficina = new Oficina("Oficina");
        oficina.añadirEmpleado("Antonio","44444444M",2000, LocalDate.now());
        assertEquals(1,oficina.trabajadores.size());
        assertEquals('M',oficina.trabajadores.get(0).dni.letra);
        assertEquals(44444444,oficina.trabajadores.get(0).dni.numero);
    }

}