package ejerciciosMoodle.ejercicio01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio01 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	
	try {
	    BufferedReader br = new BufferedReader(new FileReader("src/ejerciciosMoodle/ejercicio01/Nombre.txt"));
	    BufferedWriter bw = new BufferedWriter(new FileWriter("src/ejerciciosMoodle/ejercicio01/NombreCompleto.txt"));
	    
	    String nombreCompleto = "";
	    
	    
	    nombreCompleto += br.readLine() + " ";
	    
	    System.out.print("Introduce tus apellidos: ");
	    nombreCompleto += s.nextLine();
	    
	    bw.write(nombreCompleto);
	    
	    br.close();
	    bw.close();
	    
	    System.out.println("Documento escrito correctamente");
	} catch (IOException e) {
	    System.out.println("Error");
	}

    }

}
