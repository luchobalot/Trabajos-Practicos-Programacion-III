package ejercicios;

// Se declara la claser Superheroe que hereda de Persona.
public class Superheroe extends Persona {
	// Se declaran los atributos de Superheroe.
	private String nombreFicticio;
	private String tipoPoder;
	
	// Constructor de la clase Superheroe.
	public Superheroe(String nombre, double altura, String nombreFicticio, String tipoPoder) {
		super(nombre, altura);
		this.setNombreFicticio(nombreFicticio);
		this.setTipoPoder(tipoPoder);
	}

	// Métodos getters y setters de Superheroe.
	public String getNombreFicticio() {
		return nombreFicticio;
	}

	public void setNombreFicticio(String nombreFicticio) {
		this.nombreFicticio = nombreFicticio;
	}

	public String getTipoPoder() {
		return tipoPoder;
	}

	public void setTipoPoder(String tipoPoder) {
		this.tipoPoder = tipoPoder;
	}

	// Metodo para mostrar por pantalla los datos:
	public void mostrarDatos() {
		System.out.println("Nombre real: " + getNombre());
        System.out.println("Nombre ficticio: " + getNombreFicticio());
        System.out.println("Altura: " + getAltura() + " metros");
        System.out.println("Tipo de poder: " + getTipoPoder());
	}

}
