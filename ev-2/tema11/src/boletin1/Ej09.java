package boletin1;

import java.util.ArrayList;

public class Ej09 {

	public static void main(String[] args) {
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
		String modificado;

		System.out.println("Ciudades registradas:");
		for (int i = 0; i < ciudades.size(); i++) {
			System.out.println((i + 1) + "-. " + ciudades.get(i));
		}
		System.out.println("\nCiudades modificadas:");
		for (int i = 0; i < ciudades.size(); i++) {
			modificado = "Cdd ";
			modificado += ciudades.get(i);
			ciudades.set(i, modificado);
			System.out.println((i + 1) + "-. " + ciudades.get(i));
		}
	}

}
