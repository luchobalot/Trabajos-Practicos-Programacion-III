package ejercicio;

public class Lavadora extends Electrodomestico {
	// Atributos de la clase Lavadora.
	private long revoluciones;
	private int cargaMax;
	
	public Lavadora(double precio, String color, char consumoEnergetico, String marca, long revoluciones, int cargaMax) {
		super(precio, color, consumoEnergetico, marca);
		this.revoluciones = revoluciones;
		this.cargaMax = cargaMax;
	}
	
	// Metodos getters y setters.
	public int getCargaMax() {
		return cargaMax;
	}
	
	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}
	public long getRevoluciones() {
		return revoluciones;
	}
	public void setRevoluciones(long revoluciones) {
		this.revoluciones = revoluciones;
	}

}
