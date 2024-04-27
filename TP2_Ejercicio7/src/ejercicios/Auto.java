package ejercicios;

public class Auto extends Vehiculo {
	private boolean aireAcondicionado;
	
	public Auto(String marca, int modelo, String patente, double precio, Motor motor) {
		super(marca, modelo, patente, precio, motor);
		this.aireAcondicionado = false; // Inicialmente el aire esta apagado.
	}

	public boolean isAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}
	
	// Metodo para encender el aire acondicionado.
	public boolean encenderAireAcondicionado() {
		if (!aireAcondicionado) { // Verifica si el aire acondicionado esta encendido.
			aireAcondicionado = true;
			return true;
		}
		else {
			return false;
		}
	}
	
	// Metodo para apagar el aire acondicionado.
	public boolean apagarAireAcondicionado() {
		if (aireAcondicionado) { // Verificar si el aire acondicionado esta apagado.
			aireAcondicionado = false;
			return true;
		}
		else {
			return false;
		}
	}

}
