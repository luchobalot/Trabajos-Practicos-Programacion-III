package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ShapeList {
	// Lista donde se guardan las figuras.
	private List<Shape> figuras;

	// Constructor
    public ShapeList() {
        figuras = new ArrayList<>();
    }

    // Metodo que dibuja todas las figras en la lista.
    public void dibujarTodas() {
        for (Shape figura : figuras) {
            figura.dibujar(); // Se llama al metodo de cada figura.
        }
    }

    // Metodo que redimenziona todas las figras en la lista.
    public void redimensionarTodas(double escala) {
        for (Shape figura : figuras) {
            figura.redimensionar(escala); // Se llama al metodo de cada figura.
        }
    }

    // Metodo que mueve todas las figras en la lista.
    public void moverTodas(int deltaX, int deltaY) {
        for (Shape figura : figuras) {
            figura.mover(deltaX, deltaY); // Se llama al metodo de cada figura.
        }
    }

    // Metodo para redimenzionar una figura en especifico de la lista.
    public void redimensionarFigura(int indice, double escala) {
    	// Verificacion.
        if (indice >= 0 && indice < figuras.size()) {
            figuras.get(indice).redimensionar(escala);
        }
    }

    // Metodo para mover una figura en especifico de la lista.
    public void moverFigura(int indice, int deltaX, int deltaY) {
    	// Verificacion
        if (indice >= 0 && indice < figuras.size()) {
            figuras.get(indice).mover(deltaX, deltaY);
        }
    }

    // Metodo para agregar una figura al final de la lista.
    public void agregarFigura(Shape figura) {
        figuras.add(figura); // Agrega la figura proporcionada a la lista
    }

    // Metodo para insrtar una figura en puntoo especifico de la lista.
    public void insertarFigura(int indice, Shape figura) {
    	
    	// Verificación
        if (indice >= 0 && indice <= figuras.size()) {
            figuras.add(indice, figura); // Inserta la figura en la posicion especificada
        }
    }

    // Metodo para devolver la cantidad de figuras que contiene la lista.
    public int cantidadFiguras() {
        return figuras.size(); // Devuelve el tamaño de la lista de figuras.
    }

    // Mettodo para quitar una figura de una posición dada.
    public void quitarFigura(int indice) {
        if (indice >= 0 && indice < figuras.size()) {
            figuras.remove(indice); // Elimina la figura en la posicion especificada
        }
    }

}
