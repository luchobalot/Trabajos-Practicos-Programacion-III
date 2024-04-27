package ejercicios;

public class Vehiculo {
	// Atributos de la clase Vehiculo.
	private String marca;
	private int modelo;
	private String patente;
	private double precio;
	private Motor motor;
	
	// Constructor
	public Vehiculo(String marca, int modelo, String patente, double precio, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.precio = precio;
		this.motor = motor;
	}
	
	// Metodos setters y getters.
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPetente(String patente) {
		this.patente = patente;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	// Metodo para encender el auto.
	public void encender() {
		System.out.println("El auto se esta encendiendo.");
	}
	
	// Metodo para encender el auto.
	public void acelerar() {
		System.out.println("El auto esta acelerando...");
	}
		
	// Metodo para encender el auto.
	public void frenar() {
		System.out.println("El auto se esta frenando...");
	}

}
