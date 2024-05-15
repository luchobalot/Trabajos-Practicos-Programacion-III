package Ejercicio1;

public class Hospital {
	public static void main(String[] args) {
		
		// Se crea una habitacon con dos camas.
		Habitacion habitacion1 = new Habitacion(2);

		// Se crean dos pacientes.
        Paciente paciente1 = new Paciente("Luciano", "Balot", 12345678);
        Paciente paciente2 = new Paciente("Pepito", "Gonzalez", 87654321);

        // Se ingresa al paciente1 y paciente2 en una habitación.
        habitacion1.internarPaciente(paciente1);
        habitacion1.internarPaciente(paciente2);

        // Se intenta internar ms pacientes en la misma habitación (Devuelve un error).
        Paciente paciente3 = new Paciente("Carlos", "Lopez", 56781234);
        habitacion1.internarPaciente(paciente3);

        // Se da del alta al paciente1.
        habitacion1.darAlta(paciente1);

        // Se intenta dar de alta a un paciente que no est internnado.
        habitacion1.darAlta(paciente1);
		
	}

}
