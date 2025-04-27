import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        boolean error  = false;
        int num;
        int res = 0; 

        System.out.println("--- CALCULADORA DE FACTORIAL ---");
        do {
            error = false;
            try {
                System.out.print("Introduzca un número para calcular su factorial: ");
                num = s.nextInt();
                res = Funciones.factorial(num);
                System.out.println(num + "! = " + res);
            } catch (InputMismatchException e) {
                System.out.println("El valor introducido debe ser un número entero");
                s.nextLine();
                error = true;
            }
        } while (error);
    }
}
