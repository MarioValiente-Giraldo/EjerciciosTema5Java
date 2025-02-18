package Ejercicio40;

public record DepositoAguaInmutable(int capacidadActual, int capacidadMaxima) {
    public DepositoAguaInmutable{
        if (capacidadActual<0 || capacidadMaxima<0){
            throw new IllegalArgumentException("No se puede introducir números negativos en los valores");
        }
        if (capacidadMaxima<capacidadActual){
            throw new IllegalArgumentException("La capacidad máxima no puede ser menor a la capacidad actual");

        }

    }
    public DepositoAguaInmutable(int capacidadMaxima){
        this(0,capacidadMaxima);
    }
    public DepositoAguaInmutable añadirLitro(){
        return new DepositoAguaInmutable(this.capacidadActual+1,this.capacidadMaxima);
    }
    public DepositoAguaInmutable retirarLitro(){
        return new DepositoAguaInmutable(this.capacidadActual-1,this.capacidadMaxima);
    }
    public int getPorcentaje(){
        return (this.capacidadActual*100)/this.capacidadMaxima;
    }


}
