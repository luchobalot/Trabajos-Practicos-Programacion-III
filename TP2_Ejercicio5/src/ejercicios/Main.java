package ejercicios;

public class Main {
	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Lucas", 7, "Ovejero Aleman", "Alimento balanceado");
		Perro perro2 = new Perro("Negro", 3, "Mestizo", "pan");
		
		Gato gato1 = new Gato("Michi", 6, "Persa", "Pescado");
		

		
		System.out.println("--- Perros ---");
		perro1.mostrarInfo();
		perro2.mostrarInfo();
		
		System.out.println("");
		System.out.println("--- Gatos ---");
		gato1.mostrarInfo();

	}
	

}
