package Ejercicio38;

public class Banco implements Adinerado{
    private double dinero;
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
        boolean aux = true;
        if (cantidad>this.dinero) {
            aux= false;
        }else {
            this.dinero-=cantidad;
        }
        return aux;
    }
    public Banco(){
        this.dinero = 0.0;
    }
}
