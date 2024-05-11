package ejercicio;

public class Persona {
	
	// Se declaran los atributos de la clase Persona.
	protected String nombre;
	protected String apellido;
	protected int dni;

	// Constructor de la clase persona.
	public Persona(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	// Metodos getters y setters de la clase Persona.
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni;
	}
	
}
