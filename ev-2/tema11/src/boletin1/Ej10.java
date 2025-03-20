package boletin1;

import java.util.ArrayList;

public class Ej10 {

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
		String[] arrayCiudades = ciudades.toArray(new String[ciudades.size()]);

		System.out.println("ArrayList pasado a Array: ");
		for (String elemento : arrayCiudades) {
			System.out.println(elemento);
		}
	}

}
