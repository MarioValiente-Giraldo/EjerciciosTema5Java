package Ejercicio44;

import Ejercicio42.TipoCanasta;

public record Equipo(String nombre, int puntos) {
    public Equipo(String nombre){
        this(nombre,0);
    }
    public Equipo añadirCanasta(TipoCanasta t){
        return new Equipo(this.nombre,this.puntos+t.getValor());
    }

}
