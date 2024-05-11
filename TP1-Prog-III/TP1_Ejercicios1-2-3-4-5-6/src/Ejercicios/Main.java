package Ejercicios;

public class Main {
	
public static void main(String[] args) {
		
		// Se crean personas a partir de la clase Persona.
		Persona persona1 = new Persona("Lautaro", "Martinez", 'M', 24, "Bahia Blanca");
		persona1.mostrarDatosPersona();
		
		Persona persona2 = new Persona("Luciano","Balot");
		System.out.println("");
		persona2.mostrarDatosPersona();
		
		// Se ejecuta método de clase Persona para saber si la persona es mayor.
		System.out.println("");
		persona1.mayorEdadPersona();
		
		// Se crean autos a partir de la clase Auto:
		Auto auto1 = new Auto("Gris","CUJ032",1999,"Fiat Palio",125000);
		Auto auto2 = new Auto("Rojo","OJA267",2014,"Honda Civic",98000);
		Auto auto3 = new Auto("Negro","AUY190",1997,"Ford Fiesta",234000);
		
		System.out.println("");
		System.out.println("============================================");
		
		// Se llama al método de kilometrajeMayor para saber si superan los 100mil km.
		System.out.println("Autos con mas de 100.000 kilometros: ");
		auto1.kilometrajeMayor();
		auto2.kilometrajeMayor();
		auto3.kilometrajeMayor();
		
		System.out.println("");
		System.out.println("============================================");
		
		// Se crean celulares a partir de la clase Celular.
		Celular celular1 = new Celular("S24", "Samsung", 256, true, 291000432);
		Celular celular2 = new Celular("13 Pro Max", "Apple", 128, false, 291666321);
		
		// Se llama a los distintos métodos de la clase Celular.
		celular1.realizarLlamada();
		celular2.cortarLlamada();
	}

}
