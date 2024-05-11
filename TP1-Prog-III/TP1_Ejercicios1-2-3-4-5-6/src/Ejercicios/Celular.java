package Ejercicios;

public class Celular {
	
	// Atributos de la clase Celular.
		private String Modelo;
		private String Marca;
		private int memoria;
		private boolean radio;
		private int nroCelular;
		
		// Constructor de la clase Celular.
		public Celular(String Modelo, String Marca, int memoria, boolean radio, int nroCelular) {
			this.Modelo = Modelo;
			this.Marca = Marca;
			this.memoria = memoria;
			this.radio = radio;
			this.nroCelular = nroCelular;
		}
		
		// Métodos de la clase Celular.
		public void realizarLlamada() {
			System.out.println("Llamando...");
		}
		
		public void cortarLlamada() {
			System.out.println("Llamada finalizada.");
		}


}
