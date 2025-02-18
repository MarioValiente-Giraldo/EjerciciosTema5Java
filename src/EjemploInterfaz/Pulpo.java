package EjemploInterfaz;

public class Pulpo implements Nadador{
    @Override
    public void nadar() {
        System.out.println("El pulpo está nadando");;
    }
    @Override
    public void sumergirse(int profundiad) {
        System.out.println("El pulpo se sumerge a "+profundiad+" metros");

    }
}
