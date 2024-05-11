package ejercicios;

// Se declara la clase Libro.
public class Libro {
	// Atributos de la clase Libro.
	protected String titulo;
	protected String autor;
	protected double precio;
	
	// Constructor.
	public Libro(String titulo, String autor, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	// Metodos getters y setters.
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio (double precio) {
		this.precio = precio;
	}
	 
	// Metodo para imprimir informmación de los libros.
	public void mostrarInformacion() {
		System.out.println("Titulo del libro: "+ getTitulo());
		System.out.println("Autor: "+ getAutor());
		System.out.println("Precio: "+ getPrecio());
	}
}
