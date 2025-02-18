package mvg.programacion.tema5.test;

import mvg.programacion.tema5.Perro;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerroTest {
@Test
    public void Test1(){
    Perro p = new Perro("Angel",7,"Labrador");
    assertEquals("Angel",p.getNombre());
}
@Test
    public void Test2(){
    Perro perro = new Perro("Rex",5,"Labrador");
    perro.setNombre("Alfonso");
    assertEquals("Alfonso",perro.getNombre());
}
}