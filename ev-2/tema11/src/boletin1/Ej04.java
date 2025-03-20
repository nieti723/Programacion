package boletin1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej04 {

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
		String buscar;
		
		System.out.println("Ciudades registradas:");
		for (String elemento : ciudades) {
			System.out.println(elemento);
		}
		
		System.out.print("\nIntroduce una ciudad para buscar: ");
		buscar = s.next();
		buscar = buscar.substring(0, 1).toUpperCase() + buscar.substring(1).toLowerCase();
		if (ciudades.contains(buscar)) {
			System.out.println(buscar + " está entre las ciudades registradas en la posición " + (ciudades.indexOf(buscar) + 1));
		} else {
			System.out.println("Lo sentimos, no hemos podido encontrar " + buscar + " en nuestro registro");
		}
		
	}

}
