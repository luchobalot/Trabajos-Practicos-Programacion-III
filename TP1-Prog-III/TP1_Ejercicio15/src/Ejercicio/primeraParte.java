package Ejercicio;
import java.util.Scanner;

public class primeraParte {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Introduzca un numero entero: ");
		numero = scanner.nextInt();
		
		while (numero != 0) {
			
			if (numero > 0) {
				System.out.println("El numero que ingresaste es positivo.");
			}
			else {
				System.out.println("El numero que ingresaste es negativo.");
			}
			
			if (numero % 2 == 0) {
				System.out.println("El numero que ingresaste es par.");
			}
			else {
				System.out.println("El numero que ingresaste es inpar.");
			}
			
			System.out.println("\nPresione [0] para salir del programa.");
			numero = scanner.nextInt();
		}
		
		System.out.println("\nPrograma finalizado.");
		
	}

}
