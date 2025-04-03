package ejercicio03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 {

    public static void main(String[] args) {

	if (args.length < 3) {
	    System.out.println("El número de argumentos de entrada no es válido, se necesitan 3 archivos");
	} else {

	    try {
		BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
		BufferedReader br2 = new BufferedReader(new FileReader(args[1]));
		BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

		String l1 = "";
		String l2 = "";

		while (l1 != null || l2 != null) {
		    l1 = br1.readLine();
		    l2 = br2.readLine();
		    if (l1 != null || l2 != null) {
			bw.write(l1 + "\n");
			bw.write(l2 + "\n");
		    }
		}
		br1.close();
		br2.close();
		bw.close();
	    } catch (IOException e) {
		System.out.println("Se ha producido un error");
	    }
	}

    }
}
