/*
 * Ejercicio1Tema2.java
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
 
 /*Escribe un programa en el que se declaren las variables enteras x e y. Asignales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación.*/


public class Ejercicio1Tema2 {
	
	public static void main (String[] args) {
		int x = 144, y = 999;
		double resultado = (double)x/(double)y;
		
		
		System.out.print("Suma: " + (x+y) + "\n");
		System.out.print("Resta: " + (x-y) + "\n");
		System.out.print("Multiplicacion: " + (x*y) + "\n");
		System.out.print("Division: " + resultado);
	}
}

