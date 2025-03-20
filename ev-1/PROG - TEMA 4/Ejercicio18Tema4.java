/*
 * Ejercicio18Tema4.java
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

/*Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.*/

import java.util.Scanner;

public class Ejercicio18Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("En este programa le diremos la primera cifra de un número introducido por teclado");
		System.out.print("Introduce el número (máximo 5 dígitos y entero): ");
		int n = s.nextInt(), num=Math.abs(n);
		String respuesta = "La primera cifra del número " + n + " es: ";
		if (num>99999){
			System.out.print("El número solo puede contener 5 cifras");
		}else{
			if (num<10){
					respuesta+= n + " ya que solo tiene una cifra";
				}else if (num<100){
					respuesta+= num/10;
				}else if (num<1000){
					respuesta+= num/100;
				}else if (num<10000){
					respuesta+= num/1000;
				}else{
					respuesta+= num/10000;
				}
			System.out.print(respuesta);
		}
	}
}

