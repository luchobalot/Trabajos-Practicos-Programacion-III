package Ejercicio3;

public class Casa {
	// Atributos de Casa
	private Dormitorio[] dormitorio;
	private Banio[] banio;
	private String patioUbi;
	private int patiom2;
	private Cocina cocina;
	
	// Constructor
	public Casa(Dormitorio[] dormitorio, Banio[] banio, String patioUbi, int patiom2, Cocina cocina) {
        this.dormitorio = dormitorio;
        this.banio = banio;
        this.patioUbi = patioUbi;
        this.patiom2 = patiom2;
        this.cocina = cocina;
    }
	
	// Metodos getters y setters
	public Dormitorio[] getDormitorio() {
		return dormitorio;
	}
	
	public void setDormitorio(Dormitorio[] dormitorio) {
		this.dormitorio = dormitorio;
	}
	
	public Banio[] getBanio() {
		return banio;
	}
	
	public void setBanio(Banio[] banio) {
		this.banio = banio;
	}
	
	public String getPatioUbi() {
		return patioUbi;
	}
	
	public void setPatioUbi(String patioUbi) {
		this.patioUbi = patioUbi;
	}
	
	public int getPatiom2() {
		return patiom2;
	}
	
	public void setPatiom2(int patiom2) {
		this.patiom2 = patiom2;
	}
	
	public Cocina getCocina() {
		return cocina;
	}
	
	public void setCocina(Cocina cocina) {
		this.cocina = cocina;
	}

}
