/*
 * Ejercicio1Tema3.java
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
import java.util.Scanner; //Importar

public class PruebaTema3 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in); //Declarar el objeto
		
		System.out.println("Bienvenido al programa");
		System.out.println("Escriba su nombre");
		String nombre = s.next();
		s.nextLine();
		System.out.println("Haga una despedida");
		String despedida = s.nextLine();
		//Esta es la solción al problema de un s.nextLine despues de otro escaneo diferente
		//System.out.println("Cuantos euros tienes hoy");
		//int euros = s.nextInt();
		//double temperaturaEnUtrera = s.nextDouble();
		System.out.println(nombre + " dice " + despedida);		
	}
}

