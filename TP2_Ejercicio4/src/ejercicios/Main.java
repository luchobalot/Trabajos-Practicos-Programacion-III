package ejercicios;

public class Main {
	public static void main(String[] args) {
		// Se crean libros.
		Libro libro1 = new Libro("El Principito", "Autor desconocido", 1750.68);
		Libro libro2 = new Libro("Nombre de prueba", "Luciano Balot", 2550.99);
		
		// Se llama al metodo mostrarInformacion() para los Libros.
		libro1.mostrarInformacion();
		System.out.println("--- Libros ---");
		libro2.mostrarInformacion();
		
		
		// Se crean Libros Fisicos.
		LibrosFisicos librofisico1 = new LibrosFisicos("Harry Potter", "Autor desconocido", 987, true);
		
		// Se llama al metodo mostrarInformacion() para los Libros Fisicos.
		System.out.println("--- Libros Fisicos ---");
		librofisico1.mostrarInformacion();
		
		
		// Se crean Novelas
		Novela novela1 = new Novela("Novela de prueba", "Luciano Balot", 5640.80, "Romantica");
		
		// Se llama al metodo mostrarInformacion() para las Novelas.
		System.out.println("--- Novelas ---");
		novela1.mostrarInformacion();
		
		
	}

}
