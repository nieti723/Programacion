package libro.ejercicio12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		new ProcessBuilder().command("cmd", "/c", "cls").inheritIO().start().waitFor();
		// VARIBLES
		//Arraylist que contendrá las cartas
		ArrayList<Carta> cartas = new ArrayList<>();
		//Aray con los palos
		String[] palos = { "basto", "espada", "copa", "oro" };
		//Array con los valores de las cartas
		String[] valores = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota",
				"Caballo", "Rey" };
		int palo = (int) (Math.random() * 4);
		int valor = (int) (Math.random() * 12);
		boolean valido = false;
		int cont = 0;
		//HashMap que contendrá los valores que pueden tomar las cartas
		HashMap<String, Integer> valoresCartas = new HashMap<>();
		//Añadimos los valores al HashMap
		valoresCartas.put("As", 11);
		valoresCartas.put("tres", 10);
		valoresCartas.put("Sota", 2);
		valoresCartas.put("Caballo", 3);
		valoresCartas.put("Rey", 4);
		//Contador de los puntos
		int puntos = 0;

		while (cont < 10) {
			// Reiniciamos la variable a false para que haga la comprobación
			valido = false;
			if (cont > 0) {
				// Este bucle lo que hace es comprobar los valores generados
				while (!valido) {
					// Ponemos la variable a true para cambiarla si no está
					valido = true;
					// Generamos los valores
					palo = (int) (Math.random() * 4);
					valor = (int) (Math.random() * 12);
					// Este bucle recorre los datos que hay en el ArrayList y comprueba si los
					// generados coinciden con alguno de los ya introducidos
					for (Carta carta : cartas) {
						// Si coincide pone la variable a false para volver al principio del bucle
						if (carta.getPalo().equals(palos[palo]) && carta.getCarta().equals(valores[valor])) {
							valido = false;
						}
					}
				}
			}
			// Aquí añadimos la carta a la lista ya comprobada
			cartas.add(new Carta(palos[palo], valores[valor], valor));

			cont++;
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
