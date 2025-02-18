package Ejercicio44.test;

import Ejercicio42.TipoCanasta;
import Ejercicio44.Equipo;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquipoTest {
    @Test
    public void test1(){
        TipoCanasta [] tipoCanastas = TipoCanasta.values();
        for (TipoCanasta x : tipoCanastas){
            Equipo equipo = new Equipo("HLanz Basket",x.getValor());
            assertEquals(equipo.puntos(),x.getValor());
        }
    }

}