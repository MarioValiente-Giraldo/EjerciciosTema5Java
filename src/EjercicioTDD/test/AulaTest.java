package EjercicioTDD.test;

import EjercicioTDD.Aula;
import org.junit.Test;

import static org.junit.Assert.*;

public class AulaTest {
    @Test
    public void test1(){
    Aula aula = new Aula("1ºdam","Pepe",5,10);
    assertEquals("1ºdam",aula.nombre);
    assertEquals("Pepe",aula.profesor);
    }
    @Test
    public void test2(){
        Aula aula = new Aula("1ºdaw","Antonio",5,10);
        assertEquals(60,aula.area);
    }
    @Test
    public void test3() {
        Aula aula  = new Aula(null,null,4,6);
        assertEquals("profesor sin determinar",aula.profesor);
        assertEquals("aula sin determinar",aula.nombre);
    }
    @Test
    public void test4(){
        Aula aula  = new Aula("1ºsmr","Jose",8,4);
        assertEquals(32,aula.numeroAsientos);
    }
    @Test
    public void test5(){
        Aula aula  = new Aula("2ºdaw","Manolo",-3,5);
        assertEquals(35,aula.area);
    }
    @Test
    public void test6(){
        Aula aula  = new Aula(null,null);
        assertEquals("1ºdaw",aula.nombre);
        for (int i = 0; i< aula.asientos.length;i++){
            for (int j = 0; j<aula.asientos[i].length;j++){
                assertEquals("Menganito",aula.asientos[i][j]);
            }
        }
    }
    @Test
    public void test7(){
        Aula aula  = new Aula(3,3,2,0);
        assertEquals(null,aula.profesor);
        assertEquals(null,aula.nombre);
    }
    @Test
    public void test8(){
        Aula aula  = new Aula(3,3,2,0);
        assertEquals("Menganito",aula.asientos[2][0]);
    }
    @Test
    public void test9(){
        Aula aula  = new Aula(3,3,6,3);
        for (int x = 0; x < aula.asientos.length; x++){
            for (int y = 0; y <aula.asientos[x].length; y++){
                assertEquals(null,aula.asientos[x][y]);
            }
        }
    }

}