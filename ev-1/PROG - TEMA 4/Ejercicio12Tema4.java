/*
 * Ejercicio12Tema4.java
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
/*Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
que se imparten en el curso. Cada pregunta acertada sumará un punto. El
programa mostrará al final la calificación obtenida. Pásale el minicuestionario
a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
mientos en las diferentes asignaturas del curso.*/

import java.util.Scanner;

public class Ejercicio12Tema4 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Autor: Juan Nieto Acosta");
		System.out.println("Bienvenido al cuestionario de Informática");
		System.out.println("A continuación le mostraremos una serie de preguntas tipo test, a las que deberá responder con el número de la respuesta que crea correcta");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("COMENZAMOS");
		int respuesta = 0;
		double puntuacion = 0;
		System.out.println("Pregunta 1.¿Qué tipo de lenguaje es Java?");
		System.out.println("1.Interpretado | 2.Compilado | 3.Compilado e interpretado | 4.Interpretado | 5.Lenguaje de marcado");
		System.out.print("Respuesta: ");
		respuesta = s.nextInt();
		if (respuesta==3){
			System.out.println("Respuesta correcta");
			puntuacion = puntuacion + 2;
		}else if (respuesta>5||respuesta<0){
			System.out.println("Respuesta no válida");
		}else{
			System.out.println("Respuesta incorrecta");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Pregunta 2.¿Cuál es la extensión de un archivo Java?");
		System.out.println("1. .jav | 2. .java | 3. .class | 4. .jv");
		System.out.print("Respuesta: ");
		respuesta = s.nextInt();
		if (respuesta==2){
			System.out.println("Respuesta correcta");
			puntuacion= puntuacion + 1.5;
		}else if (respuesta>5||respuesta<0){
			System.out.println("Respuesta no válida");
		}else{
			System.out.println("Respuesta incorrecta");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Pregunta 3.¿Cuál de los siguientes tipos de datos no es primitivo en Java?");
		System.out.println("1. int | 2. char | 3. String | 4. boolean");
		System.out.print("Respuesta: ");
		respuesta = s.nextInt();
		if (respuesta==3){
			System.out.println("Respuesta correcta");
			puntuacion = puntuacion + 2.5;
		}else if (respuesta>5||respuesta<0){
			System.out.println("Respuesta no válida");
		}else{
			System.out.println("Respuesta incorrecta");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Pregunta 4.¿Cuál es el método principal que se ejecuta al iniciar una aplicación Java?");
		System.out.println("1. main() | 2. start() | 3. run() | 4. init()");
		System.out.print("Respuesta: ");
		respuesta = s.nextInt();
		if (respuesta==1){
			System.out.println("Respuesta correcta");
			puntuacion = puntuacion + 2.5;
		}else if (respuesta>5||respuesta<0){
			System.out.println("Respuesta no válida");
		}else{
			System.out.println("Respuesta incorrecta");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Pregunta 5.¿Cómo se declaran los comentarios en Java?");
		System.out.println("1. // Este es un comentario | 2. /* Este es un comentario */ | 3. # Este es un comentario | 4. Ambas a y b");
		System.out.print("Respuesta: ");
		respuesta = s.nextInt();
		if (respuesta==4){
			System.out.println("Respuesta correcta");
			puntuacion = puntuacion + 1.5;
		}else if (respuesta>5||respuesta<0){
			System.out.println("Respuesta no válida");
		}else{
			System.out.println("Respuesta incorrecta");
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		if (puntuacion>5){
			System.out.println("Enhorabuena, ha sacado un " + puntuacion);
		}else{
			System.out.println("Lo siento, ha suspendido con un " + puntuacion);
		}
		
	}
}

