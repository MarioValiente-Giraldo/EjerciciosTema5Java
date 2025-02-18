package Ejercicio14.test;

import Ejercicio10.CuentaCorriente;
import Ejercicio12.Persona;
import Ejercicio14.Oficina;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OficinaTest {
    @Test
    public void test1(){
        Oficina oficina = new Oficina("Oficina");
        oficina.añadirEmpleado("Antonio","44444444M",2000, LocalDate.now());
        assertEquals(1,oficina.getTotalEmpleados());

    }
    @Test
    public void test2(){
        Oficina oficina = new Oficina("Oficina",0);
        Persona persona1 = new Persona("Empleado1",11111111,'A',1000,LocalDate.now(),new CuentaCorriente());
        Persona persona2 = new Persona("Empleado2",22222222,'B',2000,LocalDate.now(),new CuentaCorriente());

        oficina.añadirEmpleado(persona1);
        oficina.añadirEmpleado(persona2);

        assertTrue(oficina.trabaja(persona1));
        assertTrue(oficina.trabaja(persona2));
        persona1.cobrarSueldo();
        persona2.cobrarSueldo();
        assertEquals(1000,persona1.getCuenta().saldo,0.1);
        assertEquals(2000,persona2.getCuenta().saldo,0.1);

    }

}