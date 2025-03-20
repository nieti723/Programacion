/*
 * Ejercicio9Tema4.java
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
/*Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).*/

import java.util.Scanner;
public class Ejercicio9Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("En este programa resolveremos una ecuación de segundo grado con la siguiente fórmula:");
		System.out.println("ax²+bx+c=0");
		System.out.print("Introduce el valor de a: ");
		double a = s.nextDouble();
		System.out.print("Introduce el valor de b: ");
		double b = s.nextDouble();
		System.out.print("Introduce el valor de c: ");
		double c = s.nextDouble();
		double raiz = (Math.pow(b,2))-4*a*c;
		if (raiz<0){
			System.out.println("La raíz cuadrada no puede ser negativa");
		}else if (a==0){
			System.out.println("El valor de a no puede ser igual a 0");
		}else{
			System.out.println("Las ecuaciones de segundo grado tienen dos resultados: ");
			System.out.println("x1 :" + ((-b+Math.sqrt(raiz))/(2*a)));
			System.out.println("x2 :" + ((-b-Math.sqrt(raiz))/(2*a)));
		}
	}
}

