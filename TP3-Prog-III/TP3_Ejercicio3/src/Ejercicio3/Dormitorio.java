package Ejercicio3;

public class Dormitorio {
	// Atributos de Dormitorio
	private int metrosCuadrados;
    private boolean banioEnSuite;
    private int cantidadVentanas;

    // Constructor
    public Dormitorio(int metrosCuadrados, boolean banioEnSuite, int cantidadVentanas) {
        this.metrosCuadrados = metrosCuadrados;
        this.banioEnSuite = banioEnSuite;
        this.cantidadVentanas = cantidadVentanas;
    }

    // Getters y setters
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isBanioEnSuite() {
        return banioEnSuite;
    }

    public void setBanioEnSuite(boolean banioEnSuite) {
        this.banioEnSuite = banioEnSuite;
    }

    public int getCantidadVentanas() {
        return cantidadVentanas;
    }

    public void setCantidadVentanas(int cantidadVentanas) {
        this.cantidadVentanas = cantidadVentanas;
    }


}
