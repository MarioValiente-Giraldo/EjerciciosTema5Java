package mvg.programacion.tema5;

import java.awt.*;

public class Programa {
    public static void main(String[] args) {
        Perro x = new Perro("Gonzalo",3,"Caniche");
        System.out.println(x.getNombre()+"  "+x.getEdad()+"  "+x.getRaza());
        System.out.println(x.getPosicion());




    }
}
