package Ejercicio45.test;

import Ejercicio42.TipoCanasta;
import Ejercicio42.TipoEquipo;
import Ejercicio43.MarcadorFacil;
import Ejercicio44.Equipo;
import Ejercicio45.MarcadorDefinitivo;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarcadorDefinitivoTest {
    @Test
    public void test1(){
        MarcadorDefinitivo marcadorDefinitivo = new MarcadorDefinitivo("Granada","Estudianres");
        Equipo equipoLocal = new Equipo(marcadorDefinitivo.getNombreEquipo(TipoEquipo.LOCAL), marcadorDefinitivo.getPuntos(TipoEquipo.LOCAL));
        Equipo equipoVisitante = new Equipo(marcadorDefinitivo.getNombreEquipo(TipoEquipo.VISITANTE), marcadorDefinitivo.getPuntos(TipoEquipo.VISITANTE));
        for (int i = 0; i<5; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.LOCAL,TipoCanasta.TIRO_LIBRE);
        }
        for (int i = 0; i<8; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.LOCAL,TipoCanasta.CANASTA_NORMAL);

        }
        for (int i = 0; i<4; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.LOCAL,TipoCanasta.TRIPLE);
        }


        for (int i = 0; i<3; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.VISITANTE,TipoCanasta.TIRO_LIBRE);
        }
        for (int i = 0; i<10; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.VISITANTE,TipoCanasta.CANASTA_NORMAL);
        }
        for (int i = 0; i<1; i++) {
            marcadorDefinitivo.añadirCanasta(TipoEquipo.VISITANTE,TipoCanasta.TRIPLE);
        }
        assertEquals(33,marcadorDefinitivo.getPuntos(TipoEquipo.LOCAL));
        assertEquals(26,marcadorDefinitivo.getPuntos(TipoEquipo.VISITANTE));

    }
}