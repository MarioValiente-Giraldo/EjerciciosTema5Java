package Ejercicio28;

public class Matricula {
    public static  int siguienteNúmeroMatrícula = 1;
    private  int númeroMatrícula;
    private String nombreAlumno;
    private String nombreAsignatura;


    public Matricula (String nombreAlumno,String nombreAsignatura){
        this.nombreAlumno = nombreAlumno;
        this.nombreAsignatura = nombreAsignatura;
        this.númeroMatrícula = Matricula.siguienteNúmeroMatrícula++;
    }
    public String getNombreAlumno(){
        return this.nombreAlumno;
    }
    public String getNombreAsignatura(){
        return this.nombreAsignatura;
    }
    public int getNúmeroMatrícula(){
        return this.númeroMatrícula;
    }

}
