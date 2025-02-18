package Ejercicio8;

public class Caja {
    public boolean abierto;
    public String mensaje;
        //Primer constructor
        public Caja(String m) {
            this(false,m);
        }
        //Segundo constructor
        public Caja(boolean a, String m){
            this.mensaje = m;
            this.abierto = a;
        }
        //Tercer constructor

        public Caja(){
        this(false,"Viva el tema 4");
        }

        public void setMensaje (String m){
            if (abierto){
                this.mensaje = m;
            }
        }
        public void pasarMayusculas(){
            this.mensaje=mensaje.toUpperCase();
        }
}
