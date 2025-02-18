package Ejercicio38;

public class Monedero  implements Adinerado {
    private double dinero;

    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        if (this.dinero+cantidad>1000){
            return false;
        }else {
            this.dinero += cantidad;
            return true;
        }
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        if (cantidad>this.dinero) {
            return false;
        }else {
            this.dinero-=cantidad;
            return true;
        }
    }
    public Monedero(){
        this.dinero = 0.0;
    }
}
