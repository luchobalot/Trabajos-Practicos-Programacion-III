package ejerciciosEntregables;

public class CasaIndependiente extends Casa {
	// Constructor
	public CasaIndependiente(int identificador, double area, String direccion, int preciom2, int numHabitaciones, int numBanios) {
		super(identificador, area, direccion, preciom2, numHabitaciones, numBanios);
		}
	
	@Override
	// Metodo para imprimir los atributos de las Casas Independientes.
	 public void imprimir() {
		super.imprimir(); // Se llama al meotodo imprimir.
	}
	
	// Metodo para caluclar el valor de los inmuebles, teniendo en cuenta el area y el precio por m2.
	public void valorInmueble() {
		super.valorInmueble();
	}

}
