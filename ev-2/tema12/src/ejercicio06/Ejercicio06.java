package ejercicio06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio06 {

    public static void main(String[] args) {

	try {
	    BufferedReader br = new BufferedReader(new FileReader(args[0]));

	    String linea = "";
	    String palabra = args[1];
	    String[] palabras;
	    int cont = 0;

	    while (linea != null) {

		linea = br.readLine();
		if (linea != null) {
		    linea = linea.replaceAll("[,.]", "");
		    palabras = linea.split(" ");
		    for (String p : palabras) {
			if (p.equalsIgnoreCase(palabra)) {
			    cont++;
			}
		    }
		}
	    }
	    br.close();
	    if (cont > 0) {
		if (cont == 1) {
		    System.out.println("La palabra \"" + palabra + "\" se repite " + cont + " vez");
		} else {
		    System.out.println("La palabra \"" + palabra + "\" se repite " + cont + " veces");
		}
	    } else {
		System.out.println("La palabra \"" + palabra + "\" no se encuentra en el texto");
	    }
	} catch (FileNotFoundException e) {
	    System.out.println(e.getMessage());
	    System.out.println("No se encuentra el fichero");
	} catch (IOException e) {
	    System.out.println(e.getMessage());
	}
    }

}
