package tema8_2;

import java.io.IOException;
import java.util.Scanner;

public class Sorteo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner s = new Scanner(System.in);

		// Variables
		String nombres, opcion;
		String[] candidatos;
		boolean salir = false, vacio = false, valido = false;
		int cantidad, op;

		// Programa
		System.out.println("Introduce los nombres (separados por comas):");
		nombres = s.nextLine();
		candidatos = nombres.split(",");
		for (int i = 0; i < candidatos.length; i++) {
			candidatos[i] = candidatos[i].trim();
		}
		do {
			System.out.println("---MENÚ---");
			System.out.println("1. Elegir cantidad de nombres");
			System.out.println("2. Un solo nombre");
			System.out.print("Elija una opción: ");
			op = s.nextInt();
			s.nextLine();
			if (op < 1 || op > 2) {
				System.out.println("La opción introducida no es válida");
				System.out.print("Pulse una tecla para continuar: ");
				s.nextLine();
			}
		} while (op < 1 || op > 2);
		switch (op) {
		case 1:
			System.out.print("¿Cuántos nombres necesita?: ");
			cantidad = s.nextInt();
			System.out.print("Ganadores:\n ");
			for (int i = 0; i < cantidad; i++) {
				int num;
				do {
					num = (int) (Math.random() * candidatos.length);
					if (candidatos[num].equals("")) {
						valido = false;
					} else {
						valido = true;
					}
				} while (!valido);
				System.out.println(candidatos[num]);				
				candidatos[num] = "";
			}
			break;
		case 2:
			do {
				int num;
				do {
					num = (int) (Math.random() * candidatos.length);
					if (candidatos[num].equals("")) {
						valido = false;
					} else {
						valido = true;
					}
				} while (!valido);
				System.out.println("Ha salido " + candidatos[num]);
				candidatos[num] = "";
				System.out.print("Para salir escriba \"salir\": ");
				opcion = s.nextLine();
				if (opcion.equalsIgnoreCase("salir")) {
					salir = true;
				}
				vacio = true;
				for (int i = 0; i < candidatos.length; i++) {
					if (!candidatos[i].equals("")) {
						vacio = false;
					}
				}
			} while (!salir && !vacio);
			if (vacio) {
				System.out.println("Lista vacía");
			}
			if (salir) {
				System.out.println("Gracias, ¡vuelva pronto!");
			}
			break;
		}
	}
}
