package Taller_15.Ejemplos;

// Clase InformeService (responsable de la generación de informes)
public class InformeService {
    public void generarInformeUsuario(Usuario usuario) {
        System.out.println("Generando informe para " + usuario.getNombre());
    }
}
