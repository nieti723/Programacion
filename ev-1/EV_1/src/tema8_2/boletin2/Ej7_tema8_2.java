package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej7_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        String frase, palabra;
        String[] palabras;
        boolean encontrada = false;

        System.out.print("Introduzca una frase: ");
        frase = s.nextLine();
        System.out.print("\nIntroduzca una palabra a buscar en esa frase: ");
        palabra = s.next();
        palabras = frase.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].charAt(palabras[i].length()-1) == '.' || palabras[i].charAt(palabras[i].length()-1) == ',' || palabras[i].charAt(palabras[i].length()-1) == ';') {
                palabras[i] = palabras[i].substring(0, palabras[i].length()-1);
            }
        }
        for (int i = 0; i < palabras.length && !encontrada; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                encontrada = true;
            }
        }
        if (encontrada) {
            System.out.println("La palabra " + palabra + " se encuentra en la frase introducida");
        } else {
            System.out.println("La palabra " + palabra + " no se encuentra en la frase introducida");
        }
    }
}
