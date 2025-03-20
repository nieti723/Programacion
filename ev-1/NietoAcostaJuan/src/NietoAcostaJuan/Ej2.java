package NietoAcostaJuan;

import java.util.Scanner;

public class Ej2 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String continuar = "";
        //Presentación
        System.out.println("---CUADERNO DE CALIGRAFÍA---");
        System.out.println("Bienvenido, en este programa se le pedirá que ingrese el número de letras que desea practicar");
        System.out.println("y la altura de estas, la letra representada es una K del revés");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Pulse cualquier tecla para continuar:");
        continuar = s.nextLine();
        //Variables
        int noValido = 0, altura = 0, nLetras = 0, intros = 0;
        boolean noErrors = true;
        while (altura<6 || altura>12 || (altura>=6 && altura<=12 && altura%2!=0)) {
            System.out.print("Introduce la altura de la letra: ");
            altura = s.nextInt();
            if (altura<6 || altura>12 || (altura>=6 && altura<=12 && altura%2!=0)) {
                System.out.println("Altura no válida, debe introducirla de nuevo");
                noValido++;
                noErrors = false;
            }
            if (noValido==3) {
                System.out.println("Recuerda que la altura debe estar entre 6 y 12 y ser par");
                noValido = 0;
            }
        }
        while (nLetras<4 || nLetras>7) {
            System.out.print("Introduce el nº de letras a mostrar: ");
            nLetras = s.nextInt();
            if (nLetras<4 || nLetras>7) {
                System.out.println("Número de letras no válido, debe introducirlo de nuevo");
                noErrors = false;
            }  
        }
        int anchura = (altura/2)+2;
        for (int i = 0; i < nLetras; i++) {
            int diagonalInferior = anchura-4;
            for (int j = 0; j <= altura/2; j++) {
                for (int j2 = 0; j2 < anchura; j2++) {
                    if ((j< altura/2+1 && j==j2) || j2==anchura-2 || (j==altura/2 && (j2==anchura-1 || j2==anchura-3))) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int j = 0; j < altura/2-1; j++) {
                for (int j2 = 0; j2 < anchura; j2++) {
                    if (j2==diagonalInferior || j2==anchura-2) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                diagonalInferior--;
                System.out.println();
            }
            if (i<nLetras-1) {
                for (int j = 0; j < i+1; j++) {
                    System.out.println();
                    intros++;
                }  
            }
        }
        if (noErrors==false) {
            System.out.println("Errores cometidos en el input.");
        }
        System.out.println("Numero de intros: " + intros);
    }
}
