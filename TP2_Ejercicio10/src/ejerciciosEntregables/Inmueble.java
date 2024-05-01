package ejerciciosEntregables;

public class Inmueble {
	// Atributos de los Inmuebles.
	private int identificador;
	private double area;
	private String direccion;
	
	// Constructor
	public Inmueble(int identificador, double area, String direccion) {
		this.identificador = identificador;
		this.area = area;
		this.direccion = direccion;
	}
	
	// Metodos getters y setters.
	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// Metodo para imprimir los atributos de X Inmueble
	public void imprimir() {
		System.out.println("Identificador del inmueble: "+ identificador);
		System.out.println("Area: "+ area);
		System.out.println("Direccion: "+ direccion);
	}
}
