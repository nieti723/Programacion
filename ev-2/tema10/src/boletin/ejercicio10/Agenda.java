package boletin.ejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);

		boolean salir = false;
		int op;
		String nombre;
		String telefono;
		boolean repetido;
		boolean encontrado;
		int pos = 0;
		ArrayList<Contacto> contactos = new ArrayList<>();

		do {
			do {
				System.out.println("--- AGENDA TELEFÓNICA ---");
				System.out.println("1. Añadir contacto");
				System.out.println("2. Listar contactos");
				System.out.println("3. Buscar contacto");
				System.out.println("4. Eliminar contacto");
				System.out.println("5. Salir");
				System.out.print("Elija una opción: ");
				op = s.nextInt();
				System.out.println();
				if (op < 1 || op > 5) {
					System.out.println("Opción no válida");
					System.out.println();
				}
			} while (op < 1 || op > 5);
			s.nextLine();
			switch (op) {
			case 1:
				System.out.print("Introduzca el nombre: ");
				nombre = s.nextLine();
				repetido = false;
				for (Contacto contacto : contactos) {
					if (contacto != null) {
						if (contacto.getNombre().equalsIgnoreCase(nombre)) {
							System.out.println("El nombre introducido ya se encuentra en la agenda");
							repetido = true;
						}
					}
				}
				if (!repetido) {
					System.out.print("Introduzca el teléfono: ");
					telefono = s.nextLine();
					Contacto c = new Contacto(nombre, telefono);
					contactos.add(c);
					System.out.println("\nContacto añadido");
				}
				System.out.print("Volviendo al menú principal");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(250);
					System.out.print(".");
				}
				System.out.println("\n");
				break;
			case 2:
				if (contactos.size() == 0) {
					System.out.println("No hay contactos que mostrar");
				} else {
					System.out.println("------- CONTACTOS -------");
					for (Contacto contacto : contactos) {
						System.out.println("- " + contacto);
					}
					System.out.println("-------------------------");
				}
				System.out.print("Pulse una tecla para volver al menú: ");
				s.nextLine();
				System.out.print("Volviendo al menú principal");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(250);
					System.out.print(".");
				}
				System.out.println("\n");
				break;
			case 3:
				if (contactos.size() == 0) {
					System.out.println("No hay contactos que buscar");
				} else {
					encontrado = false;
					System.out.print("Introduzca el nombre a buscar: ");
					nombre = s.nextLine();
					for (Contacto contacto : contactos) {
						if (contacto.getNombre().equalsIgnoreCase(nombre)) {
							System.out.println(contacto);
							encontrado = true;
						}
					}
					if (!encontrado) {
						System.out.println("El nombre no se encuentra en la agenda");
					}
				}
				System.out.print("\nPulse una tecla para volver al menú: ");
				s.nextLine();
				System.out.print("Volviendo al menú principal");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(250);
					System.out.print(".");
				}
				System.out.println("\n");
				break;
			case 4:
				if (contactos.size() == 0) {
					System.out.println("No hay contactos que borrar");
				} else {
					encontrado = false;
					System.out.print("Introduzca el nombre: ");
					nombre = s.nextLine();
					for (int i = 0; i < contactos.size(); i++) {
						if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
							encontrado = true;
							pos = i;
						}
					}
					if (!encontrado) {
						System.out.println("El contacto no se encuentra en la agenda");
					} else {
						contactos.remove(pos);
						System.out.println("Contacto borrado");
					}
				}
				System.out.print("Volviendo al menú principal");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(250);
					System.out.print(".");
				}
				System.out.println("\n");
				break;
			default:
				salir = true;
				break;
			}
		} while (!salir);
		System.out.println("Gracias, vuelva pronto");
	}

}
