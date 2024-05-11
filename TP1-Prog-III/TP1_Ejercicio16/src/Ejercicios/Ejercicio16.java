package Ejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        double millas, kilometros;

        do {
            System.out.print("Ingresar cantidad en millas. [0] para salir del programa): ");
            millas = scanner.nextDouble();
            
            // Mientras millas sea distinto de 0 se ejecuta el do-while.
            if (millas != 0) {
                kilometros = millas * 1.6093; //  1 Milla equivale a 1.6093 Kilómetros
                System.out.println("\nEl equivalente a " + millas + " millas son " + kilometros + " kilometros.");
            }
        } while (millas != 0);
        
        // Se cierra el scanner.
        scanner.close();
    }

}