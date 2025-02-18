package EjemploRecord;

public record Alumno(int numeroMatricula,String nombre, int edad,String direccion, boolean repetir) {
    public Alumno{
        if (edad<0){
            throw new IllegalArgumentException("No se puede introducir la edad negativa");
        }
    }
}
