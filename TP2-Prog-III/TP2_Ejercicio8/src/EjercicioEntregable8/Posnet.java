package EjercicioEntregable8;

public class Posnet {
	
	// Metodo para procesar un pago.
	public String efectuarPago(TarjetaCredito tarjeta, double monto, int cuotas) {
		
		// Se calcula el monto total a pagar, teniendo en cuenta los recargos por cuotss.
        double montoTotal = monto * (1 + (cuotas - 1) * 0.03);
        // (cuotas - 1) * 0.03 --> Porcentaje total de recargo por cuotas adicionales, sin contar la primera.
        //  1 + --> Se suma 1 al resultado anterior para considerar también la primera cuota.
        //  monto * --> Se multiplica el monto + recargo para obtener el monto total.
        
        
        // Se verifica que la tarjeta tengo saldo disponible para realizar el pago.
        if (tarjeta.getSaldoDisponible() >= montoTotal) {
            double montoCuota = montoTotal / cuotas;
            // montoCuota representa  el monto que el cliente debera pagar en cada cuota.
            
            // Se imprime el ticket con todos slos detalles.
            return "Compra exitosa! " +
            		"\n--- Ticket de compra ---\n" +
                    "Cliente: " + tarjeta.getTitular().getNombre() + " " + tarjeta.getTitular().getApellido() + "\n" +
                    "Monto total a pagar: " + montoTotal + "\n" +
                    "Monto de cada cuota: " + montoCuota ;
      
        } 
        else {
        	// En caso de que no haya saldo suficiente en la tarjta.
            return null;
        }
    }

}
