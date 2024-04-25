package ejercicio;

public class Main {
	public static void main(String[] args) {
		
		// Se crean los electrodomesticos.
		Electrodomestico electrodomestico1 = new Electrodomestico(500.0, "Blanco", 'A', "LG");
		Electrodomestico electrodomestico2 = new Electrodomestico(800.0, "Negro", 'G', "Samsung");
		
		// Se imprimen los datos de los electrodomesticos en pantalla.
		System.out.println("Precio: " + electrodomestico1.getPrecio());
		System.out.println("Color: " + electrodomestico1.getColor());
		System.out.println("Consumo Energético: " + electrodomestico1.getConsumoEnergetico());
		System.out.println("Marca: " + electrodomestico1.getMarca());

		System.out.println("--------------------------------");
		System.out.println("Precio: " + electrodomestico2.getPrecio());
		System.out.println("Color: " + electrodomestico2.getColor());
		System.out.println("Consumo Energético: " + electrodomestico2.getConsumoEnergetico());
		System.out.println("Marca: " + electrodomestico2.getMarca());
		
	}

}
