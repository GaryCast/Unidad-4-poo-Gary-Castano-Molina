package Taller_15.Ejemplos;

// Clase EnvioService (responsable del envío de pedidos)
public class EnvioService {
    public void enviarPedido(Pedido pedido) {
        System.out.println("Enviando pedido con total: " + pedido.getTotal());
    }
}
