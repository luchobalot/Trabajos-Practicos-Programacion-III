package ejerciciosEntregables;

public class Oficina extends InmuebleComercial {
	
	// Constructor.
	public Oficina(int identificador, double area, String direccion, int preciom2) {
		super(identificador, area, direccion, preciom2);
	}
	
	@Override
	// Metodo para imprimir los atributos de Oficina
	 public void imprimir() {
		super.imprimir(); // Se llama al meotodo imprimir.
	    }

	@Override
	// Metodo para caluclar el valor de los inmuebles, teniendo en cuenta el area y el precio por m2.
		public void valorInmueble() {
			super.valorInmueble();
		}

}
