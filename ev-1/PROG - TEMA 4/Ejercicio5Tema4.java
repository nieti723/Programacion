/*
 * Ejercicio5Tema4.class.java
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

public class Ejercicio5Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Vamos a resolver una ecuación con la siguiente estructura:");
		System.out.println("ax+b=0");
		System.out.print("Introduce un valor para a: ");
		double a =  s.nextDouble();
		System.out.print("Introduce un valor para b: ");
		double b = s.nextDouble();
		double x = -(b/a);
		if (a==0 && b==0){
			System.out.printf("Ambos números no puede tomar el valor 0");
		}else if (a==0){
			System.out.println("a no puede tomar el valor 0");
		}else{
			System.out.print("Ecuación: " + a + "x+" + b + "=0");
			System.out.printf("\nx=%.2f",x);
		}
	}
}

