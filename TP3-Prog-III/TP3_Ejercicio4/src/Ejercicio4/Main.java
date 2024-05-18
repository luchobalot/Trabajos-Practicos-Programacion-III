package Ejercicio4;

public class Main {
    public static void main(String[] args) {
    	// Se crea una instancia de ShapeList para manejar la lista de figuras.
        ShapeList listaFiguras = new ShapeList();

        // Se crean las figuras y se agregan a la lista.
        Shape circulo = new Circle(10, 10, 5);
        Shape rectangulo = new Rectangle(20, 20, 10, 5);
        Shape triangulo = new Triangle(30, 30, 6, 8);

        listaFiguras.agregarFigura(circulo);
        listaFiguras.agregarFigura(rectangulo);
        listaFiguras.agregarFigura(triangulo);

        // Se dibujan las figuras.
        System.out.println("Dibujando todas las figuras:");
        listaFiguras.dibujarTodas();

        // Se redimenzionan las figuras (Doble de su tamaño).
        System.out.println("\nRedimensionando todas las figuras al doble:");
        listaFiguras.redimensionarTodas(2.0);
        listaFiguras.dibujarTodas();

        // Se mueven las figuras (5,5)
        System.out.println("\nMoviendo todas las figuras por (5, 5):");
        listaFiguras.moverTodas(5, 5);
        listaFiguras.dibujarTodas();

        // Se redimenziona el ciruclo (triple de su tamaño).
        System.out.println("\nRedimensionando el círculo (primera figura) al triple:");
        listaFiguras.redimensionarFigura(0, 3.0);
        listaFiguras.dibujarTodas();

        // Se mueve al rectangulo (10,10).
        System.out.println("\nMoviendo el rectángulo (segunda figura) por (10, 10):");
        listaFiguras.moverFigura(1, 10, 10);
        listaFiguras.dibujarTodas();

        // Se muestra la cantidad de figuras.
        System.out.println("\nCantidad de figuras en la lista: " + listaFiguras.cantidadFiguras());

        // Se inserta un circulo en la posicíon 1  de la lista.
        System.out.println("\nInsertando un nuevo triangulo en la posición 1:");
        listaFiguras.insertarFigura(1, new Triangle(50, 50, 3, 4));
        listaFiguras.dibujarTodas();

        // Se elimina la figura de la posición de la litsa.
        System.out.println("\nEliminando la figura en la posición 2:");
        listaFiguras.quitarFigura(2);
        listaFiguras.dibujarTodas();
    }
}

