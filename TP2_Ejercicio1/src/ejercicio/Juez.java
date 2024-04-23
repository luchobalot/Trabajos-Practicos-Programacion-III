package ejercicio;

//Se define la clase que hereda de Funcionario.
public class Juez extends Funcionario {
	// Se declaran los atributos de la clase Juez.
	private String jurisdiccion;
	
	// Constructor de la clase Juez.
	public Juez(String nombre, String apellido, int dni, String jurisdiccion, String poder) {
		super(nombre, apellido, dni, poder);
	}
	
	// Métodos getter y setter de la clase Juez.
    public String getJurisdiccion() {
        return jurisdiccion;
    }

    public void setJurisdiccion(String jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }
    
    @Override
    public String toString() {
    	return super.toString() + ", Jurisdiccion: " + jurisdiccion;
    }

}
