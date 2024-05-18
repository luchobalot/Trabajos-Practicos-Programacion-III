package Ejercicio4;

public class Triangle extends Shape {
	// Atributos de Triangle
	private double base, altura;

	// Constructor
    public Triangle(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    // Metodos
    @Override
    public void dibujar() {
        System.out.println("Dibujando el triángulo de base " + base + " y altura " + altura + " en (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(double escala) {
        base *= escala;
        altura *= escala;
    }

    @Override
    public void mover(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

}
