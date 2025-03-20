package NietoAcostaJuan;

import java.io.IOException;
import java.util.Scanner;

public class Ej1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        // Este es un comando para borrar pantalla en la consola, lo dejo comentado para
        // que no dé error, pero funciona igualmente
        // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);
        // Declaración de variables
        int valor = 0, resultado = 0, cont = 0, resto = 0, valido = 0, sumaValidos = 0, contValido = 0;
        double media = 0;
        String continuar = "", nombre = "", apellido1 = "", apellido2 = "";
        // Introducción
        System.out.println("Este programa pedirá un número para calcular su raíz y su nombre");
        System.out.println("para el registro");
        System.out.println("----------------------------------------------------------------");
        System.out.print("Pulse una tecla para continuar: ");
        continuar = s.nextLine();
        // Mismo comando para borrar pantalla
        // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        // Programa
        System.out.print("Introduzca su nombre (solo nombre): ");
        nombre = s.nextLine();
        System.out.print("Introduzca su primer apellido: ");
        apellido1 = s.nextLine();
        System.out.print("Introduzca su segundo apellido: ");
        apellido2 = s.nextLine();
        do {
            System.out.print("Introduzca el número: ");
            valor = s.nextInt();
            if (valor < 0) {
                System.out.println("No existe la raíz de un número negativo");
                System.out.println("Introduzca un número válido");
            }
        } while (valor < 0);
        if (valor == 0) {
            System.out.println("La raiz de 0 es 0");
            System.out.println("Usuario que realiza la consulta: " + nombre + " " + apellido1 + " " + apellido2);
        } else {
            while (resultado < valor) {
                cont++;
                resultado = (int) Math.pow(cont, 2);
                if (resultado > valor) {
                    System.out.println(cont + "² = " + resultado + "(nos pasamos)");
                } else if ((int) Math.pow(cont + 1, 2) > valor) {
                    System.out.println("\"" + cont + "² = " + resultado + "\"");
                    sumaValidos += resultado;
                    valido = resultado;
                    contValido++;
                } else {
                    System.out.println(cont + "² = " + resultado);
                    sumaValidos += resultado;
                    contValido++;
                }
            }
            resto = valor - valido;
            if (resto != 0) {
                System.out.println("Resto: " + resto);
            }
            System.out.println("Usuario que realiza la consulta: " + nombre + " " + apellido1 + " " + apellido2);
        }
        if (sumaValidos==0) {
            System.out.println("La media total sumando sobre las operaciones válidas es: 0");
        }else{
            media = (double) sumaValidos / (contValido);
            System.out.printf("La media total sumando sobre las operaciones válidas es: %.2f\n", media);
        }
        System.out.println("Gracias por confiar en nuestra aplicación, vuelva pronto!");
    }
}
