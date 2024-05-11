package Ejercicios;

public class Persona {
	
	// Atributos de la clase Persona.
		private String nombre;
		private String apellido;
		private char sexo;
		private int edad;
		private String ciudad;
		
		// Constructores de la clase persona:
		public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.sexo = sexo;
			this.edad = edad;
			this.ciudad = ciudad;
			
		}
		
		public Persona(String nombre, String apellido) {
			this.nombre = nombre;
			this.apellido = apellido;
		}
		
		
		// Métodos de la clase Persona:
		
		// Método para mostrar los datos de las personas.
		public void mostrarDatosPersona() {
			System.out.println("Datos de la persona: ");
			System.out.println("Nombre: "+ nombre);
			System.out.println("Apellido: "+ apellido);
			System.out.println("Sexo: "+ sexo);
			System.out.println("Edad: "+ edad);
			System.out.println("Ciudad: "+ ciudad);
			
		}
		
		// Método para saber si la persona es mayor de edad.
		public void mayorEdadPersona() {
			System.out.println("¿La persona es mayor de edad?");
			if (edad >= 18) {
				System.out.println("Si. La persona es mayor de edad.");
			}
			else {
				System.out.println("La persona es menor de edad.");
			}
			
		}

}
