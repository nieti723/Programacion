/*
 * Ejercicio3Tema4.java
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


import java.util.Scanner;

public class Ejercicio3Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("¿Qué dia de la semana es?");
		System.out.print("Introduce un día (con números): ");
		String dia = s.next();
		switch (dia){
			case "1":
				System.out.print("Lunes");
			break;
			case "2":
				System.out.print("Martes");
			break;
			case "3":
				System.out.print("Miércoles");
			break;
			case "4":
				System.out.print("Jueves");
			break;
			case "5":
				System.out.print("Viernes");
			break;
			case "6":
				System.out.print("Sábado");
			break;
			case "7":
				System.out.print("Domingo");
			break;
			default:
				System.out.print("Día no válido");
			}
	}
}

