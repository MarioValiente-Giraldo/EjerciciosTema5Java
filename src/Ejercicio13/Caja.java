package Ejercicio13;

public class Caja {
    private boolean abierto;
    private String mensaje;
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
        public void abrir(){
            this.abierto = true;
        }
         public void cerrar(){
        this.abierto = false;
         }
        public boolean esAbierta(){
            if (abierto = true){
                return true;
            }else {
                return false;
            }
        }
        public String getMensaje(){
            if (abierto = true){
                return this.mensaje;
            }else {
                return null;
            }
        }

}
