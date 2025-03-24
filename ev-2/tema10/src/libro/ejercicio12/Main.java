package libro.ejercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import libro.ejercicio08.Carta;

public class Main {

	public static void main(String[] args) {

		// VARIBLES
		// Arraylist que contendrá las cartas
		ArrayList<Carta> cartas = new ArrayList<>();
		// Aray con los palos
		String[] palos = { "basto", "espada", "copa", "oro" };
		// Array con los valores de las cartas
		String[] valores = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota",
				"Caballo", "Rey" };
		int palo = (int) (Math.random() * 4);
		int valor = (int) (Math.random() * 12);
		// HashMap que contendrá los valores que pueden tomar las cartas
		HashMap<String, Integer> valoresCartas = new HashMap<>();
		// Añadimos los valores al HashMap
		valoresCartas.put("As", 11);
		valoresCartas.put("Tres", 10);
		valoresCartas.put("Sota", 2);
		valoresCartas.put("Caballo", 3);
		valoresCartas.put("Rey", 4);
		// Contador de los puntos
		int puntos = 0;

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
			if (valoresCartas.containsKey(carta.getCarta())) {
				puntos += valoresCartas.get(carta.getCarta());
			}
		}
		System.out.println("Tienes " + puntos + " puntos");
	}

}
