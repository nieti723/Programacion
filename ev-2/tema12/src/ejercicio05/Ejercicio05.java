package ejercicio05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio05 {

    public static void main(String[] args) {

	if (args.length < 2) {
	    System.out.println("Número de parámetros incorrecto");
	} else {
	    
	    try {
		
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
		
		String linea = "";
		
		while (linea != null) {
		    linea = br.readLine();
		    if (linea != null) {
			if (!linea.trim().equals("")) {
			    if (linea.trim().charAt(0) != '/' && linea.trim().charAt(0) != '*') {
				bw.write(linea + "\n");							
			    }
			} else {
			    bw.write(linea + "\n");
			}
		    }
//		    if (linea != null) {
//			System.out.println(linea.length());
//			if (linea.length() != 0) {
//			    if (linea.trim().charAt(0) != '*' && linea.trim().charAt(0) != '/') {
//				System.out.println(linea.trim());
//			    }
//			}
//		    }
		}
		
		br.close();
		bw.close();
	    } catch (IOException e) {
			
		e.printStackTrace();
	    }
	}

    }

}
