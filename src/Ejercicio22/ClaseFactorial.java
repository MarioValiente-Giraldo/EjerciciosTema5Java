package Ejercicio22;

public class ClaseFactorial {
    public int factorial(int n){
        if (n<0){
            throw new IllegalArgumentException("No se puede pasar un numero negativo");
        }
        if (n == 0){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}
