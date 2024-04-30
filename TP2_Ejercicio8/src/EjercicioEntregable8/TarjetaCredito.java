package EjercicioEntregable8;

public class TarjetaCredito {
	// Atributos de la clase TarjetaCredito.
	private String entidadFinanciera;
	private String entidadBancaria;
	private long numeroTarjeta;
	private long saldoDisponible;
	private Titular titular;
	
	// Constructor.
	public TarjetaCredito(String entidadFinanciera,String entidadBancaria, long numeroTarjeta, long saldoDisponible, 
	Titular titular) {
		
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
	public long getSaldoDisponible() {
		return saldoDisponible;
	}
	public void setSaldoDisponible(long saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}

}
