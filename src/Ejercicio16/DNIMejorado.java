package Ejercicio16;

public class DNIMejorado {
    private int número;
    private char letra;
    public DNIMejorado (int n){
        this.número = n;
        this.letra = calcularLetra(n);
    }
    public int getNúmero(){
        return this.número;
    }
    public char getLetra(){
        return this.letra;
    }
    private char calcularLetra(int n){
        char letrasDNI [] ={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'};
        int posicionLetraDNI = n%23;
        return letrasDNI[posicionLetraDNI];

    }


}
