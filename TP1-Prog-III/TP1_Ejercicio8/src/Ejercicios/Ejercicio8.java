package Ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario desde la consola.
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un carácter: ");
        
        // Se lee el carácter ingresado por el usuario.
        char caracter = scanner.next().charAt(0);
        
        // Se cierra el objeto Scanner después de su uso.
        scanner.close();
        
        // Se comprueba si el carácter es una letra mayúscula.
        if (Character.isUpperCase(caracter)) {
            System.out.println("El carácter que ingresaste es una letra mayuscula.");
        } else {
            System.out.println("El carácter que ingresaste no es una letra mayuscula.");
        }
    }

}
