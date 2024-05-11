package ejerciciosEntregables;

public class Monoambiente extends Apartamento{
	
	// Constructor.
	public Monoambiente(int identificador, double area, String direccion, int preciom2, int numHabitaciones, int numBanios, double valorAdmin) {
		super(identificador, area, direccion, preciom2, numHabitaciones, numBanios, valorAdmin);
	}
	
	@Override
	// Metodo para imprimir los atributos del Monoambiente.
	 public void imprimir() {
		super.imprimir(); // Se llama al meotodo imprimir.
	}
	
	// Metodo para caluclar el valor de los inmuebles, teniendo en cuenta el area y el precio por m2.
	public void valorInmueble() {
		super.valorInmueble();
	}
	

}
