package tema8_2.boletin2;

import java.io.IOException;
import java.util.Scanner;

public class Ej10_tema8_2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        
        String nombreCompleto;
        String[] elementosNombre;

        System.out.print("Introduzca su nombre: ");
        nombreCompleto = s.nextLine();
        elementosNombre = nombreCompleto.split(" ");
        System.out.print("Sus iniciales: ");
        for (String string : elementosNombre) {
            System.out.print(string.toUpperCase().charAt(0));
        }
    }
}
