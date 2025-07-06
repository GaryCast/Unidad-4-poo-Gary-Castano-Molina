package Taller_15.Ejercicios;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Auriculares", 50.0, 0.15);

        PrecioService precioService = new PrecioService();
        EtiquetaService etiquetaService = new EtiquetaService();
        ProductoRepositorio repositorio = new ProductoRepositorio();

        System.out.println(etiquetaService.generarEtiqueta(producto));
        repositorio.guardar(producto);
    }
}
