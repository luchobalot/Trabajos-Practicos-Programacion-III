package ejerciciosEntregables;

public class InmuebleVivienda extends Inmueble {
	// Atributos de las viviendas.
	private int numHabitaciones;
	private int numBanios;
	
	// Constructor de inmueble vivienda
	public InmuebleVivienda(int identificador, double area, String direccion, int numHabitaciones, int numBanios) {
		super(identificador, area, direccion);
		this.numHabitaciones = numHabitaciones;
		this.numBanios = numBanios;
			
		}
	// Metodos getters y setters.
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	
	public int getNumBanios() {
		return numBanios;
	}
	
	public void setNumBanios(int numBanios) {
		this.numBanios = numBanios;
	}

	// Metodo para imprimir los atributos.
	public void imprimir() {
		super.imprimir();
		System.out.println("Cantidad de habitaciones: "+ numHabitaciones);
		System.out.println("Cantidad de baños: "+ numBanios);
		
	}
}
