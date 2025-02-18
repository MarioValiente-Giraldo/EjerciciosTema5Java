package EjemploInterfaz;

import java.util.Scanner;

public class Main {
    public static void  main(String[]args){
        System.out.println("""
                Elige un personaje:
                1. Pulpo
                2. Personaje
                3. Delfín
                """);
        int opcion = new Scanner(System.in).nextInt();
        Nadador nadador = switch (opcion){
            case 1 -> new Pulpo();
            case 2 -> new Persona();
            case 3 -> new Delfin();
            default -> throw new IllegalArgumentException("Opcion incorrecta");
        };
        nadador.nadar();
        nadador.sumergirse(7);
        Saltador [] saltadors = {new Delfin(), new Persona(), new Persona()};
        for (int i = 0; i< saltadors.length; i++){
            saltadors[i].saltar();
        }
    }
}
