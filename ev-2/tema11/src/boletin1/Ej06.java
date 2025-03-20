package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej06 {

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

		System.out.println("Ciudades registradas:");
		for (int i = 0; i < ciudades.size(); i++) {
			System.out.println((i + 1) + "-. " + ciudades.get(i));
		}
		do {
			valido = true;
			System.out.print("\nIntroduce una posición para borrar: ");
			borrar = s.nextInt();
			if (borrar < 1 || borrar > ciudades.size()) {
				System.out.println("Número fuera de rango");
				valido = false;
			}
		} while (!valido);
		ciudades.remove(borrar-1);
		System.out.println("\nArray con elemento borrado:");
		for (String elemento : ciudades) {
			System.out.println(elemento);
		}
	}

}
