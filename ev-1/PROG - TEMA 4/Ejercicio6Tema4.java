/*
 * Ejercicio6Tema4.java
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

/*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =
√ 2h
g siendo g = 9.81m/s2*/

import java.util.Scanner;

public class Ejercicio6Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("En este programa calcularemos el tiempo que tarda un objeto en caer introduciendo su altura por teclado");
		System.out.print("Introduce la altura desde la que lanzaremos el objeto: ");
		double h = s.nextDouble();
		double t = 0;
		final double g = 9.81;
		if (h<0){
			System.out.println("La altura introducida no puede ser negativa");
		}else{
			t = Math.sqrt(2*h/t);
			System.out.printf("Un objeto lanzado desde %.2fm de altura tarda %.2fs en caer",h,t);
		}
		
	}
}

