package Ejercicio32;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Bombo {
    private Queue<Bola> bolas;
    public Bombo(int totalBolas){
        ArrayDeque<Bola> x = new ArrayDeque<>();
        Random random = new Random();
        for (int i = 0; i<totalBolas; i++){
            int numeroAleatorio = random.nextInt(1,101);
            x.add(new Bola(numeroAleatorio));
        }
        this.bolas = x;
    }
    public int getNumeroBolas(){
        return this.bolas.size();
    }
    public Bola sacarBola(){
        return this.bolas.poll();
    }
}
