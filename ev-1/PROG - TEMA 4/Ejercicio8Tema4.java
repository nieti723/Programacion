/*
 * Ejercicio8Tema4.java
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


public class Ejercicio8Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("En este programa calcularemos la media aritmética de tres notas introducidas por teclado y le diremos cual es su valoración en el boletín");
		System.out.print("Introduce la primera nota: ");
		double n1 = s.nextDouble();
		System.out.print("Introduce la segunda nota: ");
		double n2 = s.nextDouble();
		System.out.print("Introduce la tercera nota: ");
		double n3 = s.nextDouble();
		double media = 0;
		if (n1<0||n2<0||n3<0||n1>10||n2>10||n3>10){
			System.out.print("Las notas introducidas no pueden ser mayores de 10 o menores de 0");
		}else{
			media = Math.round((n1+n2+n3)/3);
		}
		if (media<5){
			System.out.printf("Insuficiente: %.0f",media);
		}else if (media<6){
			System.out.printf("Suficiente: %.0f",media);
		}else if (media<7){
			System.out.printf("Bien: %.0f",media);
		}else if (media<9){
			System.out.printf("Notable: %.0f",media);
		}else{
			System.out.printf("Sobresaliente: %.0f",media);
		}
	}
}

