package Ejercicio31.test;

import Ejercicio31.Altavoz;
import Ejercicio31.EquipoMusica;
import org.junit.Test;

import static org.junit.Assert.*;

public class EquipoMusicaTest {
    @Test
    public void tet1(){
        EquipoMusica equipoMusica = new EquipoMusica(5);
        for (int i = 0;i<5; i++) {
            assertEquals(0, equipoMusica.getAltavoz(i).getVolumen());
        }
    }
    @Test
    public void test2(){
        EquipoMusica equipoMusica = new EquipoMusica(10);
        for (int i = 0; i<10;i++){
            if (i%2==0){
                equipoMusica.setVolumen(i,Altavoz.VOL_MAX);
                assertEquals(Altavoz.VOL_MAX,equipoMusica.getAltavoz(i).getVolumen());
            }else {
                equipoMusica.setVolumen(i,50);
                assertEquals(50,equipoMusica.getAltavoz(i).getVolumen());
            }
        }
    }
}