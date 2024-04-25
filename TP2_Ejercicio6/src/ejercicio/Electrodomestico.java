package ejercicio;

public class Electrodomestico {
	// Atributos de la clase Electrodomestico.
	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected String marca;

	// Constructor.
	public Electrodomestico(double precio, String color, char consumoEnergetico, String marca) {
		this.precio = precio;
		this.color = color;
		this.consumoEnergetico = validarConsumo(consumoEnergetico);
		this.marca = marca;
	}
	
	// Metodo para validar que el valor ingresado este entre A y F.
	private char validarConsumo(char consumoEnergetico) {
		consumoEnergetico =  Character.toUpperCase(consumoEnergetico);
		
		if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
			return consumoEnergetico;
		}
		else {
			System.out.println("El consumo energetico ingresado es INCORRECTO. Se asume 'F' por defecto.");
			return 'F';
		}
	}
	
	// Metodos getters y setters.
	 public double getPrecio() {
	        return precio;
	    }

	    public String getColor() {
	        return color;
	    }

	    public char getConsumoEnergetico() {
	        return consumoEnergetico;
	    }

	    public String getMarca() {
	        return marca;
	    }
	
	
	
	
}
