package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> ciudades = new ArrayList<>();
		ciudades.add("Madrid");
		ciudades.add("Utrera");
		ciudades.add("Sevilla");
		ciudades.add("Málaga");
		ciudades.add("Madrid");
		ciudades.add("Granada");
		ciudades.add("Córdona");
		ciudades.add("Madrid");
		ciudades.add("Cazalla"); 
		ciudades.add("Ronda");
		ciudades.add("Madrid");
		ArrayList<String> borra = new ArrayList<>();
		String borrar;

		System.out.println("Ciudades registradas:");
		for (int i = 0; i < ciudades.size(); i++) {
			System.out.println((i + 1) + "-. " + ciudades.get(i));
		}
		System.out.print("\nIntroduce una ciudad para borrar: ");
		borrar = s.next();
		borrar = borrar.substring(0, 1).toUpperCase() + borrar.substring(1).toLowerCase();
		borra.add(borrar);
		if (ciudades.contains(borrar)) {
			ciudades.removeAll(borra);
		} else {
			System.out.println("Lo sentimos, no hemos podido encontrar \"" + borrar + "\" en nuestro registro");
		}
		System.out.println("\nNueva lista:");
		for (String elemento : ciudades) {
			System.out.println(elemento);
		}
	}

}
