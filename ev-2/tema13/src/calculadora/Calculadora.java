package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		// VARIABLES
		// Bandera para salir del bucle de la calculadora
		boolean salir = false;
		// Entero que almacena la opción elegida por el usuario
		int op;
		// Bandera que almacena si han habido errores en la ejecución de bloque try/catch
		boolean error = false;
		
		do {
			System.out.println("1. Introducir operadores");
			System.out.println("2. Suma");
			System.out.println("3. Resta");
			System.out.println("4. Multiplicación");
			System.out.println("5. División");
			System.out.println("6. Salir");
			
			do {
				error = false;
				try {
					System.out.print("Elige una opción: ");
					op = s.nextInt();				
				} catch (InputMismatchException e) {
					System.out.println("La opciónd debe ser un número");
					s.nextLine();
					error = true;
				}				
			} while (error);
		} while (!salir);
		
	}

}
