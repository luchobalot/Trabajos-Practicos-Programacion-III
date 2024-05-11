// Programa que determina si el num ingresado por el usuario es par o impar:
package Ejercicios;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		// Se crea un objeto Scanner para leer la entrada del usuario desde la consola.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        
        // Se lee el número ingresado por el usuario
        long numero = scanner.nextInt();
        
        // Se cierra el objeto Scanner después de su uso.
        scanner.close();
        
        // Se determina si el número es par o impar.
        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par.");
        } else {
            System.out.println(numero + " es un numero impar.");
        }
		
}

}
