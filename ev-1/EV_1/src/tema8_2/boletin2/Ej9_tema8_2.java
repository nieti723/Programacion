package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej9_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        String cadena;
        char[] caracteres;

        System.out.print("Introduzca una cadena: ");
        cadena = s.nextLine();
        caracteres = cadena.toCharArray();
        System.out.println("Cadena invertida: ");
        for (int i = caracteres.length-1; i >= 0; i--) {
            System.out.print(caracteres[i]);
        }
    }
}
