package simulacroCamion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);

	// Variables
	int op;
	int anyo;
	// Array que almacena coches
	Coche[] coches = new Coche[6];
	// Array que almacena camiones
	Camion[] camiones = new Camion[6];
	// Contador de camiones y coches
	int contCamiones = 0;
	int contCoches = 0;
	// Contador de los vehículos mostrados
	int mostrados = 0;
	// Booleano para salir del bucle
	boolean salir = false;
	// bolean para saber si la primera iteración ha pasado
	boolean primera = true;

	// Pruebas
	String prueba = SonidosMelodia.values()[1].name();
	System.out.println(prueba);
	
	while (!salir) {
	    System.out.println();
	    System.out.println();
	    if (primera) {
		System.out.println(
			"Bienvenido al gestor de sonidos en medios de transporte. A continuación puede elegir qué acción desea.");
		primera = false;
	    } else {
		System.out.println("¿Qué opción quiere?");		
	    }
	    System.out.println("1. Fabrica coche");
	    System.out.println("2. Fabrica camión");
	    System.out.println("3. Cuenta sonidos");
	    System.out.println("4. Muestra todo los medios de transporte");
	    System.out.println("5. Clonar sonidos");
	    System.out.println("6. Salir");
	    op = s.nextInt();

	    switch (op) {
	    case 1:

		System.out.print("Escriba el año de fabricación: ");
		anyo = s.nextInt();
		coches[contCoches] = new Coche(anyo, Claxon.melodia);
		contCoches++;

		break;
	    case 2:

		System.out.print("Escriba el año de fabricación: ");
		anyo = s.nextInt();
		System.out.println("Elija el tipo de sonido (1 grave, 2 agudo)");
		op = s.nextInt() - 1;
		camiones[contCamiones] = new Camion(anyo, Claxon.values()[op]);
		contCamiones++;

		break;
	    case 3:

		System.out.println(
			"El número de sonidos de todos los cláxones es: " + MedioDeTransporte.getContadorPitos());

		break;
	    case 4:

		System.out.println("Los medios de transporte son:");
		for (Coche coche : coches) {
		    if (coche != null) {
			System.out.println(coche);
			mostrados++;
			System.out.println("----------");
		    }
		}
		for (Camion camion : camiones) {
		    if (camion != null) {
			System.out.println(camion);
			mostrados++;
			System.out.println("----------");
		    }
		}
		System.out.println("Se han mostrado " + mostrados + " medios de transporte");
		break;
	    case 5:

		System.out.println("Elija el coche: ");
		for (int i = 0; i < coches.length; i++) {
		    if (coches[i] != null) {
			System.out.println((i + 1) + ".- " + coches[i]);
		    }
		}
		op = s.nextInt();
		ArrayList<String> copia = coches[op - 1].clonaMelodia();

		break;
	    default:
		salir = true;
		break;
	    }
	}
	System.out.println("Gracias por usar esta aplicación");
    }

}
