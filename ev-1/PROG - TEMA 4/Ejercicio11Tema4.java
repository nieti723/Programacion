/*
 * Ejercicio11Tema4.java
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
/*Escribe un programa que dada una hora determinada (horas y minutos),
calcule los segundos que faltan para llegar a la medianoche.*/

import java.util.Scanner;

public class Ejercicio11Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("En este programa calcularemos los segundos que quedan hasta medianoche desde la hora introducida por el usuario");
		System.out.print("Introduce los minutos ");
		int min = s.nextInt();
		System.out.print("Introduce la hora ");
		int hora = s.nextInt();
		int restante = 0;
		if (hora<0 || min<0 || hora>24 || min>59){
			System.out.print("Los valores introducidos no pueden ser negativos, ni mayores a 24 o 60");
		}else if((hora==24 || hora==0) && min==0){
			System.out.print("Feliz año nuevo");
		}else if (min==0){
			hora = (24-hora)*3600;
			restante = min + hora;
			System.out.print("Quedan " + restante + " segundos para medianoche");
		}else{
			min = (60-min)*60;
			hora = (24-(hora+1))*3600;
			restante = hora+min;
			System.out.print("Quedan " + restante + " segundos para medianoche");
		}
	}
}

