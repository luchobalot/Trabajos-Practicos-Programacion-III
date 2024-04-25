package ejercicios;

// Se declara la clase Perro que hereda de clase Animal.
public class Perro extends Animal  {
	// Atributos de la clase Perro.
	private String alimentacion;
	
	// Constructor.
	public Perro(String nombre, int edad, String raza, String alimentacion) {
		super(nombre, edad, raza);
		this.setAlimentacion(alimentacion);
	}
	
	// Metodos getters y setters de Perro.
	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Se alimenta de: "+ alimentacion);
	}
}
