package ejerciciosEntregables;

public class DeptoFamiliar extends Apartamento {
	// Constructor.
	public DeptoFamiliar(int identificador, double area, String direccion, int preciom2, int numHabitaciones, int numBanios, double valorAdmin) {
		super(identificador, area, direccion, preciom2, numHabitaciones, numBanios, valorAdmin);
	}
		
	@Override
	// Metodo para imprimir los atributos del Departamento familiar.
	public void imprimir() {
		super.imprimir(); // Se llama al meotodo imprimir.
	}

	// Metodo para caluclar el valor de los inmuebles, teniendo en cuenta el area y el precio por m2.
	public void valorInmueble() {
		super.valorInmueble();
	}
}
