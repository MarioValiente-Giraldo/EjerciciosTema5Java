package Ejercicio48.test;

import Ejercicio48.Restaurante;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RestauranteTest {
    @Test
    public void test1(){
        Restaurante restaurante = new Restaurante("hola");
        assertEquals("hola",restaurante.getNombre());
        String [] platosComprobar = {"bocadillo", "filete", "sopa", "ensalada", "caviar"};
        for (int i = 0; i< platosComprobar.length;i++){
            assertEquals(true,restaurante.estaDisponible(platosComprobar[i]));
        }
    }
    @Test
    public void test2(){
        Restaurante restaurante = new Restaurante("hola");
        assertEquals(true,restaurante.estaDisponible("bocadillo"));
        assertEquals(true,restaurante.estaDisponible("filete"));
        assertEquals(true,restaurante.estaDisponible("sopa"));
    }
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test3(){
        Restaurante restaurante = new Restaurante("hola");
        restaurante.getPrecio("calamares");
        fail("No se ha lanzado la excepción esperada");
    }
    @Test
    public void test4(){
        Restaurante restaurante = new Restaurante("hola");
        assertFalse(restaurante.estaDisponible("calamares"));
    }
    @Test
    public void test5(){
        Restaurante restaurante = new Restaurante("hola");
        List<String>platosBaratos = restaurante.getPlatosBaratos();
        String [] platosComprobar = {"bocadillo", "filete", "sopa", "ensalada", "caviar"};
        List<String>platosCaros = new ArrayList<>();
        for (int i = 0; i< platosComprobar.length;i++){
            if (!platosBaratos.contains(platosComprobar[i])){
                platosCaros.add(platosComprobar[i]);
            }
        }
        assertEquals("filete",platosCaros.get(0));
        assertEquals("caviar",platosCaros.get(1));
    }
    @Test
    public void test6(){
        Restaurante restaurante = new Restaurante("Hola");
        String [] platosConsumidos = {"bocadillo","filete","caviar"};
        assertEquals(50,restaurante.getCuenta(platosConsumidos),0.01);
    }

}