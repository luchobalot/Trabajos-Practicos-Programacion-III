package EjercicioEntregable9;

public abstract class Empleado {
	// Atributo constante para el sueldo.
	public static final double SUELDO = 650000.0;
	
	// Atributos generales de Empleados.
	private String nombre;
	private long dni;
	private String domicilio;
	private int anioIngreso;
	
	// Constructor.
	public Empleado(String nombre, long dni, String domicilio, int anioIngreso) {
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
		this.anioIngreso = anioIngreso;
	}
	
	// Metodos setters y getters.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public int getAnioIngreso() {
		return anioIngreso;
	}
	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}
	
	public static double getSueldo() {
		return SUELDO;
	}
	
	public abstract double calcularSueldo();
	
	public abstract void imprimirRecibo();
}
