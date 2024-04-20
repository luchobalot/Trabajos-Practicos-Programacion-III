package ejercicio;

public class Juez extends Funcionario {
	
	private String jurisdiccion;
	
	public Juez(String nombre, String apellido, int dni, String jurisdiccion, String poder) {
		super(nombre, apellido, dni, poder);
	}
	
	// Métodos getter y setter.
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
