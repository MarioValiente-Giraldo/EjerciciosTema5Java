package Ejercicio43;

import Ejercicio42.TipoCanasta;
import Ejercicio42.TipoEquipo;

public interface MarcadorBaloncesto {
    public abstract void añadirCanasta(TipoEquipo e, TipoCanasta t);
    public abstract String getNombreEquipo(TipoEquipo e);
    public abstract int getPuntos (TipoEquipo e);
    public default String getMarcador(){
       return this.getNombreEquipo(TipoEquipo.LOCAL)+" "+this.getPuntos(TipoEquipo.LOCAL)+ " - " +this.getNombreEquipo(TipoEquipo.VISITANTE)+ " " +this.getPuntos(TipoEquipo.VISITANTE);
    }

}
