package ejercicio;

// Se define la clase que hereda de Persona.
public class Funcionario extends Persona {
	// Se declaran los atributos de la clase Funcionario.
	private String poder;

	// Constructor de la clase Funcionario.
	public Funcionario(String nombre, String apellido, int dni, String poder) {
		super(nombre, apellido, dni);
		this.poder = poder;
	}
	
	// Metodos getters y setters de la clase Funcionario.
	public String getPoder() {
		return poder;
	}
	
	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Poder: " + poder;
	}
}
