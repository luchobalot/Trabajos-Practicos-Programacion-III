package ejercicios;

// Se declara la clase LibrosFisicos que hereda de Libro.
public class LibrosFisicos extends Libro {
	// Se declaran los atributos de LibrosFisicos.
	private boolean tapaDura;
	
	// Constructor de la clase LibrosFisicos.
	public LibrosFisicos(String titulo, String autor, double precio, boolean tapaDura) {
		super(titulo, autor, precio);
		this.setTapaDura(tapaDura);
	}

	public boolean isTapaDura() {
		return tapaDura;
	}

	public void setTapaDura(boolean tapaDura) {
		this.tapaDura = tapaDura;
	}
	
	// Se sobreescribe el metodo de mostrar informacion de la clase Libro.
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion(); // Llama al metodo
		if (tapaDura) {
			System.out.println("Tapa dura: SI");
		}
		else {
			System.out.println("Tapa dura: NO");
		}
	}
	
}
