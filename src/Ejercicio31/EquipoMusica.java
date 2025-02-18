package Ejercicio31;

import Ejercicio31.Altavoz;

public class EquipoMusica {
    private Altavoz [] altavoces;
    public EquipoMusica(int numeroAltavoces){
        this.altavoces = new Altavoz[numeroAltavoces];
        for (int i = 0; i<altavoces.length;i++){
            altavoces[i]=new Altavoz();
        }
    }
    public Altavoz getAltavoz (int posicion){
        return altavoces[posicion];
    }
    public void setVolumen (int numeroAltavoz, int volumen){
        altavoces[numeroAltavoz].setVolumen(volumen);
    }

}
