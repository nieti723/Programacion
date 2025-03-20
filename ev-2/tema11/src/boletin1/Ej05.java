package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej05 {

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
		int buscar;
		boolean valido;

		System.out.println("Ciudades registradas:");
		for (int i = 0; i < ciudades.size(); i++) {
			System.out.println((i+1) + "-. " + ciudades.get(i));
		}
		do {
			valido = true;
			System.out.print("\nIntroduce una posición para buscar: ");
			buscar = s.nextInt();
			if (buscar<1 || buscar > ciudades.size()) {
				System.out.println("Número fuera de rango");
				valido = false;
			}
			
		} while (!valido);
		System.out.println("En la posición " + buscar + " se encuentra " + ciudades.get(buscar-1));

	}

}
