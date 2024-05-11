package ejercicios;

public class Moto extends Vehiculo {
	
	// Constructor.
	public Moto(String marca, int modelo, String patente, double precio, Motor motor) {
		super(marca, modelo, patente, precio, motor);
	}
	
	// Metodo para saber si la moto es alta gama, dependiendo de su cc.
	public boolean esGamaAlta() {
        return getMotor().getCilindrada() > 500; // Devuelve true si la cilindrada del motor es mayor a 500cc, de lo contrario devuelve false.
    }
}
