package Ejercicio39;

public interface Adinerado {
    public static final int TRANSFERENCIA_MINIMA = 1526;
    public abstract double getDineroTotal();
    public abstract boolean añadirDinero(int cantidad);
    public abstract boolean retirarDinero (int cantidad);
    public default boolean tieneDinero(){
        return getDineroTotal()>0;
    }
    public default boolean transferirHacia(Adinerado receptor,double cantidad){
        if (cantidad>=Adinerado.TRANSFERENCIA_MINIMA && this.getDineroTotal()>cantidad){
            if (this.retirarDinero((int) cantidad)) {
                return receptor.añadirDinero((int) cantidad);
            }
        }
            return false;

    }
    public default boolean transferirDesde(Adinerado emisor,double cantidad){
        if (cantidad >= Adinerado.TRANSFERENCIA_MINIMA && cantidad <= emisor.getDineroTotal()) {
            if (emisor.retirarDinero((int) cantidad)) {
                return this.añadirDinero((int) cantidad);
            }
        }
        return false;
    }
    public static boolean transferir(Adinerado emisor, Adinerado receptor, double cantidad){
        return emisor.transferirHacia(receptor, cantidad);

    }

}
