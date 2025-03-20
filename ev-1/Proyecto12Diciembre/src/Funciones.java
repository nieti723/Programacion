import java.io.IOException;
import java.util.Scanner;

public class Funciones {
    public static void presentacion() throws InterruptedException, IOException {
        System.out.println("BIENVENIDO AL JUEGO DE ADIVINAR PAREJAS");
        System.out.println("---------------------------------------");
        System.out.println("En este juego usted deberá de adivinar parejas");
        System.out.println("de iconos en un tablero cuyo tamaño puede elegir, pero");
        System.out.println("tenga usted cuidado, hay una bomba escondida entre los iconos");
        System.out.println("y si cae en ella, explotará y perderá una vida. Tendrá diferentes intentos");
        System.out.println("según el modo elegido para completarlo, al final se le mostrarán los puntos");
        System.out.println("que ha conseguido. ¡Mucha Suerte!");
        System.out.println();
        salir();
    }

    @SuppressWarnings("resource")
    public static void salir() throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Pulse una tecla para continuar: ");
        s.nextLine();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    // Esta función muestra el menú para elegir el tamaño del tablero para la
    // partida y devuelve la variable modo
    @SuppressWarnings("resource")
    public static int menu() throws InterruptedException, IOException {
        int modo = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("---ELIGE EL TAMAÑO DEL TABLERO---");
        System.out.println("1. 3x3 (1 bomba)");
        System.out.println("2. 4x4 (2 bombas)");
        System.out.println("3. 5x5 (3 bombas)");
        do {
            modo = s.nextInt();
            if (modo < 1 || modo > 3) {
                System.out.print("El número introducido no es válido, introduzca un valor entre 1 y 3: ");
            }
        } while (modo < 1 || modo > 3);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        return modo;
    }

