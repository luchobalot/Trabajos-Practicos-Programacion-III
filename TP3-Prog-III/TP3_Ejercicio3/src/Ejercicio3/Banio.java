package Ejercicio3;

public class Banio {
	private boolean baniera;
    private boolean antebanio;

    public Banio(boolean baniera, boolean antebanio) {
        this.baniera = baniera;
        this.antebanio = antebanio;
    }

    // Getters y setters
    public boolean isBaniera() {
        return baniera;
    }

    public void setBanieria(boolean banieria) {
        this.baniera = banieria;
    }

    public boolean isAntebanio() {
        return antebanio;
    }

    public void setAntebanio(boolean antebanio) {
        this.antebanio = antebanio;
    }

}
