/*
 * Ejercicio2Tema4.java
 * 
 * Copyright 2024 juann <juann@DESKTOP-NQO1TN8>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
 
/*Realiza un programa que pida una hora por teclado y que muestre luego
buenos dï¿½as, buenas tardes o buenas noches segï¿½n la hora. Se utilizarï¿½n los
tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sï¿½lo se tienen en
cuenta las horas, los minutos no se deben introducir por teclado.*/ 

import java.util.Scanner;

public class Ejercicio2Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la hora (sin minutos): ");
		int hora = s.nextInt();
		if (hora<=5){
			System.out.print("Buenas noches");
		}else if (hora<=12){
			System.out.print("Buenos días");
		}else if (hora<=20){
			System.out.print("Buenas tardes");
		}else if (hora<=24){
			System.out.print("Buenas noches");
		}else{
			System.out.println("Hora no válida");
		}
	}
}

