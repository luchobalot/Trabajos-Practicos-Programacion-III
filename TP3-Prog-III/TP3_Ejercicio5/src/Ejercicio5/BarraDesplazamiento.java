package Ejercicio5;

public class BarraDesplazamiento {
	private String direccion;

    public BarraDesplazamiento(String direccion) {
        this.direccion = direccion;
    }

    public void desplazar() {
        System.out.println("Desplazando " + direccion + ".");
    }

}
