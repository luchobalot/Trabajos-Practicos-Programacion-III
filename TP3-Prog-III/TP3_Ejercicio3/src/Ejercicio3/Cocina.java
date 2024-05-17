package Ejercicio3;

public class Cocina {
	// Atributos de Cocina
	private String tipoHorno;
    private String tipoCocina;
    private int metrosCuadrados;

    // Constructor
    public Cocina(String tipoHorno, String tipoCocina, int metrosCuadrados) {
        this.tipoHorno = tipoHorno;
        this.tipoCocina = tipoCocina;
        this.metrosCuadrados = metrosCuadrados;
    }

    // Getters y setters
    public String getTipoHorno() {
        return tipoHorno;
    }

    public void setTipoHorno(String tipoHorno) {
        this.tipoHorno = tipoHorno;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
}

