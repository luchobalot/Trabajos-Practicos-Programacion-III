package ejercicios;

public class Motor {
	private int cilindrada;
	private String numeroMotor;
	private int kilometraje;
	
	// Constructor.
	public Motor(int cilindrada, String numeroMotor, int kilometraje) {
		this.cilindrada = cilindrada;
		this.numeroMotor = numeroMotor;
		this.kilometraje = kilometraje;
	}
	
	// Metodos getters y setters.
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getNumeroMotor() {
		return numeroMotor;
	}

	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
}
