/*
 * Ejercicio10Tema4.java
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
/*Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.*/

import java.util.Scanner;

public class Ejercicio10Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("En este programa le diremos el horóscopo correspondiente a una fecha introducida por teclado");
		System.out.print("Introduce el día: ");
		int dia = s.nextInt();
		System.out.print("Introduce el mes: ");
		int mes = s.nextInt();
		if ((mes==3 && dia>=21)||(mes==4 && dia<=20)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Aries");
		}else if ((mes==4 && dia>=21)||(mes==5 && dia<=21)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Tauro");
		}else if ((mes==5 && dia>=22)||(mes==6 && dia<=21)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Géminis");
		}else if ((mes==6 && dia>=22)||(mes==7 && dia<=22)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Cáncer");
		}else if ((mes==7 && dia>=23)||(mes==8 && dia<=22)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Leo");
		}else if ((mes==8 && dia>=23)||(mes==9 && dia<=22)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Virgo");
		}else if ((mes==9 && dia>=23)||(mes==10 && dia<=22)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Libra");
		}else if ((mes==10 && dia>=23)||(mes==11 && dia<=22)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Escorpio");
		}else if ((mes==11 && dia>=23)||(mes==12 && dia<=21)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Sagitario");
		}else if ((mes==12 && dia>=22)||(mes==1 && dia<=20)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Capricornio");
		}else if ((mes==1 && dia>=21)||(mes==2 && dia<=19)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Acuario");
		}else if ((mes==2 && dia>=20)||(mes==3 && dia<=20)){
			System.out.print("El horóscopo correspondiente al " +dia+ "/"+mes+" es Piscis");
		}else{
			System.out.println("Los valores introducidos no son válidos");
		}
	}
}

