package ejercicio01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {

	try {
	    BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejercicio01/primos.dat"));

	    int div = 0;
	    String res = "";

	    for (int i = 2; i < 501; i++) {
		div = 0;
		for (int j = 1; j < i; j++) {
		    if (i % j == 0) {
			div++;
		    }
		}
		if (div < 2) {
		    res += i + ", ";
		}
	    }
	    if (res.charAt(res.length()-2) == ',') {
		res = res.substring(0, res.length()-2);
	    }
	    bw.write(res);
	    bw.close();
	} catch (IOException e) {
	    System.out.println("Error, el fichero no se puede crear o escribir");
	}

    }

}
