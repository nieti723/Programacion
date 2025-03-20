/*
 * Ejercicio6Tema2.java
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

/*Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.*/

public class Ejercicio6Tema2 {
	
	public static void main (String[] args) {
		double iva = 0.21,agua = 3.80,papel = 2.80, cola = 1.40, carne = 9.50;
		double total = (agua+papel+cola+carne);
		double ivaTotal = total*iva;
		System.out.print("Producto\tPrecio sin IVA\t\tPrecio con IVA (21%)\n");
		System.out.print("Agua\t\t" + agua + "\t\t\t" + (agua+agua*iva));
		System.out.print("\nCarne\t\t" + carne + "\t\t\t" + (carne+carne*iva));
		System.out.print("\nPapel\t\t" + papel + "\t\t\t" + (papel+papel*iva));
		System.out.print("\nCoca-Cola\t" + cola + "\t\t\t" + (cola+cola*iva));
		System.out.print("\n------------------------------------------------------");
		System.out.print("\nTOTAL\t\t"+ total + "\t\t\t" +(total+ivaTotal)+"¤");
	}
}

