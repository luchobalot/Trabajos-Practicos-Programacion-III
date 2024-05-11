package Ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		// Se le pide al usuario que ingrese un numero.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        long factorial = 1;
        
        // En caso de que sea numero negativo:
        if (numero < 0) {
            System.out.println("Error. Ingrese un numero positivo.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            } // Se imprime el factorial.
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
