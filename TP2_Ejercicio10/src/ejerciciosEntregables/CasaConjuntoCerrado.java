package ejerciciosEntregables;

public class CasaConjuntoCerrado extends Casa {
	// Atributos de casa conjunto cerrado.
	private double valorAdmin;
	private boolean areasComunes; // Si la casa conjunto cerrado tiene areas comunes.
	
	// Constructir
	public CasaConjuntoCerrado(int identificador, double area, String direccion, int preciom2, int numHabitaciones, int numBanios, double valorAdmin, boolean areasComunes) {
		super(identificador, area, direccion, preciom2, numHabitaciones, numBanios);
		this.valorAdmin = valorAdmin;
		this.areasComunes = areasComunes;
	}
	
	// Metodos getters y setters.
	public boolean isAreasComunes() {
		return areasComunes;
	}
	
	public void setAreasComunes(boolean areasComunes) {
		this.areasComunes = areasComunes;
	}
	
	public double getValorAdmin() {
		return valorAdmin;
	}
	
	public void setValorAdmin(double valorAdmin) {
		this.valorAdmin = valorAdmin;
	}
	
	@Override
	// Metodo para imprimir los atributos de las Casas.
	 public void imprimir() {
		super.imprimir(); // Se llama al meotodo imprimir.
		System.out.println("Valor de administración: "+ valorAdmin);
		System.out.println("¿Cuenta con areas comunes?: "+ areasComunes);
	}
	
	// Metodo para caluclar el valor de los inmuebles, teniendo en cuenta el area y el precio por m2.
	public void valorInmueble() {
		super.valorInmueble();
	}

}
