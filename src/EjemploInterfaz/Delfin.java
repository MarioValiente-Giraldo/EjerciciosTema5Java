package EjemploInterfaz;

public class Delfin implements Saltador,Nadador{
    @Override
    public void nadar() {
        System.out.println("El delfín está nadando");
    }

    @Override
    public void sumergirse(int profundiad) {
        System.out.println("El delfín se sumerge a "+profundiad+" metros");
    }

    @Override
    public void saltar() {
        System.out.println("El delfín ha saltado");
    }
}
