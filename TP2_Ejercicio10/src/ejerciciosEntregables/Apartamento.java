package ejerciciosEntregables;

public class Apartamento extends InmuebleVivienda {
	// Atributos de los apartamentos.
	private double valorAdmin;
	
	// Constructor.
	public Apartamento(int identificador, double area, String direccion, int numHabitaciones, int numBanios, double valorAdmin) {
		super(identificador, area, direccion, numHabitaciones, numBanios);
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
}
