package Ejercicio4;

class Circle extends Shape {
	// Atributos de Circle.
	private double radio;

	// Constructor
    public Circle(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }
    
    // Metodos
    @Override
    public void dibujar() {
        System.out.println("Dibujando el círculo de radio " + radio + " en (" + x + ", " + y + ")");
    }

    @Override
    public void redimensionar(double escala) {
        radio *= escala;
    }

    @Override
    public void mover(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

}
