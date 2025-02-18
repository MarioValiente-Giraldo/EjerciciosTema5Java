package EjemploMatricula;

import java.util.Random;

public class Matricula {
    public int numero;
    public String letras;

    public Matricula (int n,String m){ //CONSTRUCTOR PRINCIPAL
        this.numero = (n>0 && n<9999)? n:1234;
        this.letras =(m.matches("[A-Z]{3}"))? m:"ABC";
    }

    public Matricula (int n,char d1,char d2, char d3){
        this(n,""+d1+d2+d3);


    }

    public Matricula (){
       this(1234,"ABC");
    }

    public Matricula (String m){
        this(new Random().nextInt(0,10000),m);

    }
}
