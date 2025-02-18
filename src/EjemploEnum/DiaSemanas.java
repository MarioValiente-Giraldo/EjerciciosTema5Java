package EjemploEnum;

import Ejercicio6.Punto;

public enum DiaSemanas {
    LUNES(false), MARTES(false), MIERCOLES(false), JUEVES(false), VIERNES(false), SABADO(true), DOMINGO(true);
    private boolean esFinde;
    private DiaSemanas(boolean f){
        this.esFinde = f;
    }
    public boolean esFinde(){
        return this.esFinde ;
        //||this.equals(DiaSemanas.SABADO) || this.equals(DiaSemanas.DOMINGO);
    }


}
