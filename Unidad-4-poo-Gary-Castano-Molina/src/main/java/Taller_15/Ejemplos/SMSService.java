package Taller_15.Ejemplos;

// Clase SMSService (responsable de las notificaciones por SMS)
public class SMSService {
    public void enviarSMS(String numero, String mensaje) {
        System.out.println("Enviando SMS a: " + numero);
        System.out.println("Mensaje: " + mensaje);
    }
}
