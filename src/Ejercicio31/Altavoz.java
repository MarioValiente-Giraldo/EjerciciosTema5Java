package Ejercicio31;

public class Altavoz {
    public static final int VOL_MAX = 255;
    public static final int VOL_MIN = 0;
    private int volumen;

    public Altavoz(){
        this.volumen = Altavoz.VOL_MIN;
    }
    public  void ponerVolumenMaximo(){
        this.volumen = Altavoz.VOL_MAX;
    }
    public void setVolumen(int v) throws IllegalArgumentException{
        this.volumen = v;
        if (v<Altavoz.VOL_MIN){
            throw new IllegalArgumentException("No puedes poner el volumen con un número negativo");
        }
    }
    public int getVolumen(){
        return this.volumen;
    }
        public String toString(){
            int totalAsteriscos = 10;
            float porcentajeAsterisocs =(float) (getVolumen()*totalAsteriscos)/Altavoz.VOL_MAX;
            int numeroAsteriscos = Math.round(porcentajeAsterisocs);
            String barraVolumen ="["+this.getVolumen()+"]";
            for (int i = 0; i< numeroAsteriscos; i++){
                barraVolumen +='*';
            }
            for (int j = numeroAsteriscos; j<totalAsteriscos; j++){
                barraVolumen+='-';
            }
            return barraVolumen;

        }


}
