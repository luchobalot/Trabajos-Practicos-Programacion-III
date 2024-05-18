package Ejercicio6;

import java.time.LocalDate;

public class Vendedor extends Empleado {
	
	// Constructor
	public Vendedor(int id, String nombre, String apellido, int edad, LocalDate fechaIngreso, double sueldo) {
        super(id, nombre, apellido, edad, fechaIngreso, sueldo);
    }
	
	public void mostrarTareas() {
        System.out.println("Vendedor: Realiza tareas de venta y atencion al cliente.");
    }

}
