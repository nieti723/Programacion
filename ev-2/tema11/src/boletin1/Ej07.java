package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej07 {

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
		String borrar;

		System.out.println("Ciudades registradas:");
		for (String elemento : ciudades) {
			System.out.println(elemento);
		}

		System.out.print("\nIntroduce una ciudad para borrar: ");
		borrar = s.next();
		borrar = borrar.substring(0, 1).toUpperCase() + borrar.substring(1).toLowerCase();
		if (ciudades.contains(borrar)) {
			ciudades.remove(borrar);
		} else {
			System.out.println("Lo sentimos, no hemos podido encontrar " + borrar + " en nuestro registro");
		}
		System.out.println("\nNueva lista:");
		for (String elemento : ciudades) {
			System.out.println(elemento);
		}
	}

}
