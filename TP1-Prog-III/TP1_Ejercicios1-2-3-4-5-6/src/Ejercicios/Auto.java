package Ejercicios;

public class Auto {
	
	// Atributos de la clase Auto.
		private String color;
		private String patente;
		private int anio;
		private String modelo;
		private int km;
		
		// Constructor
		public Auto(String color, String patente, int anio, String modelo, int km) {
			this.color = color;
			this.patente = patente;
			this.anio = anio;
			this.modelo = modelo;
			this.km = km;
		}
		
		// Método que enciende el auto.
		public void encenderAuto() {
			System.out.println("El auto se prendio fuego!");
		}
		
		// Método para saber si el auto tiene más de 100mil km.
		public void kilometrajeMayor() {
			if (km > 100000) {
				System.out.println("Modelo: "+ modelo);
				System.out.println("Anio: "+ anio);
				System.out.println("Kilometraje: "+ km);
			}
		}

}
