package Ejercicio4;

public class Rectangle extends Shape {
	// Atributos de Rectangle
	private double ancho, alto;

	// Constructor
    public Rectangle(int x, int y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    // Metodos
    @Override
    public void dibujar() {
        System.out.println("Dibujando el rectangulo de ancho " + ancho + " y alto " + alto + " en (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(double escala) {
        ancho *= escala;
        alto *= escala;
    }

    @Override
    public void mover(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

}
