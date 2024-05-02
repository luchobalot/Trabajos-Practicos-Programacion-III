package ejerciciosEntregables;

public class Casa extends InmuebleVivienda {
	
	// Constructor.
	public Casa(int identificador, double area, String direccion, int numHabitaciones, int numBanios) {
		super(identificador, area, direccion, numHabitaciones, numBanios);
	}
	
	@Override
	// Metodo para imprimir los atributos de las Casas.
	 public void imprimir() {
		super.imprimir(); // Se llama al meotodo imprimir.
	}
}
