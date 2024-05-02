package ejerciciosEntregables;

public class LocalComercial extends InmuebleComercial {
	// Atributos de Locales Comerciales.
	private String centroComercial;
	private String localizacion; // Puede ser: Interna o Calle.
	
	// Constructor.
	public LocalComercial(int identificador, double area, String direccion, int preciom2, String centroComercial, String localizacion){
		super(identificador, area, direccion, preciom2);
		this.centroComercial = centroComercial;
		this.localizacion = localizacion;
	}
	
	// Metodos getters y setters.
	public String getCentroComercial() {
		return centroComercial;
	}
	
	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}
	
	public String getLocalizacion() {
		return localizacion;
	}
	
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	@Override
	// Metodo para imprimir los atributos de LocalComercial.
	 public void imprimir() {
		super.imprimir(); // Se llama al meotodo imprimir.
	    System.out.println("Centro Comercial: " + centroComercial);
	    System.out.println("¿Ubicacion Interna/Calle?: " + localizacion);
	    }
	
	// Metodo para caluclar el valor de los inmuebles, teniendo en cuenta el area y el precio por m2.
	public void valorInmueble() {
		super.valorInmueble();
	}
	
}
