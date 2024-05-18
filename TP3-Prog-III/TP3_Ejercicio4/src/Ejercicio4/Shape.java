package Ejercicio4;

abstract class Shape {
    protected int x, y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void dibujar();
    public abstract void redimensionar(double escala);
    public abstract void mover(int deltaX, int deltaY);
}
