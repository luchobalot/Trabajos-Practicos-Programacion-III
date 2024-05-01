package EjercicioEntregable8;

public class Titular {
	// Atributos de la clase Titular.
	private long DNI;
	private String nombre;
	private String apellido;
	private long telefono;
	private String mail;
	
	public Titular(long DNI, String nombre, String apellido, long telefono, String mail) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
	}
	// Metodos getter y setter.
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public long getTelefono() {
		return telefono;
	}
	
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public long getDNI() {
		return DNI;
	}
	
	public void setDNI(long dNI) {
		DNI = dNI;
	}

}
