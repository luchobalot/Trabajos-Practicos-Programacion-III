package ejercicios;

// Se declara la clase persona.
public class Persona {
	// Se declaran los atributos de la clase persona.
	protected String nombre;
	protected double altura; // Altura en metros.
	
	// Constructor de la clase persona.
	public Persona(String nombre, double altura) {
		this.nombre = nombre;
		this.altura = altura;
	}
	
	// Métodos getters y setters de Persona.
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

}
