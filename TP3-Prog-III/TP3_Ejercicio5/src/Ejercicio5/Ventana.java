package Ejercicio5;

public class Ventana {
	private Boton[] botones;
    private BarraDesplazamiento barraVertical;
    private BarraDesplazamiento barraHorizontal;
    private MarcoTexto marcoTexto;

    public Ventana() {
        // Se inicializan los botones.
        botones = new Boton[5];
        botones[0] = new Boton("Añadir nuevo comentario");
        botones[1] = new Boton("Anterior");
        botones[2] = new Boton("Siguiente");
        botones[3] = new Boton("Cierra");
        botones[4] = new Boton("Ayuda");

        // Se inicializan las barras de desplazamiento.
        barraVertical = new BarraDesplazamiento("vertical");
        barraHorizontal = new BarraDesplazamiento("horizontal");

        // Se inicializa el marco de texto.
        marcoTexto = new MarcoTexto("Transporte a cargo del proveedor.");
    }

    public void mostrarVentana() {
    	
        // Se muestra marco de texto
        marcoTexto.mostrarTexto();

        // Se muestran los botones.
        for (Boton boton : botones) {
            boton.click();
        }

        // Se muestra el desplazamiento.
        barraVertical.desplazar();
        barraHorizontal.desplazar();
    }

}
