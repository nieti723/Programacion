package libro.ejercicio07;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//VARIABLES
		int random;
		int value = (int)(Math.random()*8);
		int side = (int)(Math.random()*2);
		String[] values = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
		String[] sides = {"cara", "cruz"};
		ArrayList<Moneda> monedas = new ArrayList<>();
		
		for (int i = 0; i < 6; i++) {
			System.out.print("Pulse una tecla para lanzar una moneda: ");
			s.nextLine();
			if (i!=0) {
				random = (int)(Math.random()*2);
				switch (random) {
				case 0:
					side = (int)(Math.random()*2);
					monedas.add(new Moneda(values[value], sides[side]));
					break;
				case 1:
					value = (int)(Math.random()*8);
					monedas.add(new Moneda(values[value], sides[side]));
					break;
				}
			} else {
				monedas.add(new Moneda(values[value], sides[side]));
			}
		}
		
		for (Moneda moneda : monedas) {
			System.out.println(moneda);
		}
	}
}
