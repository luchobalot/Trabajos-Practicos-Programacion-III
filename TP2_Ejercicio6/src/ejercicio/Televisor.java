package ejercicio;

public class Televisor extends Electrodomestico{
	// Atributos de la clase Televisor.
	private int pulgadas;
	
	// Constructor.
	public Televisor(double precio, String color, char consumoEnergetico, String marca, int pulgadas) {
		super(precio, color, consumoEnergetico, marca);
		this.pulgadas = pulgadas;
	}

	// Metodos getters y setters.
	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

}
