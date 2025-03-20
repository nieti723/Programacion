
package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej4_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        String frase;
        String[] palabras;
        System.out.print("Introduzca una frase: ");
        frase = s.nextLine();
        palabras = frase.split(" ");
        if (palabras[0].equalsIgnoreCase(palabras[palabras.length-1])) {
            System.out.println("La primera y última palabra de la frase son iguales");
        } else {
            System.out.println("La primera y última palabra de la frase no coinciden");
        }
    } 
}
