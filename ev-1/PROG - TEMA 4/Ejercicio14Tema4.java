/*
 * Ejercicio14Tema4.java
 * 
 * Copyright 2024 Juan <Juan@PCJUAN>
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
/*Realiza un programa que diga si un número introducido por teclado es par y/o
divisible entre 5.*/

import java.util.Scanner;

public class Ejercicio14Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("En este programa diremos si un número introducido por teclado es par y/o divisible entre 5");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.print("Introduce el número entero a comprobar: ");
		int n = s.nextInt();
		if (n==0){
			System.out.print("El número introducido es 0");
		}else if (n%5==0 && n%2==0){
			System.out.print("El número introducido es par y divisible entre 5");
		}else if (n%5==0){
			System.out.print("El número introducido es divisible entre 5, pero no par");
		}else if (n%2==0){
			System.out.print("El número introducido es par, pero no divisible entre 5");
		}else{
			System.out.print("El número introducido no es par ni divisible entre 5");
		}
	}
}

