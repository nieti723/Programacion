/*
 * Ejercicio13Tema3.java
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

/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.*/

public class Ejercicio13Tema3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la nota del primer examen: ");
		double n1 = s.nextDouble();
		System.out.print("\n¿Qué nota quieres sacar en el trimestre?: ");
		double nT = s.nextDouble();
		double n2 = -(n1*0.40 - nT)/0.60;
		System.out.printf("Para tener un %.0f en el trimestre necesitas sacar un %.2f en el segundo examen",nT,n2);
	}
}

