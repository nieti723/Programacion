package ejercicio02;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio2 {

    public static void main(String[] args) {
	
	try {
	    
	    BufferedReader br = new BufferedReader(new FileReader("src/ejercicio01/primos.dat"));
	    String line = "";
	    
	    while (line != null) {
		
		line = br.readLine();
		if (line != null) {
		    System.out.println(line);
		}
		
	    }
	    
	} catch (Exception e) {
	    System.out.println("Fichero inaccesible");
	}

    }

}
