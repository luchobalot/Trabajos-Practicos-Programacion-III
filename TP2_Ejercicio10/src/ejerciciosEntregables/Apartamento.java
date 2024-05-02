package ejerciciosEntregables;

public class Apartamento extends InmuebleVivienda {
	// Atributos de los apartamentos.
	private double valorAdmin;
	
	// Constructor.
	public Apartamento(int identificador, double area, String direccion,int preciom2, int numHabitaciones, int numBanios, double valorAdmin) {
		super(identificador, area, direccion, preciom2, numHabitaciones, numBanios);
		this.valorAdmin = valorAdmin;
	}
	
	public double getValorAdmin() {
		return valorAdmin;
	}

	public void setValorAdmin(double valorAdmin) {
		this.valorAdmin = valorAdmin;
	}

	@Override
	// Metodo para imprimir los atributos del Apartamento.
	 public void imprimir() {
		super.imprimir(); // Se llama al meotodo imprimir.
		System.out.println("Valor de la administracion: $" + valorAdmin);
	}
	
	// Metodo para caluclar el valor de los inmuebles, teniendo en cuenta el area y el precio por m2.
	public void valorInmueble() {
		super.valorInmueble();
	}
}
