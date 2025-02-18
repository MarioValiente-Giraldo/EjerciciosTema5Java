package EjercicioTDD;

public class Aula {
    public String nombre;
    public String profesor;
    public String [][] asientos;
    public int area;
    public int numeroAsientos;

    public Aula(String n,String p, int numeroFilas,int numeroColumnas){

        this.nombre = n !=null? n:"aula sin determinar";
        this.profesor = p!=null? p:"profesor sin determinar";
        if (numeroFilas<0 || numeroColumnas<0){
            numeroFilas =5;
            numeroColumnas=5;
        }
        this.asientos = new String[numeroFilas][numeroColumnas];
        this.numeroAsientos = numeroFilas*numeroColumnas;
        this.area = numeroAsientos + 10;
    }
    public Aula (String n,String p){

        this.nombre = n!=null? n:"1ºdaw";
        this.profesor=p;
        this.asientos = new String[3][2];

        for (int i = 0; i<asientos.length;i++){
            for (int j = 0; j<asientos[i].length;j++){
                asientos[i][j]="Menganito";
            }
        }
    }
    public Aula(int nf, int nc, int i,int j){
        this.nombre = null;
        this.profesor = null;
        this.asientos = new String[nf][nc];
        if (i<this.asientos[0].length && i>=0 && j<this.asientos[0].length && j>=0){
           asientos[i][j]="Menganito";
        }
    }
}
