package EjercicioEntregable8;

public class TarjetaCredito {
	// Atributos de la clase TarjetaCredito.
	private String entidadFinanciera;
	private String entidadBancaria;
	private long numeroTarjeta;
	private double saldoDisponible;
	private Titular titular;
	
	// Constructor.
	public TarjetaCredito(String entidadFinanciera,String entidadBancaria, long numeroTarjeta, double saldoDisponible, 
	Titular titular) {
		this.entidadFinanciera = entidadFinanciera;
		this.entidadBancaria = entidadBancaria;
		this.numeroTarjeta = numeroTarjeta;
		this.saldoDisponible = saldoDisponible;
		this.titular = titular;
			
	}
	
	// Metodos setters y getters.
	public String getEntidadFinanciera() {
		return entidadFinanciera;
	}
	
	public void setEntidadFinanciera(String entidadFinanciera) {
		this.entidadFinanciera = entidadFinanciera;
	}
	
	public String getEntidadBancaria() {
		return entidadBancaria;
	}
	
	public void setEntidadBancaria(String entidadBancaria) {
		this.entidadBancaria = entidadBancaria;
	}
	
	public long getNumeroTarjeta() {
		return numeroTarjeta;
	}
	
	public void setNumeroTarjeta(long numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	
	public double getSaldoDisponible() {
		return saldoDisponible;
	}
	
	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	
	public Titular getTitular() {
		return titular;
	}
	
	public void setTitular(Titular titular) {
		this.titular = titular;
	}

}
