package boletin2.ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio02 {

	public static void main(String[] args) {


		ArrayList<String> days = new ArrayList<>();
		days.add("L");
		days.add("M");
		days.add("X");
		days.add("J");
		days.add("V");
		days.add("S");
		days.add("D");
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int daysCounter = 0;

		int userMonth = 0;
		String userDay = "";

		userMonth = Integer.parseInt(args[0]) - 1;
		userDay = args[1].toUpperCase();
		daysCounter = days.indexOf(userDay);

		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("mes" + args[0] + ".txt"));
			for (int i = 0; i < (daysCounter); i++) {
				bf.write("\t");
			}
			
			for (int i = 1; i <= months[userMonth]; i++) {
				bf.write(i + "" + days.get(daysCounter) + "\t");
				daysCounter++;
				if (daysCounter == 6) {
					daysCounter = 0;
					bf.newLine();
				}
			}
			
			bf.close();
			System.out.println("Archivo generado con éxito");
		} catch (IOException e) {
			System.out.println("Error al escribir el fichero");
		}
		

	}

}
