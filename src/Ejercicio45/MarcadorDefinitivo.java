package Ejercicio45;

import Ejercicio42.TipoCanasta;
import Ejercicio42.TipoEquipo;
import Ejercicio43.MarcadorBaloncesto;
import Ejercicio44.Equipo;

public class MarcadorDefinitivo  implements MarcadorBaloncesto {
    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        if (e == TipoEquipo.LOCAL){
            this.local = this.local.añadirCanasta(t);
        } else if (e == TipoEquipo.VISITANTE) {
            this.visitante=this.visitante.añadirCanasta(t);
        }
    }

    @Override
    public String getNombreEquipo(TipoEquipo e) {
        String resultado = "";
        if (e == TipoEquipo.LOCAL){
            resultado = this.local.nombre();
        } else if (e == TipoEquipo.VISITANTE) {
            resultado = this.visitante.nombre();
        }
        return resultado;
    }

    @Override
    public int getPuntos(TipoEquipo e) {
        int resultado = 0;
        if (e == TipoEquipo.LOCAL){
            resultado = this.local.puntos();
        } else if (e == TipoEquipo.VISITANTE) {
            resultado = this.visitante.puntos();
        }
        return resultado;
    }
    private Equipo local;
    private Equipo visitante;
    public MarcadorDefinitivo(String local,String visitante){
        this.local = new Equipo(local,0);
        this.visitante = new Equipo(visitante,0);

    }

}
