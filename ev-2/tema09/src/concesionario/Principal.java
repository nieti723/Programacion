package concesionario;

import java.util.Scanner;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);

		// VARIABLES
		// Opción del menú
		int op;
		// Contador de vehículos que se pueden crear
		int cont = 10;
		// Contador de vehículos creados
		int creados = 0;
		// Array de coches
		Coche[] coches = new Coche[cont];
		String matricula;
		String modelo;
		String motor;
		double precio;
		String color;
		//Posicion que ocupa el vehículo en el array
		int pos;
		
		do {
			do {
				System.out.println("------CONCESIONARIO------");
				System.out.println("-----------------------------------");
				System.out.println("Debe escoger una de las siguientes opciones: ");
				System.out.println("1. Añadir nuevo vehículo (" + cont + " restantes)");
				System.out.println("2. Ver los detalles de un vehículo");
				System.out.println("3. Ver todos los vehículos");
				System.out.println("4. Ver la inversión total del concesionario");
				System.out.println("5. Salir");
				System.out.print("Opción: ");
				op = s.nextInt();
				s.nextLine();
				if (op < 1 || op > 5) {
					System.out.println("Opción no válida, introduzca de nuevo");
				}
			} while (op < 1 || op > 5);
			
			switch (op) {
			case 1:
				if (cont==0) {
					System.out.println("No se pueden añadir más vehículos");
				} else {
					System.out.print("Introduzca la matrícula: ");
					matricula = s.nextLine();
					System.out.print("Introduzca el modelo: ");
					modelo = s.nextLine();
					System.out.print("Introduzca el motor: ");
					motor = s.nextLine();
					System.out.print("Introduzca el precio: ");
					precio = s.nextDouble();
					s.nextLine();
					System.out.print("Introduzca el color: ");
					color = s.nextLine();
					coches[creados] = new Coche(matricula, modelo, motor, precio, color);
					System.out.println("\n" + coches[creados]);
					creados++;
					cont--;				
				}
				break;
			case 2:
				System.out.print("Introduzca la posición del vehículo: ");
				pos = s.nextInt();
				Coche.datosCoche(coches, pos);
				break;
			case 3:
				for (Coche coche : coches) {
					if (coche != null) {
						System.out.println(coche);
						System.out.println("------------------------------------------");						
					}
				}
				break;
			case 4:
				System.out.println("Inversión total: " + Coche.getInversion());
				break;
			default:
				break;
			}
		} while (op!=5);
	}

}
