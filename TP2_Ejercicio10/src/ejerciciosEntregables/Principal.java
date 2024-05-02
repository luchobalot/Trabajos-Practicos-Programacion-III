package ejerciciosEntregables;

public class Principal {
	public static void main(String[] args) {
		
		// ================================
		// |      LOCALES COMERCIALES     |
		// ================================
        // Se crea una instancia de LocalComercial
        LocalComercial localcomercial1 = new LocalComercial(12345, 21.25, "Av. Alem 123", 300000, "Centro Comercial Alem", "Calle");

        // Se imprimen los detalles del local comercial
        System.out.println("Detalles del Local Comercial:\n");
        localcomercial1.imprimir();
        localcomercial1.valorInmueble();
        
        
	    // ================================
	    // |            OFICINA           |
	    // ================================
	    // Se crea una instancia de Oficina
	    Oficina oficina1 = new Oficina(98765, 22.0, "Irigoyen 789",240000);
     
     	// Se imprimen los detalles del local comercial
	    System.out.println("-------------------------");
     	System.out.println("\nDetalles de la Oficina:\n");
     	oficina1.imprimir();
     	oficina1.valorInmueble();
     	oficina1.valorInmueble();
	
     	
     	// ================================
     	// |      CASA INDEPENDIENTE      |
     	// ================================
     	// Se crea una instancia de casa conjunto independiente.
     	CasaIndependiente casaind1 = new CasaIndependiente(78965, 38.0, "Vieytes 445",200000, 1,1);
     	
     	// Se imprimen los detalles de la casa independiente.
	    System.out.println("-------------------------");
     	System.out.println("\nDetalles de la Casa Independiente:\n");
     	casaind1.imprimir();
     	casaind1.valorInmueble();
     	
     	
     	// ================================
     	// |      CASA CJTO. CERRADO      |
     	// ================================
     	// Se crea una instancia de casa conjunto cerrado.
     	CasaConjuntoCerrado casacerrado1 = new CasaConjuntoCerrado(54665, 25.7, "Alsina 27",250000, 3, 1, 14000, false);
     	
     	// Se imprimen los detalles de la casa conjunto cerrado.
	    System.out.println("-------------------------");
     	System.out.println("\nDetalles de la Casa cjto. cerrado:\n");
     	casacerrado1.imprimir();
     	casacerrado1.valorInmueble();
     	
     	
     	// ================================
     	// |         MONOAMBIENTE         |
     	// ================================
     	// Se crea una instancia de monoambiente.
     	Monoambiente mono1 = new Monoambiente(54665, 12.0, "Soler 12", 100000, 0, 1, 6500); // El monoambiente no tiene habitaciones.
     	
     	// Se imprimen los detalles del monoambiente.
	    System.out.println("-------------------------");
     	System.out.println("\nDetalles del Monoambiente:\n");
     	mono1.imprimir();
     	mono1.valorInmueble();
     	
     	
     	// ================================
     	// |       DPTO. FAMILIAR         |
     	// ================================
     	DeptoFamiliar dptofamiliar1 = new DeptoFamiliar(11432, 30.25, "Alem 1456", 180000, 4, 3, 7599);
     	
     	// Se imprimen los detalles del monoambiente.
	    System.out.println("-------------------------");
     	System.out.println("\nDetalles del Departamento Familiar:\n");
     	dptofamiliar1.imprimir();
     	dptofamiliar1.valorInmueble();
     	
     	
     	
     	
    }

}
