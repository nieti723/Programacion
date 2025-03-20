package tema9;

import java.util.Scanner;

public class Sensor {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		AlarmaDeTemperatura al1 = new AlarmaDeTemperatura();
		Timbre t1 = new Timbre();
		int temperatura;
		
		System.out.println("Este programa realizará 5 comprobaciones de variación de temperatura");
		System.out.println("\nLa temperatura de la CPU del ordenador está inicialmente a 40º");
		System.out.println("A partir de 80 grados celsius sonará una alarma");
		for (int i = 0; i < 5; i++) {
			System.out.print("\nEscriba la variación de temperatura registrada en su CPU: ");
			temperatura = s.nextInt();
			al1.cambioTemperatura(temperatura);
			t1.timbre(al1.getTemperatura());
			System.out.println(al1);
		}
	}
}
