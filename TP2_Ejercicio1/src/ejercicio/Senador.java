package ejercicio;

public class Senador extends Legislador {
	
	// Constructor de la clase Senador
    public Senador(String nombre, String apellido, int dni, String provincia) {
    	// Se declara "Legislativo" porque se asume que pertenece a este poder.
        super(nombre, apellido, dni, "Legislativo", provincia);
    }
    
    @Override
    public String toString() {
    	return super.toString();
    }

}
