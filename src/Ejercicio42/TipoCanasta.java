package Ejercicio42;

public enum TipoCanasta { TIRO_LIBRE(1) {
    @Override
    public int getValor() {
        return this.valor;
    }
}, CANASTA_NORMAL(2) {
    @Override
    public int getValor() {
        return this.valor;
    }
},TRIPLE(3) {
    @Override
    public int getValor() {
        return this.valor;
    }
};
    public final int valor;

    private TipoCanasta(int valor){
        this.valor = valor;
    }
    public abstract int getValor();
}