    // Esta función recibe el tablero vacío y los iconos y rellena el tablero
    public static String[][] generaTablero(String[][] tablero, String[] icono, int cantidadIconos) {
        int cont = 0;
        // Generamos un array con la cantidad de iconos a rellenar según el modo que se
        // elija
        int[] valores = new int[cantidadIconos];
        // Primero generamos cantidadIconos valores 2 a 2
        for (int i = 0; i < valores.length / 2; i++) {
            valores[2 * i] = i;
            valores[2 * i + 1] = i;
        }
        // Según la cantidad de iconos hay diferente cantidad de bombas, y aquí se
        // rellenan las bombas
        switch (cantidadIconos) {
            case 9:
                valores[valores.length - 1] = icono.length - 1;
                break;
            case 16:
                for (int i = 1; i <= 2; i++) {
                    valores[valores.length - i] = icono.length - 1;
                }
                break;
            case 25:
                for (int i = 1; i <= 3; i++) {
                    valores[valores.length - i] = icono.length - 1;
                }
                break;
            default:
                break;
        }
        // Una vez generado, tenemos que mezclar los valores
        for (int i = valores.length - 1; i > 0; i--) {
            int aleatorio = (int) (Math.random() * i + 1);
            int aux = valores[i];
            valores[i] = valores[aleatorio];
            valores[aleatorio] = aux;
        }
        // Aquí se carga en array con los valores aleatorios
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = icono[valores[cont]];
                cont++;
            }
        }
        return tablero;
    }

    // Esta función muestra el tablero
    public static void muestraTablero(String[][] tablero, int[][] intento, String[] acertados, int[] estadisticas)
            throws InterruptedException, IOException {
        boolean escrito = false;
        // Primero mostramos la cabecera
        if (estadisticas[0] > 1) {
            System.out.println("---INTENTOS RESTANTES: " + estadisticas[0] + "---");
        } else {
            System.out.println("---ÚLTIMO INTENTO---");
        }
        System.out.println();
        System.out.println("PUNTOS:\t\t" + estadisticas[2]);
        System.out.println();
        // Y luego mostramos el tablero teniendo en cuenta diferentes casos
        for (int i = 0; i < tablero.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < tablero.length; j++) {
                escrito = false;
                for (int j2 = 0; j2 < estadisticas[2]; j2++) {
                    if (tablero[i][j].equals(acertados[j2])) { // Aquí escribimos si el icono ya está en el array
                                                               // acertados
                        System.out.print(tablero[i][j]);
                        escrito = true;
                    }
                }
                if (!escrito) {
                    if ((i == intento[0][0] - 1 && j == intento[0][1] - 1)
                            || (i == intento[1][0] - 1 && j == intento[1][1] - 1)) { // Y aquí si el icono coincide con
                                                                                     // el que se encuentra en las
                                                                                     // coordenadas del intento
                        System.out.print(tablero[i][j]);
                    } else { // Si no se cumple nada de lo anterior, se imprime una X
                        System.out.print("❌");
                    }
                }
            }
            System.out.println("");
            System.out.println("");
        }
        // Esto muestra los corazones que representan las vidas restantes
        System.out.print("VIDAS:\t\t");
        for (int i = 0; i < estadisticas[1]; i++) {
            System.out.print("💗");
        }
        // Esto muestra los corazones rotos que indican la cantidad de vidas que hemos
        // perdido
        for (int i = 0; i < estadisticas[3] - estadisticas[1] && i<estadisticas[3]; i++) {
            System.out.print("💔");
        }
        System.out.println();
        System.out.println();
    }

    // Esta función se encarga de pedir los datos necesarios para cada intento y
    // develve un array con las posiciones de cada intento
    @SuppressWarnings("resource")
    public static String[] pideDatos(int[][] intento, int tamaño, String[][] tablero, String[] acertados,
            int[] estadisticas, String[] icono) throws InterruptedException, IOException {
        Scanner s = new Scanner(System.in);
        do {
            // En cada uno de los datos introducidos comprobamos que no sea mayor al tamaño
            // del array o menor a 1
            System.out.println("Introduzca el primer lugar (filas/columnas)");
            System.out.print("Fila: ");
            intento[0][0] = s.nextInt();
            while (intento[0][0] > tamaño || intento[0][0] < 1) {
                System.out.println("El valor introducido debe estar entre 1 y " + tamaño);
                System.out.print("Introduce un nuevo valor: ");
                intento[0][0] = s.nextInt();
            }
            System.out.print("Columna: ");
            intento[0][1] = s.nextInt();
            while (intento[0][1] > tamaño || intento[0][1] < 1) {
                System.out.println("El valor introducido debe estar entre 1 y " + tamaño);
                System.out.print("Introduce un nuevo valor: ");
                intento[0][1] = s.nextInt();
            }
            System.out.println("Introduzca el segundo lugar (filas/columnas)");
            System.out.print("Fila: ");
            intento[1][0] = s.nextInt();
            while (intento[1][0] > tamaño || intento[1][0] < 1) {
                System.out.println("El valor introducido debe estar entre 1 y " + tamaño);
                System.out.print("Introduce un nuevo valor: ");
                intento[1][0] = s.nextInt();
            }
            System.out.print("Columna: ");
            intento[1][1] = s.nextInt();
            while (intento[1][1] > tamaño || intento[1][1] < 1) {
                System.out.println("El valor introducido debe estar entre 1 y " + tamaño);
                System.out.print("Introduce un nuevo valor: ");
                intento[1][1] = s.nextInt();
            }
            // Y al final comprobamos que las dos coordenadas no sean iguales
            if (intento[0][0] == intento[1][0] && intento[0][1] == intento[1][1]) {
                System.out.println("Las coordenadas no pueden ser iguales");
                System.out.println("Introduzca unas coordenadas válidas");
                System.out.println("Pulse una tecla para continuar");
                s.nextLine();
                s.nextLine();
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        } while (intento[0][0] == intento[1][0] && intento[0][1] == intento[1][1]);
        // Aquí mostramos un texto según el intento del usuario y añadimos al array
        // acertados el icono que hemos averiguado para que así se muestre luego
        if (tablero[intento[0][0] - 1][intento[0][1] - 1].equals(tablero[intento[1][0] - 1][intento[1][1] - 1])
                && !tablero[intento[1][0] - 1][intento[1][1] - 1].equals("💣")
                && !tablero[intento[0][0] - 1][intento[0][1] - 1].equals("💣")) {
            System.out.println("Felicidades, has ganado un punto");
            acertados[estadisticas[2]] = tablero[intento[0][0] - 1][intento[0][1] - 1];
            estadisticas[2]++;
        } else { // En caso de que el usuario falle, le mostramos un mensaje, y si cae en una
                 // bomba, se le resta una vida
            if (tablero[intento[0][0] - 1][intento[0][1] - 1].equals(icono[icono.length - 1])) {
                estadisticas[1]--;
            }
            if (tablero[intento[1][0] - 1][intento[1][1] - 1].equals(icono[icono.length - 1])) {
                estadisticas[1]--;
            }
            System.out.println("Has fallado, inténtalo de nuevo");
        }
        estadisticas[0]--;
        return acertados;
    }

    public static void mensajeFinal(int[] estadisticas, int cantIconos) {
        if (estadisticas[2] == cantIconos) {
            System.out.println("¡Enhorabuena! Ha acertado todos los iconos");
        }else if (estadisticas[0] < 1) {
            System.out.println("Lo siento, intentos agotados");
            if (estadisticas[2]>0) {
                System.out.println("Usted ha conseguido " + estadisticas[2] + " puntos, ¡Sigue así!");
            }
        }else if (estadisticas[1] < 1) {
            System.out.println("Lo siento, se ha quedado sin vidas"); 
        }
    }
}
