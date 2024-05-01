package ejerciciosEntregables;

public class Principal {
	public static void main(String[] args) {
		
		// ================================
		// |      LOCALES COMERCIALES     |
		// ================================
        // Se crea una instancia de LocalComercial
        LocalComercial localcomercial1 = new LocalComercial(12345, 95.5, "Av. Alem 123", "Centro Comercial Alem", "Calle");

        // Se imprimen los detalles del local comercial
        System.out.println("Detalles del Local Comercial:\n");
        localcomercial1.imprimir();
        
	    // ================================
	    // |            OFICINA           |
	    // ================================
	    // Se crea una instancia de Oficina
	    Oficina oficina1 = new Oficina(12345, 95.5, "Av. Alem 123");
     
     	// Se imprimen los detalles del local comercial
	    System.out.println("-------------------------");
     	System.out.println("\nDetalles de la Oficina:\n");
     	oficina1.imprimir();
    }

}
