package boletin1;

import java.util.ArrayList;

public class Ej01 {

	public static void main(String[] args) {
		ArrayList<String> ciudades = new ArrayList<>();
		ciudades.add("Madrid");
		ciudades.add("Utrera");
		ciudades.add("Sevilla");
		ciudades.add("Málaga");
		ciudades.add("Ubrique");
		System.out.println("Número de ciudades: " + ciudades.size());
		for (String elemento : ciudades) {
			System.out.println(elemento);
		}
	}
}
