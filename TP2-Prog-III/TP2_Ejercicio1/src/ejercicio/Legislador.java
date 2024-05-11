package ejercicio;

//Se define la clase que hereda de Funcionario.
public class Legislador extends Funcionario {
	// Se declaran los atributos de la clase Legislador.
	private String provincia;
	
	// Constructor de la clase Legislador.
	public Legislador(String nombre, String apellido, int dni, String poder, String provincia) {
		super(nombre, apellido, dni, poder);
		this.provincia = provincia;
	}
		
	// Metodos getters y setters.
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Provincia: " + provincia;
	}
}
