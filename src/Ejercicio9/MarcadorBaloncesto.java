package Ejercicio9;

import java.time.LocalDate;

public class MarcadorBaloncesto {
    public String nombreLocal;
    public String nombreVisitante;
    public int puntosLocal;
    public int puntosVisitante;
    public LocalDate fecha;
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
}
