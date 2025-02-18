package EjemploEnum;

public class main {
    public static void main(String[] args) {
        DiaSemanas dia = DiaSemanas.SABADO;
        DiaSemanas[] diaSemanas = DiaSemanas.values();
        for (DiaSemanas d : diaSemanas){
            System.out.println(d);
        }

        int sum = Operacion.SUMAR.realizaOperacion(10,10);
        System.out.println(sum);


    }
}
