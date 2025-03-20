/*
 * Ejercicio1Tema4.java
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

/*Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.*/

import java.util.Scanner;

public class Ejercicio1Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("¿Qué asignatura toca a primera ese día?");
		System.out.print("Introduce un día de la semana (minúsculas sin tildes): ");
		String dia = s.next();
		switch (dia){
			case "lunes":
			case "jueves":
			case "viernes":
			 System.out.print("Programación");
			break;
			case "martes":
			 System.out.print("Lenguaje de Marcas");
			break;
			case "miercoles":
			 System.out.print("IPE I");
			break;

			default:
				System.out.print("Día no válido, introduzca un valor entre 1-5");
			}
	}
}

