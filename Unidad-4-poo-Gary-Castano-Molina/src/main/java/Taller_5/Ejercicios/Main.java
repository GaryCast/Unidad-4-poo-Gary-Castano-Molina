package Taller_5.Ejercicios;

public class Main {
    public static void main(String[] args) {
        // Acceso válido desde el mismo paquete
        Producto prod = new Producto("Celular", 899.99, 15);
        prod.mostrarInfo();

        // También puedes acceder directamente a los atributos (porque están en el mismo paquete)
        System.out.println("Acceso directo al stock: " + prod.stock);
    }
}
