package Taller_2.Ejercicios;

public class Producto {
    // Atributos privados
        private String nombre;
        private double precio;

        // Constructor que recibe parámetros y usa 'this'
        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        // Método para mostrar los detalles del producto
        public void mostrarProducto() {
            System.out.println("Nombre del producto: " + nombre);
            System.out.println("Precio: $" + precio);
        }

}
