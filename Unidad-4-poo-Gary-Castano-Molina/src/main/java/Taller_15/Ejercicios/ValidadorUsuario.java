package Taller_15.Ejercicios;

public class ValidadorUsuario {
    public boolean validar(Usuario usuario) {
        return usuario.getNombreUsuario() != null && !usuario.getNombreUsuario().isBlank()
                && usuario.getContrasena() != null && usuario.getContrasena().length() >= 6;
    }
}
