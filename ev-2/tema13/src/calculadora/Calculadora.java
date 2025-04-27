package calculadora;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.ExcepcionDivision;
import exceptions.ExcepcionIntervalo;
import exceptions.ExcepcionRango;
import exceptions.ExcepcionResta;
import exceptions.ExcepcionesPropias;

public class Calculadora {

	public static void main(String[] args) throws InterruptedException, IOException {
		new ProcessBuilder("clear").inheritIO().start().waitFor();
		Scanner s = new Scanner(System.in);

		// VARIABLES
		// Bandera para salir del bucle de la calculadora
		boolean salir = false;
		// Entero que almacena la opción elegida por el usuario
		int op = 0;
		// Bandera que almacena si han habido errores en la ejecución de bloque
		// try/catch
		boolean error = false;
		// Enteros que almacenan los operandos
		int n1 = 0;
		int n2 = 0;
		// Máximo entero que se va a poder meter
		int max = 1000;

		do {
			System.out.println("--- CALCULADORA ---");
			System.out.println("1. Operandos actuales");
			System.out.println("2. Introducir operadores");
			System.out.println("3. Suma");
			System.out.println("4. Resta");
			System.out.println("5. Multiplicación");
			System.out.println("6. División");
			System.out.println("7. Salir");

			do {
				error = false;
				try {
					System.out.print("Elige una opción: ");
					op = s.nextInt();
					ExcepcionesPropias.fueraIntervalo(1, 7, op);
				} catch (InputMismatchException e) {
					System.out.println("La opción debe ser un número entero");
					s.nextLine();
					error = true;
				} catch (ExcepcionIntervalo e) {
					System.out.println(e.getMessage());
					error = true;
				}
			} while (error);
			new ProcessBuilder("clear").inheritIO().start().waitFor();
			switch (op) {
				case 1:
					if (!operandosVacios(n1, n2)) {
						System.out.println("Operando 1: " + n1);
						System.out.println("Operando 2: " + n2);
					}
					volverMenu(s);
					break;
				case 2:
					do {
						error = false;
						try {
							System.out.print("Introduce el primer operando: ");
							n1 = s.nextInt();
							ExcepcionesPropias.fueraRango(n1, max);
						} catch (InputMismatchException e) {
							System.out.println("Debe introducir un número entero");
							s.nextLine();
							error = true;
						} catch (ExcepcionRango e) {
							System.out.println(e.getMessage());
							error = true;
						}
					} while (error);

					do {
						error = false;
						try {
							System.out.print("Introduce el segundo operando: ");
							n2 = s.nextInt();
							ExcepcionesPropias.fueraRango(n2, max);
						} catch (InputMismatchException e) {
							System.out.println("Debe introducir un número entero");
							s.nextLine();
							error = true;
						} catch (ExcepcionRango e) {
							System.out.println(e.getMessage());
							error = true;
						}
					} while (error);
					volverMenu(s);
					break;
				case 3:
					if (!operandosVacios(n1, n2)) {
						System.out.println("--- SUMA ---");
						System.out.println("Operando 1: " + n1);
						System.out.println("Operando 2: " + n2);
						System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
					}
					volverMenu(s);
					break;
				case 4:
					if (!operandosVacios(n1, n2)) {
						try {
							ExcepcionesPropias.restaNegativa(n1, n2);
							System.out.println("--- RESTA ---");
							System.out.println("Operando 1: " + n1);
							System.out.println("Operando 2: " + n2);
							System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
						} catch (ExcepcionResta e) {
							System.out.println(e.getMessage());
						}
					}
					volverMenu(s);
					break;
				case 5:
					if (!operandosVacios(n1, n2)) {
						System.out.println("--- MULTIPLICACIÓN ---");
						System.out.println("Operando 1: " + n1);
						System.out.println("Operando 2: " + n2);
						System.out.println(n1 + " × " + n2 + " = " + (n1 * n2));
					}
					volverMenu(s);
					break;
				case 6:
					if (!operandosVacios(n1, n2)) {
						try {
							ExcepcionesPropias.divisionInfinita(n2);
							System.out.println("--- DIVISIÓN ---");
							System.out.println("Operando 1: " + n1);
							System.out.println("Operando 2: " + n2);
							System.out.println(n1 + " ÷ " + n2 + " = " + (n1 / n2));
						} catch (ExcepcionDivision e) {
							System.out.println(e.getMessage());
						}
					}
					volverMenu(s);
					break;
				case 7:
					salir = true;
					break;
			}

		} while (!salir);
		System.out.println("Gracias, vuelva pronto!");
	}

	public static boolean operandosVacios(int n1, int n2) {
		if (n1 == 0 && n2 == 0) {
			System.out.println("No hay operandos actualmente, debe introducirlos primero");
			return true;
		}
		return false;
	}

	public static void volverMenu(Scanner s) throws InterruptedException, IOException {
		System.out.print("Pulse una tecla para volver al menú: ");
		s.nextLine();
		s.nextLine();
		new ProcessBuilder("clear").inheritIO().start().waitFor();

	}

}
