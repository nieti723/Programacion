package ejercicio05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio05 {

    public static void main(String[] args) {
	
	if (args.length < 0) {
	    System.out.println("Número de parámetros incorrecto");
	} else {
	    
	    try {
		
		BufferedReader br = new BufferedReader(new FileReader("src/ejercicio05/Ejercicio05.java"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejercicio05/Ejercicio05v2.java"));
		
		String linea = "";
		
		while (linea != null) {
		    linea = br.readLine();
		    if (linea != null) {
			if (!linea.equals("")) {
			    if (linea.trim().charAt(0) != '*' || linea.trim().charAt(0) != '/') {
				System.out.println(linea);
			    }
			}
		    }
		}
		
		br.close();
		bw.close();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}

    }

}
