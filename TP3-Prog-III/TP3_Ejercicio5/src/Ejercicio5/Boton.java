package Ejercicio5;

public class Boton {
	private String label;

    public Boton(String label) {
        this.label = label;
    }

    public void click() {
        System.out.println("Botón " + label + " presionado.");
    }

}
