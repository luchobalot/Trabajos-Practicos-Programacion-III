package Ejercicio3;

// Clase main para poder imprimir detalles de las casas.
public class Main {
	public static void main(String[] args) {
		
        // Crear dormitorios
        Dormitorio[] dormitorios1 = {
            new Dormitorio(20, true, 2),
            new Dormitorio(15, false, 1)
        };
        
        Dormitorio[] dormitorios2 = {
            new Dormitorio(25, true, 3),
            new Dormitorio(18, false, 2)
        };

        // Crear baños
        Banio[] banios1 = {
            new Banio(true, false),
            new Banio(false, true)
        };
        
        Banio[] banios2 = {
            new Banio(true, true),
            new Banio(false, false)
        };

        // Crear cocinas
        Cocina cocina1 = new Cocina("Gas", "Eléctrico", 12);
        Cocina cocina2 = new Cocina("Eléctrico", "Gas", 15);

        // Crear casas
        Casa casa1 = new Casa(dormitorios1, banios1, "Fondo", 30, cocina1);
        Casa casa2 = new Casa(dormitorios2, banios2, "Frente", 40, cocina2);

        // Imprimir detalles de las casas
        System.out.println("Casa 1:");
        imprimirDetallesCasa(casa1);

        System.out.println("\nCasa 2:");
        imprimirDetallesCasa(casa2);
    }

    private static void imprimirDetallesCasa(Casa casa) {
        System.out.println("Dormitorios:");
        for (Dormitorio dormitorio : casa.getDormitorio()) {
            System.out.println("  - Metros cuadrados: " + dormitorio.getMetrosCuadrados());
            System.out.println("    Baño en suite: " + (dormitorio.isBanioEnSuite() ? "Sí" : "No"));
            System.out.println("    Cantidad de ventanas: " + dormitorio.getCantidadVentanas());
        }

        System.out.println("Baños:");
        for (Banio banio : casa.getBanio()) {
            System.out.println("  - Bañera: " + (banio.isBaniera() ? "Sí" : "No"));
            System.out.println("    Antebaño: " + (banio.isAntebanio() ? "Sí" : "No"));
        }

        System.out.println("Patio:");
        System.out.println("  - Ubicación: " + casa.getPatioUbi());
        System.out.println("  - Metros cuadrados: " + casa.getPatiom2());

        System.out.println("Cocina:");
        System.out.println("  - Tipo de horno: " + casa.getCocina().getTipoHorno());
        System.out.println("  - Tipo de cocina: " + casa.getCocina().getTipoCocina());
        System.out.println("  - Metros cuadrados: " + casa.getCocina().getMetrosCuadrados());
    }

}
