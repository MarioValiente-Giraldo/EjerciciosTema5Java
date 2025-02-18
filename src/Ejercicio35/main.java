package Ejercicio35;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

public class main {
    public static void main(String[] args) {
        Consola consola = new Consola();
        Teclado teclado = consola.getTeclado();
        teclado.setTipoCursor(Teclado.CURSOR_NULO);
        CapaTexto capaTexto = consola.getCapaTexto();

        boolean repetir = true;
        while (repetir) {
            capaTexto.println("Introduce un número del 1 al 5");
            int opcion = teclado.leerNumeroEntero();
            if (opcion<1 || opcion>5){
                capaTexto.println("Introduce uno de los valores definidos");
            }else {
                opcion--;
                capaTexto.println("Introduce una palabra");
                String texto = teclado.leerCadenaCaracteres();
                Bolígrafo bolígrafo = new Bolígrafo(capaTexto);
                bolígrafo.setColor(opcion);
                bolígrafo.escribir(texto);
                capaTexto.println("");
                repetir=false;
                bolígrafo.escribirGuay(texto);
            }
        }

        teclado.leerCaracter();

    }
}
