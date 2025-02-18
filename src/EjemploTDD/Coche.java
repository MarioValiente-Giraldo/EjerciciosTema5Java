package EjemploTDD;

import java.security.PublicKey;
import java.util.Random;

public class Coche {
    public String matricula;
    public String marca;
    public int velocidad;
    public Coche(String matricula, String marca, int v){
        this.matricula = matricula;
        this.marca = marca;
        this.velocidad = v>=0? v:0;
    }
    public Coche(String marca){
        this.marca=marca;
        int num = new Random().nextInt(1111,10000);
        this.matricula = num+"XYZ";
        this.velocidad = 0;
    }
    public void setVelocidad(int v){
        this.velocidad = v>0? v:100;
    }
    public void detener (){
        this.velocidad = 0;
    }
    public void matricular (String m) {

        if (m.matches("\\d{4}[A-Z]{3}")) {
            this.matricula = m;
        }else {
            this.matricula = "1234ABC";
        }
    }
    public void matricular (String numero, char[] letras) {
        letras = new char[3];
        if (numero.matches("\\d{4}")){
            String matriculaAux = "";
                for (int i = 0; i<letras.length; i++){
                     matriculaAux = numero+letras[i];
                }
                if (matriculaAux.matches("\\d{4}[A-Z]{3}")){
                    this.matricula =matriculaAux ;
                }else {
                    this.matricula = "1234ABC";
                }
            }
        }
        public void setMarca (String m) {
            String[] marcas = {"Ferrari", "BMW", "Audi", "Mercedes", "Toyota", "Skoda", "Nissan", "Renault"};
            for (int i = 0; i< marcas.length; i++){
                if (marcas[i].toLowerCase().equals(m)){
                this.marca = m;
                }else {
                    this.marca = "DESCONOCIDO";
                }
            }
        }
    }


