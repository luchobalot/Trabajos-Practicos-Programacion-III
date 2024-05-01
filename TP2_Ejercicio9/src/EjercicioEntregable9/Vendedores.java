package EjercicioEntregable9;

public class Vendedores extends Empleado {
	// Atriutos de los vendedores.
	private int ventas;
	
	// Constructor.
	public Vendedores(String nombre, long dni, String domicilio, int anioIngreso, int ventas) {
		super(nombre, dni, domicilio, anioIngreso);
		this.ventas = ventas;
	}

	// Metodos setters y getters.
	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	
	public void imprimirRecibo() {
		System.out.println("Nombre: "+ getNombre());
		System.out.println("DNI: "+ getDni());
		System.out.println("Domicilio: "+ getDomicilio());
		System.out.println("Año de ingreso: "+ getAnioIngreso());
		System.out.println("Categoría: Vendedor");
		System.out.println("Sueldo basico: "+ SUELDO);
		System.out.println("Comision por ventas: "+ calcularComisionVentas());
		System.out.println("Total a cobrar: "+ calcularSueldo());
	}
	
	// Metodo para calcular el porcentaje de ventas.
	private double calcularComisionVentas() {
		return ventas * 0.5;
	}
	
	// Metodo para calcular el sueldo en relacion a las ventas.
	public double calcularSueldo() {
		return SUELDO + calcularComisionVentas(); 
	}

}
