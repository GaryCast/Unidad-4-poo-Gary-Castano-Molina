package Taller_15.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("gator2025", "secreto123");

        ValidadorUsuario validador = new ValidadorUsuario();
        ServicioAutenticacion auth = new ServicioAutenticacion();

        if (validador.validar(usuario)) {
            System.out.println("Datos válidos.");

            if (auth.autenticar(usuario, "gator2025", "secreto123")) {
                System.out.println("Autenticación exitosa.");
            } else {
                System.out.println("Credenciales incorrectas.");
            }

        } else {
            System.out.println("Datos inválidos del usuario.");
        }
    }
}