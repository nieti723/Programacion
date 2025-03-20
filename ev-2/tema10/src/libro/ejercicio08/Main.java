package libro.ejercicio08;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args){

		// VARIBLES
		ArrayList<Carta> cartas = new ArrayList<>();
		String[] palos = { "basto", "espada", "copa", "oro" };
		String[] valores = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota",
				"Caballo", "Rey" };
		int palo;
		int valor;

		while (cartas.size() < 10) {
			
			// Generamos los valores
			palo = (int) (Math.random() * 4);
			valor = (int) (Math.random() * 12);
			// Generamos el objeto carta
			Carta carta = new Carta(palos[palo], valores[valor], valor);
			// Condicional para ver si la carta está dentro
			if (!cartas.contains(carta)) {
				cartas.add(carta);
			}
		}
		
		// Imprimimos por pantalla las cartas resultantes
		Collections.sort(cartas);
		for (Carta carta : cartas) {
			
			System.out.println(carta);
		}
	}

}
