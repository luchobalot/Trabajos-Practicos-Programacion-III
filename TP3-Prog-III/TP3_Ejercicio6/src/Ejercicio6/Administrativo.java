package Ejercicio6;

import java.time.LocalDate;

public class Administrativo extends Empleado {
	
	// Constructor
	public Administrativo(int id, String nombre, String apellido, int edad, LocalDate fechaIngreso, double sueldo) {
        super(id, nombre, apellido, edad, fechaIngreso, sueldo);
    }
	
    public void mostrarTareas() {
        System.out.println("Administrativo: Realiza tareas administrativas en la empresa.");
    }

}
