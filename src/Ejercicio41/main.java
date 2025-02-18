package Ejercicio41;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Creación de empleados
        Empleado antonio = new Empleado("Antonio");
        Empleado juan = new Empleado("Juan");
        Empleado paco = new Empleado("Paco");
        Empleado alberto = new Empleado("Alberto");
        Empleado diego = new Empleado("Diego");
        Empleado rafa = new Empleado("Rafa");
        Empleado ricardo = new Empleado("Ricardo");
        Empleado patricia = new Empleado("Patricia");
        Empleado manuel = new Empleado("Manuel");
        Empleado mariaJose = new Empleado("María José");
        Empleado valentin = new Empleado("Valentín");
        Empleado gema = new Empleado("Gema");

        antonio.subordinados().add(juan);
        antonio.subordinados().add(paco);
        antonio.subordinados().add(alberto);

        juan.subordinados().add(diego);
        paco.subordinados().add(rafa);
        paco.subordinados().add(ricardo);
        alberto.subordinados().add(patricia);

        rafa.subordinados().add(manuel);
        rafa.subordinados().add(mariaJose);

        mariaJose.subordinados().add(valentin);
        mariaJose.subordinados().add(gema);

        antonio.mostrarSubordinados();
    }
}
