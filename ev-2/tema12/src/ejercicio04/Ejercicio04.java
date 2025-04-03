package ejercicio04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {

    public static void main(String[] args) {

	if (args.length < 1) {
	    System.out.println("Debe de pasar un archivo por parámetros");
	} else {
	    try {
		
		BufferedReader br = new BufferedReader(new FileReader("/home/nieto/Documentos/1ºDAW/programacion/ev-2/tema12/src/ejercicio04/" + args[0]));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/nieto/Documentos/1ºDAW/programacion/ev-2/tema12/src/ejercicio04/palabras_sort"));
		ArrayList<String> palabras = new ArrayList<>();
		String linea = "";
		
		while (linea != null) {
		    
		    linea = br.readLine();
		    if (linea != null) {
			palabras.add(linea);
		    }
		}
		Collections.sort(palabras);
		for (String palabra : palabras) {
		    bw.write(palabra + "\n");
		}
		
		br.close();
		bw.close();
		System.out.println("Archivo escrito correctamente");
	    } catch (Exception e) {
		System.out.println("Error al escribir/leer archivo");
	    }
	}
    }

}
