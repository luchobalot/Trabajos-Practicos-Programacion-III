package EjercicioEntregable8;

public class Principal {
	public static void main(String[] args) {
		// Se crea el titular de la tarjeta.
        Titular titular1 = new Titular(43795841, "Luciano", "Balot", 291575010, "luchoprog3@gmail.com");
        
        // Se crea la tarjeta de credito, con un saldo de $15.000
        TarjetaCredito tarjeta1 = new TarjetaCredito("Visa", "Banco Nacion", 1234567890, 15000, titular1);
        
        // Se crea una terminal de cobro, desde la clase Posnet.
        Posnet posnet1 = new Posnet();
        
        // Ejercicio: Procesar un pago de $10.000 en 5 cuotas
        String resultadoPago = posnet1.efectuarPago(tarjeta1, 10000.0, 5); // Se llama a efecturarPago de la instancia posnet1
        if (resultadoPago != null) {
            System.out.println(resultadoPago); // Si no es null, imprime el ticket de compra.
        } 
        else {
            System.out.println("No se pudo procesar el pago! Saldo insuficiente.");
        }
    }
	
}
