package ejerciciosEntregables;

public class Inmueble {
	// Atributos de los Inmuebles.
	private int identificador;
	private double area;
	private String direccion;
	private int preciom2;
	
	// Constructor
	public Inmueble(int identificador, double area, String direccion, int preciom2) {
		this.identificador = identificador;
		this.area = area;
		this.direccion = direccion;
		this.preciom2 = preciom2;
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
	
	// Metodo para caluclar el valor de los inmuebles, teniendo en cuenta el area y el precio por m2.
	public void valorInmueble() {
		double valor = getPreciom2() * getArea();
		System.out.println("El precio es: $"+ valor);
	}

	public int getPreciom2() {
		return preciom2;
	}

	public void setPreciom2(int preciom2) {
		this.preciom2 = preciom2;
	}
	
}
