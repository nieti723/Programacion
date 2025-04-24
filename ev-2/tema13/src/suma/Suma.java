package suma;

import java.util.InputMismatchException;
import java.util.Scanner;

import lib.ExcepcionesPropias;

public class Suma {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n1;
		int n2;
		int suma;
		boolean error = false;
		
		do {
			error = false;
			try {
				System.out.print("Introduce el primer operando: ");
				n1 = s.nextInt();
				ExcepcionesPropias.esPar(n1);
				System.out.print("Introduce el segundo operando: ");
				n2 = s.nextInt();
				ExcepcionesPropias.esPar(n2);
				suma = n1+n2;
				System.out.println("Resultado: " + suma);
			} catch (InputMismatchException e) {
				System.out.println("El operando debe ser un número");
				error = true;
				s.nextLine();
			} catch (ExcepcionPares e) {
				System.out.println(e.getMessage());
				error = true;
			}			
		} while (error);
		
	}
	
}
