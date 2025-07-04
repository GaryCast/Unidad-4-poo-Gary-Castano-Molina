package Taller_10.Ejercicios;

class ReproductorMP3 extends Reproductor {
    // No usamos @Override (compila, pero puede esconder errores)
    public void reproducirAudio() {
        System.out.println("Reproduciendo archivo MP3");
    }
}
/** Aunque el metodo se sobrescribe correctamente, no usar @Override es una mala práctica porque si cometes un error
  en el nombre, tipo de parámetro o tipo de retorno, el compilador no te avisa que no se está sobrescribiendo nada.
  El uso de @Override sirve como verificación automática del compilador.
 */