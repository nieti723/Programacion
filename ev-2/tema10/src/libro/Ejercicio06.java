package libro;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//Inicializamos el HashMap
		HashMap<String, String> usuarios = new HashMap<>();
		//Introducimos los datos
		usuarios.put("usuario", "usuario");
		usuarios.put("paquito", "1234");
		usuarios.put("Fran Romero Velazquez", "5678");
		//Variables
		//Cadenas que guardan los inputs del usuario
		String user = "";
		String pass = "";
		//Bandera para controlar inputs
		boolean valid = false;
		//Bandera para controlar si ha acertado la contraseña
		boolean correct = false;
		//Contador de intentos
		int count = 0;
		//Intentos totales
		int tries = 3;
		
		while (!correct && count<tries) {
			System.out.println("---INTENTOS RESTANTES: " + (tries-count) + "---");
			System.out.print("Introduzca el usuario: ");
			user = s.nextLine();
			if (usuarios.containsKey(user)) {
				valid = true;
			} else {
				System.out.println("El usuario no se encuentra en el registro");
				valid = false;
			}
			if (valid) {
				System.out.print("Introduzca la contraseña: ");
				pass = s.nextLine();
				if (usuarios.get(user).equals(pass)) {
					System.out.println("Ha accedido al área restringida");
					correct = true;
				} else {
					System.out.println("Lo siento, no tiene acceso al área restringida");
				}
			}
			count++;
		}
		if (!correct) {
			System.out.println("Intentos agotados");
		}
	}

}
