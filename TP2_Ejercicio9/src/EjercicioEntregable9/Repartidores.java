package EjercicioEntregable9;

public class Repartidores extends Empleado {
	// Atributos de Repartidores
	private int totalRepartos;
	
	// Constructor
	public Repartidores(String nombre, long dni, String domicilio, int anioIngreso, int totalRepartos) {
		super(nombre, dni, domicilio, anioIngreso);
		this.totalRepartos = totalRepartos;
	}
	
	// Metodos getters y setters.
	public int getTotalRepartos() {
		return totalRepartos;
	}

	public void setTotalRepartos(int totalRepartos) {
		this.totalRepartos = totalRepartos;
	}
	
	// Metodos para calcular comisiones y el sueldo final.
	private double calcularComisionVentas() {
		return totalRepartos * 500;
	}
	
	public double calcularSueldo() {
		return SUELDO + calcularComisionVentas();
	}
	
	// Metodo para imprimir el recibo de Repartidores.
	public void imprimirRecibo() {
		System.out.println("\nNombre: "+ getNombre());
		System.out.println("DNI: "+ getDni());
		System.out.println("Domicilio: "+ getDomicilio());
		System.out.println("Año de ingreso: "+ getAnioIngreso());
		System.out.println("Categoría: Repartidor");
		System.out.println("Sueldo basico: "+ SUELDO);
		System.out.println("Comision por ventas: "+ calcularComisionVentas());
		System.out.println("Total a cobrar: "+ calcularSueldo());
	}

}
