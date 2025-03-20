package libro.ejercicio08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {

		new ProcessBuilder().command("cmd", "/c", "cls").inheritIO().start().waitFor();
		// VARIBLES
		ArrayList<Carta> cartas = new ArrayList<>();
		String[] palos = { "basto", "espada", "copa", "oro" };
		String[] valores = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota",
				"Caballo", "Rey" };
		int palo = (int) (Math.random() * 4);
		int valor = (int) (Math.random() * 12);
		boolean valido = false;
		int cont = 0;

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
		}
	}

}
