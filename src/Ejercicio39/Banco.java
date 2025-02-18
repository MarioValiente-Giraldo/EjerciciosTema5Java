package Ejercicio39;

public class Banco implements Adinerado {
    private double dinero;

    public Banco(){
        this.dinero = 0.0;
    }

    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        this.dinero+=cantidad;
        return true;
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
}
