/*
 * Ejercicio8Tema3.java
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

public class Ejercicio8Tema3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE SUELDO SEMANAL");
		System.out.println("-----------------------------");
		int sHora = 12;
		System.out.println("Salario por hora: " + sHora);
		System.out.println("Introduzca las horas que ha trabajado esta semana");
		int horas = s.nextInt();
		int sueldo = horas*sHora;
		System.out.println("Su sueldo esta semana es de: " + sueldo);
	}
}

