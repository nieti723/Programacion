/*
 * Ejercicio4Tema4.java
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
import java.util.Scanner;

/*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
euros la hora.*/

public class Ejercicio4Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("---SALARIO SEMANAL---");
		int pHora = 12, horas, hExtra = 0;
		System.out.println("Sueldo/hora: " + pHora + " euros");
		System.out.println("(A partir de las 40H, la hora se cobra a 16 euros)");
		System.out.print("Introduce las horas que ha trabajado esta semana: ");
		horas = s.nextInt();
		
		if (horas<0 || horas>52){
			System.out.print("Las horas introducidas no son válidas");
		}else if (horas>40){
			hExtra = horas-40;
			horas = horas-hExtra;
			System.out.println("Su sueldo de esta semana es: " + (horas*12+hExtra*16));
		}else{
			System.out.println("Su sueldo esta semana es de: " + (horas*12));
		} 
	}
}

