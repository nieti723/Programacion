package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String palabra;
		ArrayList<String> ciudades = new ArrayList<>();
		
		System.out.println("Este programa va a pedir nombres de ciudades");
		System.out.println("hasta que usted introduzca la palabra \"fin\"");
		do {
			System.out.print("Introduzca una ciudad (o \"fin\" para salir): ");
			palabra = s.next();
			if (!palabra.equalsIgnoreCase("fin")) {
				ciudades .add(palabra);
			}
		} while (!palabra.equalsIgnoreCase("fin"));
		if (ciudades.size()>0) {
			System.out.println("\nHa introducido usted " + ciudades.size() + " ciudad(es)");
			for (String elemento : ciudades) {
				System.out.println(elemento);
			}
		}
		System.out.println("\nGracias por usar nuestro programa, vuelva pronto");
	}
}
