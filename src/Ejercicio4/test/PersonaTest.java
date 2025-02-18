package Ejercicio4.test;

import Ejercicio1.DNI;
import Ejercicio4.Persona;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class PersonaTest {
@Test
    public void test1() {
    DNI dni = new DNI(12345678,'B');
    Persona persona = new Persona("Pepe",dni,1500.0, LocalDate.of(2007,3,8));
    assertEquals("Pepe",persona.nombre);
    assertEquals(12345678,dni.numero);
    assertEquals('B',dni.letra);
    assertEquals(1500,persona.sueldo,0.1);
    assertEquals(LocalDate.of(2007,3,8),persona.fechaNacimiento);
    }
    @Test
    public void test1V2(){
        Persona persona = new Persona("Pepe",12345678,'B',1500, LocalDate.of(2007,3,8));
        assertEquals("Pepe",persona.nombre);
        assertEquals(12345678,persona.dni.numero);
        assertEquals('B',persona.dni.letra);
        assertEquals(1500,persona.sueldo,0.1);
        assertEquals(LocalDate.of(2007,3,8),persona.fechaNacimiento);
    }
    @Test
    public void test2 (){
    DNI dni = new DNI(88776655,'X');
    Persona persona = new Persona("Antonio",dni);
        assertEquals("Antonio",persona.nombre);
        assertEquals(88776655,dni.numero);
        assertEquals('X',dni.letra);
        assertEquals(900,persona.sueldo,0.1);
        assertEquals(LocalDate.now().minusYears(20),persona.fechaNacimiento);

    }
    @Test
    public void test2V2 () {
        Persona persona = new Persona("Antonio", 88776655, 'X');
        assertEquals("Antonio",persona.nombre);
        assertEquals(88776655,persona.dni.numero);
        assertEquals('X',persona.dni.letra);
        assertEquals(900,persona.sueldo,0.1);
        assertEquals(LocalDate.now().minusYears(20),persona.fechaNacimiento);



    }

}
