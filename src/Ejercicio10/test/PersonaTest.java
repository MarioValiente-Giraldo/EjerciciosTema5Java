package Ejercicio10.test;

import Ejercicio10.CuentaCorriente;
import Ejercicio10.DNI;
import Ejercicio10.Persona;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;
public class PersonaTest {
    @Test
    public void test1() {
        Persona persona = new Persona("Juan", 11111111, 'H', 1500, LocalDate.of(2003, 04, 23), new CuentaCorriente());
        assertEquals(0,persona.cuenta.saldo,0.1);
        persona.cobrarSueldo();
        persona.cobrarSueldo();
        persona.cobrarSueldo();
        assertEquals(4500,persona.cuenta.saldo,0.1);
        persona.aumentarSueldo(25);
        persona.cobrarSueldo();
        assertEquals(6375,persona.cuenta.saldo,0.1);

    }
}