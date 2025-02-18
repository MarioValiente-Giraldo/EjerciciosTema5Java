package Ejercicio15;

import java.time.LocalDate;

public class MarcadorBaloncesto {
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;
    //Primer constructor
    public MarcadorBaloncesto(String nL, String nV){
        this(nL,0,nV,0,LocalDate.now());
    }
    //Segundo constructor
    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
        this(nL,0,nV,0,f);
    }
    //Tercer constructor
    public MarcadorBaloncesto(String nL, int pL, String nVI, int pV, LocalDate fecha){

        this.nombreLocal = nL;
        this.nombreVisitante = nVI;
        this.fecha = fecha;
        this.puntosLocal = pL;
        this.puntosVisitante = pV;
    }
    public void añadirCanasta(char equipo, int puntos){
       if (puntos == 1 || puntos == 2 || puntos == 3) {
           if (equipo == 'L') {
               this.puntosLocal = puntosLocal + puntos;
           } else if (equipo == 'V') {
               this.puntosVisitante = puntosVisitante + puntos;
           }
       }
    }
    public void reset(){
        this.puntosVisitante = 0;
        this.puntosLocal = 0;

    }
    public int getPuntosLocal(){
        return this.puntosLocal;
    }
    public int getPuntosVisitante(){
        return this.puntosVisitante;
    }
    public boolean ganaLocal(){
        if (this.puntosLocal>this.puntosVisitante){
            return true;
        }else {
            return false;
        }
    }
    public boolean ganaVisitante(){
        if (this.puntosVisitante>this.puntosLocal){
            return true;
        }else {
            return false;
        }
    }
    public boolean hayEmpate(){
        if (this.puntosVisitante==this.puntosLocal){
            return true;
        }else {
            return false;
        }
    }

}
