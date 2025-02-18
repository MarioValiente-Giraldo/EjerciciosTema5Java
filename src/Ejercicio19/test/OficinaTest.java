package Ejercicio19.test;

import Ejercicio10.CuentaCorriente;
import Ejercicio12.Persona;
import Ejercicio19.Oficina;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;

import static org.junit.Assert.*;

public class OficinaTest {
    @Test
    public void test1(){
        Oficina oficina = new Oficina("Oficina",0);
        oficina.añadirEmpleado(new Persona("Carmen",11111111,'H',1000, LocalDate.now(),new CuentaCorriente()));
        oficina.añadirEmpleado(new Persona("Pepe",12345678,'J',2000, LocalDate.now(),new CuentaCorriente()));
        oficina.añadirEmpleado(new Persona("Paco",11223344,'G',1500, LocalDate.now(),new CuentaCorriente()));
        oficina.añadirEmpleado(new Persona("Mario",99887766,'M',900, LocalDate.now(),new CuentaCorriente()));
        try {
           assertEquals(1350,oficina.getSueldoMedio(),0.1);

        }catch (IOException e){
            System.out.println(e.getMessage());
            fail("No se ha lanzado el error esperado");

        }

    }

    @Test (expected = java.io.IOException.class)
    public void testfallo()throws IOException{
        Oficina oficina = new Oficina("Hola",0);

          double x =  oficina.getSueldoMedio();
          fail("No se ha lanzado la excepción esperada");


    }



}