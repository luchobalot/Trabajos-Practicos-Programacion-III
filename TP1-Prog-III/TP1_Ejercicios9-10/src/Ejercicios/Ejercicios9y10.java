package Ejercicios;
import java.util.Scanner;

public class Ejercicios9y10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Se le pide al usuario que ingrese los 3 angulos:
		System.out.println("Ingresar los 3 angulos: ");
		System.out.println("- Angulo A: ");
		int a = scanner.nextInt();
		System.out.println("- Angulo B: ");
		int b = scanner.nextInt();
		System.out.println("- Angulo C: ");
		int c = scanner.nextInt();
		
		// Se verifica si los angulos forman un triagnulo:
		if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
			
			// Se determina que tipo de triangulo es.
			if (a == b && b == c) { // Equilatero: todos sus lados son iguales.
				System.out.println("El trinagulo que es formo es equilatero.");
			}
			else if (a == b || b == c || a == c) { // Isoceles: dos lados iguales y uno diferente.
				System.out.println("El trinagulo que es formo es isoceles.");
			}
			else { // Escaleno: todos sus lados son distintos.
				System.out.println("El trinagulo que es formo es escaleno.");
			}
			
		}
		else { // En caso de que no se forme un triangulo:
			System.out.println("La suma de los angulos ingresados no forma un triangulo.");
		}
		
	}

}
