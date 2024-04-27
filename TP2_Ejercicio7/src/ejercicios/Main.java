package ejercicios;

public class Main {
	public static void main(String[] args) {
		
		// Se crean motores para los vehículos.
        Motor motorAuto1 = new Motor(2000, "12345", 0);
        Motor motorAuto2 = new Motor(1700, "67890", 0);
        Motor motorMoto1 = new Motor(600, "ABCDE", 0);
        Motor motorMoto2 = new Motor(250, "FGHIJ", 0);

        // Se crean los autos
        Auto auto1 = new Auto("Toyota Corolla", 2022, "ABC123", 25000, motorAuto1);
        Auto auto2 = new Auto("Fiat Palio TD", 1999, "XYZ789", 30000, motorAuto2);

        // Se crean las motos
        Moto moto1 = new Moto("Yamaha R6", 2023, "MOT123", 15000, motorMoto1);
        Moto moto2 = new Moto("Honda XR-250", 2020, "MOT456", 18000, motorMoto2);
        
        // Se muestra información de los autos y motos.
        System.out.println("Información de los autos:");
        System.out.println(auto1.getMarca() + " " + auto1.getModelo() + " - Patente: " + auto1.getPatente() + " - Precio: $" + auto1.getPrecio());
        System.out.println(auto2.getMarca() + " " + auto2.getModelo() + " - Patente: " + auto2.getPatente() + " - Precio: $" + auto2.getPrecio());
        
        System.out.println("\nInformación de las motos:");
        System.out.println(moto1.getMarca() + " " + moto1.getModelo() + " - Patente: " + moto1.getPatente() + " - Precio: $" + moto1.getPrecio());
        System.out.println(moto2.getMarca() + " " + moto2.getModelo() + " - Patente: " + moto2.getPatente() + " - Precio: $" + moto2.getPrecio());
		
        System.out.println("\n¿Las motos son de gama alta?");
        System.out.println(moto1.getMarca() + ": " + (moto1.esGamaAlta() ? "Sí" : "No"));
        System.out.println(moto2.getMarca() + ": " + (moto2.esGamaAlta() ? "Sí" : "No"));
	}

}
