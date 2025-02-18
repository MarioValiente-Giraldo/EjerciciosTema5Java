package Ejercicio35;
import bpc.daw.consola.*;

import java.awt.*;


public class Bolígrafo {
    private static final Color [] COLORES = {Color.red,Color.green,Color.blue,Color.white,Color.yellow};
    private int color;
    private CapaTexto ct;
    public Bolígrafo (CapaTexto ct){
        this.color = 0;
        this.ct = ct;
    }
    public void setColor(int n){
        this.color = n;
        if  (n<0|| n>=Bolígrafo.COLORES.length){
            throw new IllegalArgumentException("Has introducido un valor erroneo");
        }

    }
    public void escribir(String texto){
        this.ct.setColorTexto(Bolígrafo.COLORES[this.color]);
        this.ct.println(texto);
    }
    public void escribirGuay(String texto){
      int posicionColor = 0;
      for (int i = 0; i<texto.length(); i++){
          if (posicionColor>4){
              posicionColor = 0;
          }
          char x = texto.charAt(i);
          this.ct.setColorTexto(Bolígrafo.COLORES[posicionColor]);
          this.ct.print(String.valueOf(x));
          posicionColor++;


      }

    }


}
