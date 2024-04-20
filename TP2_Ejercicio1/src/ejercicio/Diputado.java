package ejercicio;

public class Diputado extends Legislador {
	
	// Constructor de la clase Legislador.
	public Diputado(String nombre, String apellido, int dni, String provincia) {
		// Se declara "Legislativo" porque se asume que pertenece a este poder.
        super(nombre, apellido, dni, "Legislativo", provincia);
    }
	
	@Override
    public String toString() {
    	return super.toString();
    }

}
