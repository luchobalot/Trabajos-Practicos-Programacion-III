package Ejercicios;
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int a, b;
        
        
        do {
        	System.out.print("Ingrese el numero A: ");
        	a = scanner.nextInt();
        	System.out.print("\nIngrese el numero B: ");
        	b = scanner.nextInt();
        	
        	if (a>=b) { // En caso de que el numero A sea mayor que B.
        		System.out.println("El numero A debe ser menor que el B.");
        	}
      
        } while (a>=b);
        
        int i;
        for(i=a+1; i<b; i++) { // a+1 para que no imprima el A.
        	if (i % 2 == 0) {
        		System.out.print(i+" ");
        	}
    
        }
        
	}
	
}
