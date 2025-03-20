package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		ArrayList<String> ciudades = new ArrayList<>();
		ciudades.add("Madrid");
		ciudades.add("Utrera");
		ciudades.add("Sevilla");
		ciudades.add("Málaga");
		ciudades.add("Ubrique");
		ciudades.add("Granada");
		ciudades.add("Córdona");
		ciudades.add("Mérida");
		ciudades.add("Cazalla");
		ciudades.add("Ronda");
		ciudades.add("Montellano");
		int borrar;
		boolean valido;
		String nuevo;

		System.out.println("Ciudades registradas:");
		for (int i = 0; i < ciudades.size(); i++) {
			System.out.println((i + 1) + "-. " + ciudades.get(i));
		}
		do {
			valido = true;
			System.out.print("\nIntroduce una posición para modificar: ");
			borrar = s.nextInt();
			if (borrar < 1 || borrar > ciudades.size()) {
				System.out.println("Número fuera de rango");
				valido = false;
			}
		} while (!valido);
		System.out.print("Introduce el nuevo nombre: ");
		nuevo = s.nextLine();
		nuevo = s.nextLine();
		ciudades.set(borrar-1, nuevo);
		System.out.println("\nArray con elemento modificado:");
		for (String elemento : ciudades) {
			System.out.println(elemento);
		}
	}

}
