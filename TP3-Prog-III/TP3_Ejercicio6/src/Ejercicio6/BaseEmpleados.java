package Ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseEmpleados {
	
	 private List<Empleado> empleados;

	 public BaseEmpleados() {
		 this.empleados = new ArrayList<>();
		 }

	 // Metodo para agregar un empleado a la lista.
	 public void agregarEmpleado(Empleado empleado) {
	        empleados.add(empleado);
	    }

	 // Metodo para eliminar un empleado por su ID.
	 public void eliminarEmpleado(int id) {
		 Empleado empleadoAEliminar = null;
	        for (Empleado empleado : empleados) {
	            if (empleado.getId() == id) {
	                empleadoAEliminar = empleado;
	                break;
	            }
	        }
	        if (empleadoAEliminar != null) {
	            empleados.remove(empleadoAEliminar);
	        } else { // En caso de que no encuentre al empleado por su ID.
	            System.out.println("Empleado con ID " + id + " no encontrado.");
	        }
	    }

	 // Metodo para mostrar los empleados de la lista.
	  public void mostrarTodosLosEmpleados() {
		  for (Empleado empleado : empleados) {
			  System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido() + 
					  ", Fecha de ingreso: " + empleado.getFechaIngreso());
	        }
	    }
	  
	  // Metodo para mostrar un empleado por su nombre.
	  public void buscarEmpleado(String nombreEmpleado) {
	        for (Empleado empleado : empleados) {
	            if (empleado.getNombre().equalsIgnoreCase(nombreEmpleado)) {
	                System.out.println("ID: " + empleado.getId() + 
	                                   ", Nombre: " + empleado.getNombre() + 
	                                   ", Apellido: " + empleado.getApellido() + 
	                                   ", Edad: " + empleado.getEdad() + 
	                                   ", Fecha de ingreso: " + empleado.getFechaIngreso() + 
	                                   ", Sueldo: " + empleado.getSueldo());
	                return;
	            }
	        } // En caso de no encontrar a un empleado por el nombre.
	        System.out.println("Empleado con nombre " + nombreEmpleado + " no encontrado.");
	    }
	  
	  // Metodo para ver la cantidad de empleados.
	  public void verCantidadEmpleados() {
	        System.out.println("Cantidad de empleados: " + empleados.size());
	    }
	    
}
