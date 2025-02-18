package EjemploEnum;

public enum Operacion {
    SUMAR{
        @Override
        public int realizaOperacion(int a, int b) {
            return a+b;
        }
    },
    RESTAR{
        @Override
        public int realizaOperacion(int a, int b) {
            return a-b;
        }

    };
    public abstract int realizaOperacion (int a, int b);
}
