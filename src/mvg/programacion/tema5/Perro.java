package mvg.programacion.tema5;

import javax.swing.text.Position;
import java.awt.*;
import java.lang.ref.PhantomReference;

public class Perro {
    //variables de instancia
    private String nombre;
    private int edad;
    private String raza;
    private Point posicion;
    private boolean hambriento;

    public  Perro(String n, int e,String r) {
    this.nombre = n;

    this.edad = e>0? e:1;

    this.raza = r;
    this.posicion = new Point(0,0);
    this.hambriento = false;
    }
    public Perro (String n, int e, String r, Point p, boolean h){
        this.nombre =n;
        this.edad = e;
        this.raza = r;
        this.posicion = p;
        this.hambriento = h;

    }
    public Perro (String n, int e, String r,int x,int y, boolean h){
        this.nombre =n;
        this.edad = e;
        this.raza = r;
        this.posicion = new Point(x,y);
        this.hambriento = h;

    }
    public void  setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    //getter
    public String getNombre(){
        return this.nombre;
    }
    public int  getEdad(){
        return this.edad;
    }
    public String getRaza (){
        return this.raza;

    }
    public Point getPosicion(){
        return this.posicion;
    }

}
