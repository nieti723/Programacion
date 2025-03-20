package boletin.ejercicio05;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException, IOException {
		Scanner s = new Scanner(System.in);

		int op = 0;
		int vehiculo = 0;
		int distancia;
		int id;
		int pos = 0;
		boolean salir = false;
		boolean valido = false;
		Bicicleta bicicleta;
		Coche coche;
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();

		do {
			do {
				System.out.print("VEHÍCULOS\n" + "=========\n" + "1. Crear un vehículo\n" + "2. Anda con la bicicleta\n"
						+ "3. Haz el caballito con la bicicleta\n" + "4. Anda con el coche\n"
						+ "5. Quema rueda con el coche\n" + "6. Ver kilometraje de la bicicleta\n"
						+ "7. Ver kilometraje del coche\n" + "8. Ver kilometraje total\n" + "9. Ver vehículos creados\n"
						+ "10. Salir\n" + "Elige una opción (1-8): ");
				op = s.nextInt();
				if (op < 1 || op > 9) {
					System.out.println("Introduce una opción válida");
				}
			} while (op < 1 || op > 9);
			System.out.println();
			switch (op) {
			case 1:
				do {
					System.out.print("1. Bicicleta\n" + "2. Coche\n" + "¿Qué vehículo va a usar?: ");
					vehiculo = s.nextInt();
					if (vehiculo < 1 || vehiculo > 2) {
						System.out.println("El número introducido no es válido, inténtelo de nuevo\n");
					}
				} while (vehiculo < 1 || vehiculo > 2);
				System.out.println();
				switch (vehiculo) {
				case 1:
					vehiculos.add(new Bicicleta());
					break;
				case 2:
					vehiculos.add(new Coche());
					break;
				}
				System.out.println(vehiculos.get(vehiculos.size() - 1));
				System.out.println();
				break;
			case 2:
				valido = false;
				System.out.print("Introduzca el identificador de su vehículo: ");
				id = s.nextInt();
				for (int i = 0; i < vehiculos.size(); i++) {
					if (vehiculos.get(i).getId() == id) {
						if (vehiculos.get(i) instanceof Bicicleta) {
							valido = true;
							pos = i;
						}
					}
				}
				if (valido) {
					System.out.println("¿Qué distancia va a recorrer?");
					distancia = s.nextInt();

					bicicleta = (Bicicleta) vehiculos.get(pos);
					bicicleta.andar(distancia);
					vehiculos.add(pos, bicicleta);
					System.out.println(bicicleta);
				} else {
					System.out.println(
							"El identificador de vehículo introducido no coincide con una bicicleta de las almacenadas");
				}
				System.out.println();
				break;
			case 3:
				valido = false;
				System.out.print("Introduzca el identificador de su vehículo: ");
				id = s.nextInt();
				for (int i = 0; i < vehiculos.size(); i++) {
					if (vehiculos.get(i).getId() == id) {
						if (vehiculos.get(i) instanceof Bicicleta) {
							valido = true;
							pos = i;
						}
					}
				}
				if (valido) {
					bicicleta = (Bicicleta) vehiculos.get(pos);
					bicicleta.caballito();
					vehiculos.add(pos, bicicleta);
					System.out.println(bicicleta);
				} else {
					System.out.println(
							"El identificador de vehículo introducido no coincide con una bicicleta de las almacenadas");
				}
				System.out.println();
				break;
			case 4:
				valido = false;
				System.out.print("Introduzca el identificador de su vehículo: ");
				id = s.nextInt();
				for (int i = 0; i < vehiculos.size(); i++) {
					if (vehiculos.get(i).getId() == id) {
						if (vehiculos.get(i) instanceof Coche) {
							valido = true;
							pos = i;
						}
					}
				}
				if (valido) {
					System.out.println("¿Qué distancia va a recorrer?");
					distancia = s.nextInt();
					coche = (Coche) vehiculos.get(pos);
					coche.andar(distancia);
					vehiculos.add(pos, coche);
					System.out.println(coche);
				} else {
					System.out.println(
							"El identificador de vehículo introducido no coincide con un coche de los almacenados");
				}
				System.out.println();
				break;
			case 5:
				valido = false;
				System.out.print("Introduzca el identificador de su vehículo: ");
				id = s.nextInt();
				for (int i = 0; i < vehiculos.size(); i++) {
					if (vehiculos.get(i).getId() == id) {
						if (vehiculos.get(i) instanceof Coche) {
							valido = true;
							pos = i;
						}
					}
				}
				if (valido) {
					coche = (Coche) vehiculos.get(pos);
					coche.quemaRueda();
					vehiculos.add(pos, coche);
					System.out.println(coche);
				} else {
					System.out.println(
							"El identificador de vehículo introducido no coincide con un coche de los almacenados");
				}
				System.out.println();
				break;
			case 6:
				valido = false;
				System.out.print("Introduzca el identificador de su vehículo: ");
				id = s.nextInt();
				for (int i = 0; i < vehiculos.size(); i++) {
					if (vehiculos.get(i).getId() == id) {
						if (vehiculos.get(i) instanceof Bicicleta) {
							valido = true;
							pos = i;
						}
					}
				}
				if (valido) {
					System.out.println(vehiculos.get(pos));
				} else {
					System.out.println(
							"El identificador de vehículo introducido no coincide con una bicicleta de las almacenadas");
				}
				System.out.println();
				break;
			case 7:
				valido = false;
				System.out.print("Introduzca el identificador de su vehículo: ");
				id = s.nextInt();
				for (int i = 0; i < vehiculos.size(); i++) {
					if (vehiculos.get(i).getId() == id) {
						if (vehiculos.get(i) instanceof Coche) {
							valido = true;
							pos = i;
						}
					}
				}
				if (valido) {
					System.out.println(vehiculos.get(pos));
				} else {
					System.out.println(
							"El identificador de vehículo introducido no coincide con un coche de los almacenados");
				}
				System.out.println();
				break;
			case 8:
				System.out.println("Kilómetros totales: " + Vehiculo.getKilometrosTotales());
				System.out.println();
				break;
			case 9:
				System.out.println("Numéro de vehículos creados: " + Vehiculo.getVehiculosCreados());
				System.out.println();
				for (Vehiculo vehiculo2 : vehiculos) {
					System.out.println(vehiculo2);
					System.out.println("----------------------------");
				}
			default:
				salir = true;
				break;
			}
		} while (!salir);
	}

}
