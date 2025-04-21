package ejerciciosMoodle.ejercicio02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio02 {

    public static void main(String[] args) {
	
	try {
	    BufferedReader br = new BufferedReader(new FileReader("src/ejerciciosMoodle/ejercicio02/Fichero.txt"));
	    
	    String linea = "";
	    
	    while (linea != null) {
		
		linea = br.readLine();
		if (linea != null) {
		    linea = linea.replaceAll(" ", "");
		    System.out.println(linea);
		}
	    }
	    
	    br.close();
	} catch (IOException e) {
	    System.out.println(e.getMessage());
	}
	
	
    }

}
