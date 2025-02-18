package Ejercicio27.test;

import Ejercicio27.Oficina;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OficinaTest {
    @Test
    public void test(){
        List<Oficina> listaOficinas = new ArrayList<>();
        Oficina oficina0 = Oficina.getOficinaVacia();
        Oficina oficina1 = Oficina.getOficinaPequeña();
        Oficina oficina2= Oficina.getOficinaMedina();
        Oficina oficina3 = Oficina.getOficinaGrande();

        listaOficinas.add(oficina0);
        listaOficinas.add(oficina1);
        listaOficinas.add(oficina2);
        listaOficinas.add(oficina3);

        for (int i = 0;i< listaOficinas.size();i++){
            assertEquals(i,listaOficinas.get(i).getTotalEmpleados());
        }

    }

}