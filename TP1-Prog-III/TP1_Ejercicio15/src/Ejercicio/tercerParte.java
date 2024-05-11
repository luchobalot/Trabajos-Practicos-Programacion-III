package Ejercicio;
import java.util.Scanner;

public class tercerParte {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b;
		char respuesta;
		
		do {
			do { // Se le solicita al usuario que ingrese los numeros A y B
				System.out.print("Ingresa el numero A:");
				a = scanner.nextInt();
				System.out.print("Ingresa el numero B:");
				b = scanner.nextInt();
				
				if (a>=b) { // En caso de que A sea menor que B.
					System.out.println("Error. El numero A debe ser menor que el numero B.");
				}
			} while (a>=b); 
			
			// Se comprueba e imprime cuales son los numeros pares entre el rango de los numeros ingresados.
			System.out.print("Los numeros pares entre "+ a + "y" + b + "son los siguientes: ");
			for (int i = a; i <= b; i++) {
				if (i % 2 == 0) {
					System.out.print(i+" ");
				}
			}
			// Se le consulta al usuario si quiere ingresar más numeros.
			System.out.println("\nDesea ingresar nuevamente otros numeros? (S/N): ");
			respuesta = scanner.next().charAt(0);
			
		} while (respuesta == 'S' || respuesta == 's'); // Se va a seguir ejecutando siempre que el usuario ponga S (Si).
		
		
		
		scanner.close();
	}
}
