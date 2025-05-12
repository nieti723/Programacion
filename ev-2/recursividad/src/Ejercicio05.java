import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        boolean valid;
        do {
            valid = true;
            try {
                System.out.print("Introduzca un número para sumar sus dígitos: ");
                numero = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("El número debe ser un entero");
                valid = false;
                s.nextLine();
            }
        } while (!valid);
        System.out.println(Funciones.sumaDigitos(numero));
    }
}
