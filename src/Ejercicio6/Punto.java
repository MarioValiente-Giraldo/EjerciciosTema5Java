package Ejercicio6;

import java.awt.*;

public class Punto {
    public int x;
    public int y;

    public Punto (){
    this(0,0);
    }
    public Punto (int x,int y){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int w = dimension.width;
        int h = dimension.height;
        if ((x<0 || x>w ||y<0 ||y>h)){
            this.x = w;
            this.y = h;

        } else {
            this.x = x;
            this.y = y;
        }
    }
    public Punto (Punto p){
        this(p.x/2, p.y/2);

    }
    public Punto (double angulo, double distancia){
        this((int)(distancia*(Math.cos(Math.toRadians(angulo)))),(int)(distancia*(Math.sin(Math.toRadians(angulo)))));

    }
}
