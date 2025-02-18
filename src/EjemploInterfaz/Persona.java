package EjemploInterfaz;

public class Persona implements Nadador,Saltador{
    @Override
    public void nadar() {
        System.out.println("la persona esta nadando");
    }

    @Override
    public void sumergirse(int profundiad) {
        System.out.println("la persona se sumerge a "+profundiad+" metros");
    }

    @Override
    public void saltar() {
        System.out.println("La persona ha saltado");

    }
}
