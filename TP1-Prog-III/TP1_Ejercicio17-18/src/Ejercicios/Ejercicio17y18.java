// Debido a que no entendi la relacion entre el ejercicio 18 y el 9. Decidi
// combinar el ejercicio 18 con el 17 agregando que imprima si se trabaja o no el dia correspondiente.
package Ejercicios;
import java.util.Scanner;


public class Ejercicio17y18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		do { // Se le pide al usuario que ingrese un numero del 1 al 7.
			System.out.println("Ingresar un numero del 1 al 7: ");
			numero = scanner.nextInt();
			
			if (numero < 1 || numero > 7) { // En caso de que escriba un numero fuera de ese rango.
				System.out.println("Error. El numero debe estar entre 1 y 7.");
			}
		} while (numero < 1 || numero > 7);
		
		// Condicional Switch con los dias de la semana.
		switch (numero) {
		case 1:
			System.out.println("El dia de la semana es Lunes.");
			System.out.println("Lamentablemente se trabaja...es dia de semana!.");
			break;
		case 2:
			System.out.println("El dia de la semana es Martes.");
			System.out.println("Lamentablemente se trabaja...es dia de semana!.");
			break;
		case 3:
			System.out.println("El dia de la semana es Miercoles.");
			System.out.println("Lamentablemente se trabaja...es dia de semana!.");
			break;
		case 4:
			System.out.println("El dia de la semana es Jueves.");
			System.out.println("Lamentablemente se trabaja...es dia de semana, pero ya queda menos!.");
			break;
		case 5:
			System.out.println("El dia de la semana es Viernes");
			System.out.println("Lamentablemente se trabaja...pero es viernesss!.");
			break;
		case 6:
			System.out.println("El dia de la semana es Sabdo.");
			System.out.println("Hoy no se trabaja...es fin de semana!.");
			break;
		case 7:
			System.out.println("El dia de la semana es Domingo.");
			System.out.println("Hoy no se trabaja...es fin de semana!.");
			break;
		}
		
		
		scanner.close();
	}

}

		