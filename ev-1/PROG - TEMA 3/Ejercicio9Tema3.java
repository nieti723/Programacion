/*
 * Ejercicio9Tema3.java
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

/*Escribe un programa que calcule el volumen de un cono según la fórmula V =
1
3 πr2h*/


public class Ejercicio9Tema3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE VOLUMEN DE UN CONO");
		System.out.println("---------------------------");
		System.out.println("Introduce el radio de la base");
		double r = s.nextDouble();
		System.out.println("Introduce la altura del cono");
		double h = s.nextDouble();
		System.out.println("El volumen del cono con base de radio " + r + " y altura " + h + " es igual a: " + ((1.0/3.0)*((Math.PI*(Math.pow(r,2)))*h)));
	}
}

