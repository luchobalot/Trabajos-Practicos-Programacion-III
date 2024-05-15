package Ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Habitacion {
	private int cantidadCamas;
	private boolean estaCompleta;
	private List<Paciente> pacientesInternados;
	
	// Constructor.
	public Habitacion(int cantidadCamas) {
		this.cantidadCamas = cantidadCamas;
		this.estaCompleta = false;
		this.pacientesInternados = new ArrayList<>();
	}
	
	// Metodos getters y setters.
	public int getCantidadCamas() {
		return cantidadCamas;
	}
	
	public void setCantidadCamas(int cantidadCamas) {
		this.cantidadCamas = cantidadCamas;
	}
	
	public boolean isEstaCompleta() {
		return estaCompleta;
	}
	
	public void setEstaCompleta(boolean estaCompleta) {
		this.estaCompleta = estaCompleta;
	}
	
	public List<Paciente> getPacientesInternados() {
		return pacientesInternados;
	}
	
	public void setPacientesInternados(List<Paciente> pacientesInternados) {
		this.pacientesInternados = pacientesInternados;
	}
	
	// Método para internar un paciente.
	public void internarPaciente(Paciente paciente) {
        if (!estaCompleta) {
            pacientesInternados.add(paciente);
            if (pacientesInternados.size() == cantidadCamas) {
                estaCompleta = true;
                System.out.println("La habitación esta completa.");
            }
        } 
        else {
            System.out.println("La habitación está completa, no se puede internar más pacientes.");
        }
    }
	
	// Método para dar de alta un paciente (eliminarlo de la lista).
	public void darAlta(Paciente paciente) {
	    if (pacientesInternados.contains(paciente)) {
	        pacientesInternados.remove(paciente);
	        estaCompleta = false;
	        System.out.println("El paciente "+ paciente.getNombre() + " " +  paciente.getApellido() + " ha sido dado de alta.");
	    } 
	    else { // Si ya se dio de alta el paciente.
	        System.out.println("ERROR. El paciente "+ paciente.getNombre() + " " +  paciente.getApellido() + " no está internado en esta habitación.");
	    }
	}

}
