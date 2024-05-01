package EjercicioEntregable9;

public class Administrativos extends Empleado {
	// Atributos de los administrativos.
	private boolean jornadaCompleta; // Trabaja jornada completa: TRUE o FALSE
	
	// Constructor.
	public Administrativos(String nombre, long dni, String domicilio, int anioIngreso, boolean jornadaCompleta) {
		super(nombre, dni, domicilio, anioIngreso);
		this.jornadaCompleta = false; // Valor por defecto: no trabaja jornada completa.
	}

	public boolean isJornadaCompleta() {
		return jornadaCompleta;
	}

	public void setJornadaCompleta(boolean jornadaCompleta) {
		this.jornadaCompleta = jornadaCompleta;
	}

	// Metodo para imprimir el recibo de los Administrativos.
	public void imprimirRecibo() {
		System.out.println("\nNombre: "+ getNombre());
		System.out.println("DNI: "+ getDni());
		System.out.println("Domicilio: "+ getDomicilio());
		System.out.println("Año de ingreso: "+ getAnioIngreso());
		System.out.println("Categoría: Administrativo");
		System.out.println("Sueldo basico: "+ SUELDO);
		System.out.println("Total a cobrar: "+ calcularSueldo());
	}
	
	// Metodo para calcular el sueldo de los Administrativos.
	public double calcularSueldo() {
		double sueldoFinal = SUELDO;
		if (!jornadaCompleta) {
			sueldoFinal -= 150000; // Si no trabajan jornada completa, se les resta $150.000 a su sueldo basico.
		}
		return sueldoFinal;
	}
}
