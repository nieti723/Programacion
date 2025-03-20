package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej11_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        //Variables
        String frase;
        String[] palabras;
        boolean valida = false;
        int longitudMax = 0, pos = 0, contadorLetraA, repetidaA = 0;

        //Primero pedimos la frase y comprobamos que acaba en un punto
        do {
            System.out.print("Introduzca una frase (debe acabar en punto): ");
            frase = s.nextLine();
            if (frase.charAt(frase.length()-1) == '.') {
                valida = true;
            }
            if (frase.charAt(frase.length()-2) == '.') {
                valida = false;
            }
            if (!valida) {
                System.out.println("La frase introducida no es válida, introduzca una nueva");
                System.out.print("Pulse una tecla para continuar");
                s.nextLine();
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } while (!valida);
        palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = palabras[i].trim();
            if (palabras[i].charAt(palabras[i].length()-1) == '.' || palabras[i].charAt(palabras[i].length()-1) == ',') {
                palabras[i] = palabras[i].substring(0, palabras[i].length()-1);
            }
        }
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()>longitudMax) {
                longitudMax = palabras[i].length();
                pos = i;
            }
            if (palabras[i].length() > 8 && palabras[i].length()<16) {
                contadorLetraA = 0;
                for (int j = 0; j < palabras[i].length(); j++) {
                    if (palabras[i].charAt(j) == 'a') {
                        contadorLetraA++;
                    }
                }
                if (contadorLetraA > 3) {
                    repetidaA++;
                }
            }
        }
        System.out.println("La palabra más larga es \"" + palabras[pos] + "\" con una longitud de " + palabras[pos].length() + " caracteres y se encuentra en la posición " + (pos+1));
        System.out.println("Hay un total de " + repetidaA + " palabras de entre 8 y 16 caracteres que contienen la letra a más de 3 veces");

    }
}
