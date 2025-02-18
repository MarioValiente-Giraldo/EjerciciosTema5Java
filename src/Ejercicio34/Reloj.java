package Ejercicio34;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reloj {
    private LocalTime hora;

    public Reloj(LocalTime h) {
        this.hora = h;
    }

    public Reloj() {
        this.hora = LocalTime.now();
    }

    public LocalTime getHora() {
        return this.hora;
    }
    public void añadir(int segundos){
      this.hora=  this.hora.plusSeconds(segundos);
    }
    public boolean esNoche(){
        if (this.hora.isAfter(LocalTime.of(19,59,59)) || this.hora.isBefore(LocalTime.of(8,0,0))){
            return true;
        }else {
            return false;
        }
    }
    public void esperar(int segundos){
        long milisegundos=segundos*1000;
        try {
            Thread.sleep(milisegundos);

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        this.añadir(segundos);
    }
    public String toString (){
         return this.hora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

}
