package Taller_15.Ejercicios;

public class ServicioAutenticacion {
    public boolean autenticar(Usuario usuario, String userInput, String passInput) {
        return usuario.getNombreUsuario().equals(userInput)
                && usuario.getContrasena().equals(passInput);
    }
}
