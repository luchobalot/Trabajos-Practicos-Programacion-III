package ejercicios;

public class Animal {
	protected String nombre;
	protected int edad;
	protected String raza;
	
	public Animal(String nombre, int edad, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	
	// Métodos getters.
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    // Método setters.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    // Metodo para mostrar información de los animales.
    public void mostrarInfo() {
    	System.out.println("Nombre del animal: "+ nombre);
    	System.out.println("Edad: "+ edad);
    	System.out.println("Raza: "+ raza);
    }
}
