package ejercicio;

// Se define la clase que hereda de Persona.
public class Funcionario extends Persona {
	private String poder;

	public Funcionario(String nombre, String apellido, int dni, String poder) {
		super(nombre, apellido, dni);
		this.poder = poder;
	}
	
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
