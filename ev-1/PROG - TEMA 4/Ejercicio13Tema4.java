/*
 * Ejercicio13Tema4.java
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
/*Escribe un programa que ordene tres números enteros introducidos por
teclado*/

import java.util.Scanner;

public class Ejercicio13Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bienvenido, en este programa se ordenarán tres números introducidos por el usuario");
		System.out.println("Introduzca los números");
		int n1 = s.nextInt(), n2 = s.nextInt(), n3 = s.nextInt();
		
		if (n1>n2 && n1>n3){
			if (n2>n3){
				System.out.print("Números ordenados: " + n1 + ", " + n2 + ", " + n3);
			}else{
				System.out.print("Números ordenados: " + n1 + ", " + n3 + ", " + n2);
			}
		}else if (n2>n1 && n2>n3){
			if (n1>n3){
				System.out.print("Números ordenados: " + n2 + ", " + n1 + ", " + n3);
			}else{
				System.out.print("Números ordenados: " + n2 + ", " + n3 + ", " + n1);
			}
		}else{
			if (n2>n1){
				System.out.print("Números ordenados: " + n3 + ", " + n2 + ", " + n1);
			}else{
				System.out.print("Números ordenados: " + n3 + ", " + n1 + ", " + n2);
			}
		}
	}
}

