package boletin2.ejercicio01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio01 {

    public static void main(String[] args) {
	
	if (args.length<2) {
	    System.out.println("El número de argumentos no es válido");
	} else {
	    try {
		BufferedWriter bw = new BufferedWriter(new FileWriter(args[0]));
		
		String texto = mostrar(args);
		escribir(bw, args, texto);
		
		bw.close();
	    } catch (IOException e) {
		e.printStackTrace();
	    }	    
	}


    }

    public static void escribir(BufferedWriter bw, String[] args, String texto) {
	
	try {
	    bw.write(args[1]);
	    bw.newLine();
	    bw.write(texto);
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    public static String mostrar(String[] args){
	args[1] = args[1].trim();
	String res = "";
	for (int i = 0; i < args[1].length(); i++) {
	    if (Character.isLowerCase(args[1].charAt(i))) {
		res += args[1].substring(i, i+1).toUpperCase();
	    } else if (Character.isUpperCase(args[1].charAt(i))) {
		res += args[1].substring(i, i+1).toLowerCase();
	    }
	}
	System.out.println(res);
	return res;
    }
    
}
