package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej8_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        
        String cadena;
        char[] caracteres;
        int[] codigoCaracteres;
        
        System.out.print("Introduzca una cadena para procesar: ");
        cadena = s.nextLine();
        caracteres = cadena.toCharArray();
        codigoCaracteres = new int[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            codigoCaracteres[i] = caracteres[i];
        }
        System.out.println("Cadena pasada a código ASCII:");
        for (int i : codigoCaracteres) {
            System.out.print(i);
        }
        System.out.println("\nCadena obtenida a partir del código ASCII:");
        for (int i : codigoCaracteres) {
            System.out.print((char)i);
        }
    }
}
