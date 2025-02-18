package Ejercicio12.test;

import Ejercicio10.CuentaCorriente;
import Ejercicio12.Persona;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonaTest {
    @Test
    public void test1() {
        Persona persona = new Persona("Juan", 11111111, 'H', 1500, LocalDate.of(2003, 04, 23), new CuentaCorriente());
        assertEquals(0,persona.getCuenta().saldo,0.1);
        persona.cobrarSueldo();
        persona.cobrarSueldo();
        persona.cobrarSueldo();
        assertEquals(4500,persona.getCuenta().saldo,0.1);
        persona.aumentarSueldo(25);
        persona.cobrarSueldo();
        assertEquals(6375,persona.getCuenta().saldo,0.1);

    }
    @Test
    public void test2(){
        Persona persona = new Persona("Juan", 11111111, 'H', 1500, LocalDate.of(2007, 1, 23), new CuentaCorriente());
        assertFalse(persona.esMayorEdad());
    }
    @Test
    public void test3(){
        Persona persona = new Persona("Juan", 11111111, 'H', 1500, LocalDate.of(1983, 1, 23), new CuentaCorriente());
        assertTrue(persona.esMayorEdad());
    }
    @Test
    public void test4(){
        Persona persona = new Persona("Juan", 11111111, 'H', 1500, LocalDate.of(1983, 1, 23), new CuentaCorriente());
        assertFalse(persona.tieneDinero());

    }
    @Test
    public void test5(){
        Persona persona = new Persona("Juan", 11111111, 'H', 900, LocalDate.of(1983, 1, 23), new CuentaCorriente());
        assertTrue(persona.esMayorEdad());

    }  @Test
    public void test6(){
        Persona persona = new Persona("Juan", 11111111, 'H', 1800, LocalDate.of(1983, 1, 23), new CuentaCorriente());
        assertTrue(persona.esMayorEdad());

    }
}