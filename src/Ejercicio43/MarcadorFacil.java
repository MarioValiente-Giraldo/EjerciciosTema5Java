package Ejercicio43;

import Ejercicio42.TipoCanasta;
import Ejercicio42.TipoEquipo;

public class MarcadorFacil implements MarcadorBaloncesto {
    private String nombreEquipoLocal;
    private String nombreEquipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    public MarcadorFacil(String local,String visitante){
        this.nombreEquipoLocal=local;
        this.nombreEquipoVisitante=visitante;
        this.puntosLocal= 0;
        this.puntosVisitante = 0;
    }
    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        if (e == TipoEquipo.LOCAL){
            this.puntosLocal += t.getValor();
        }else if ( e == TipoEquipo.VISITANTE){
            this.puntosVisitante += t.getValor();
        }
    }
    @Override
    public String getNombreEquipo(TipoEquipo e) {
        String resultado = "";
        if(e == TipoEquipo.LOCAL){
           resultado = this.nombreEquipoLocal;
        } else if (e == TipoEquipo.VISITANTE) {
            resultado = this.nombreEquipoVisitante;
        }
        return resultado;
    }
    @Override
    public int getPuntos(TipoEquipo e) {
        int resultado = 0;
        if(e == TipoEquipo.LOCAL){
            resultado = this.puntosLocal;
        } else if (e == TipoEquipo.VISITANTE) {
            resultado = this.puntosVisitante;
        }
        return resultado;
    }
}
