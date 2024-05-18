package Ejercicio6;

import java.time.LocalDate;

public class OperarioMaestranza extends Empleado {
	
	// Constructor
	public OperarioMaestranza(int id, String nombre, String apellido, int edad, LocalDate fechaIngreso, double sueldo) {
        super(id, nombre, apellido, edad, fechaIngreso, sueldo);
    }

	public void mostrarTareas() {
		System.out.println("Operario Maestranza: Realiza tareas de mantenimiento y limpieza.");
	}

}
