package ejercicio03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br1 = new BufferedReader(new FileReader("src/ejercicio03/fichero1.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("src/ejercicio03/fichero2.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejercicio03/resultado.txt"));
			
			String l1 = "";
			String l2 = "";
			
			while ( l1 != null || l2 != null) {
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
