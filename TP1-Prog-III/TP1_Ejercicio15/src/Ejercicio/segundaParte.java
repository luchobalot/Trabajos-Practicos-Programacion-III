package Ejercicio;

import java.util.Scanner;

public class segundaParte {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		
		
		do {
			System.out.println("\nPresione [0] para salir del programa.");
			System.out.print("Introduzca un numero entero: ");
			numero = scanner.nextInt();
			
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
		} while (numero != 0);
		
		System.out.println("\nPrograma finalizado.");
		
	}

}
