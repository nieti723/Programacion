package boligrafo;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Boligrafo> boligrafos = new ArrayList<>();
        boligrafos.add(new Boligrafo("Pilot", "SGrip", 1.0));
        boligrafos.add(new Boligrafo("Pilot", "G2", 1.3));
        boligrafos.add(new Boligrafo("Bic", "Cristal", 0.5));
        boligrafos.add(new Boligrafo("Pilot", "G2", 1.3));
        
        for (Boligrafo boligrafo : boligrafos) {
			System.out.println(boligrafo);
		}
        System.out.println();
        System.out.print("¿El bolígrafo 1 y 2 son iguales?: ");
        System.out.println(boligrafos.get(0).equals(boligrafos.get(1)));
        System.out.print("¿El bolígrafo 2 y 4 son iguales?: ");
        System.out.println(boligrafos.get(1).equals(boligrafos.get(3)));
        
        Collections.sort(boligrafos);
        System.out.println();
        System.out.println("Bolígrafos ordenados por marca: ");
        for (Boligrafo boligrafo : boligrafos) {
			System.out.println(boligrafo);
		}
	}

}
