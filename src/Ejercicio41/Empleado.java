package Ejercicio41;

import java.util.ArrayList;
import java.util.List;

public record Empleado(String nombre, List<Empleado> subordinados) {
    public Empleado(String nombre){
        this(nombre,new ArrayList<>());
    }
    public void mostrarSubordinados(){
        System.out.println(this.nombre);
        this.mostrarSubordinados(1);
    }
    private void mostrarSubordinados(int tabs){
        //Bucle creado para crear el número de Tabs indicado
        String guiones = "";
        for (int i = 0;i<tabs;i++){
            guiones+="-";
        }
        //Bucle que recorre los subordinados del empleado, que a su vez recorre los subordinados de los subordinados
        for (Empleado x :subordinados){
            System.out.println(guiones+x.nombre);
            x.mostrarSubordinados(tabs+1);
        }
    }
}
