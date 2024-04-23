package ejercicio;

//Se define la clase que hereda de Legislador.
public class Diputado extends Legislador {
	
	// Constructor de la clase Diputado.
	public Diputado(String nombre, String apellido, int dni, String provincia) {
		// Se declara "Legislativo" porque se asume que pertenece a este poder.
        super(nombre, apellido, dni, "Legislativo", provincia);
    }
	
	@Override
    public String toString() {
    	return super.toString();
    }

}
