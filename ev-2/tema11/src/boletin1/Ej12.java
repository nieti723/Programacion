package boletin1;

import java.util.ArrayList;
import java.util.Collections;

public class Ej12 {

	public static void main(String[] args) {
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
		
		Collections.sort(ciudades);
		for (String ciudad : ciudades) {
			System.out.println(ciudad);
		}
	}

}
