import java.util.Scanner;

public class Adivinar {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        // Presentación
        Funciones.presentacion();

        // Declaración de variables
        int[] modo = { 3, 4, 5 };
        String[] icono = { "🍀", "💗", "⭐", "💥", "💰", "🚗", "🛫", "🛵", "👽", "🍍", "⚽", "💣" };
        boolean continuar = false;
        do {
            // En este array se guardan los iconos que se vayan acertando
            String[] acertados;
            int[][] intento = new int[2][2];
            // Aquí se guardan las estacísticas
            // 0 -> intentos restantes, 1 -> vidas, 2 -> contador acertados, 3 -> Vidas máximas
            int[] estadisticas = new int[4];
            String eleccion = "";
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            // Aqui se muestra el menú y se elige el tamaño que va a tener el tablero
            int tamaño = modo[Funciones.menu() - 1];
            String[][] tablero = new String[tamaño][tamaño];
            int cantIconos = 0;
            switch (tamaño) {
                case 3:
                    cantIconos = 4;
                    break;
                case 4:
                    cantIconos = 7;
                    break;
                case 5:
                    cantIconos = 11;
                    break;
            }
            // Programa
            
            switch (tamaño) {
                case 3:
                    estadisticas[0] = 8;
                    estadisticas[1] = 2;
                    estadisticas[2] = 0;
                    estadisticas[3] = 2;
                    acertados = new String[cantIconos]; 
                    tablero = Funciones.generaTablero(tablero, icono, tamaño * tamaño);
                    // Este bucle muestra el tablero para probar si funciona o no
                    // for (String[] i : tablero) {
                    // for (String j : i) {
                    // System.out.print(j);
                    // }
                    // System.out.println();
                    // }
                    Funciones.muestraTablero(tablero, intento, acertados, estadisticas);
                    Funciones.salir();
                    do {
                        // Aquí vuelvo a poner el array de intento a 0
                        for (int i = 0; i < intento.length; i++) {
                            for (int j = 0; j < intento.length; j++) {
                                intento[i][j] = 0;
                            }
                        }
                        Funciones.muestraTablero(tablero, intento, acertados, estadisticas);
                        acertados = Funciones.pideDatos(intento, tamaño, tablero, acertados, estadisticas, icono);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        Funciones.muestraTablero(tablero, intento, acertados, estadisticas);
                        Funciones.salir();
                    } while (estadisticas[0] > 0 && estadisticas[1] > 0 && estadisticas[2] < cantIconos);
                    Funciones.mensajeFinal(estadisticas, cantIconos);
                    break;
                case 4:
                    estadisticas[0] = 11;
                    estadisticas[1] = 3;
                    estadisticas[2] = 0;
                    estadisticas[3] = 3;
                    acertados = new String[cantIconos];
                    tablero = Funciones.generaTablero(tablero, icono, tamaño * tamaño);
                    // Este bucle muestra el tablero para probar si funciona o no
                    // for (String[] i : tablero) {
                    // for (String j : i) {
                    // System.out.print(j);
                    // System.out.println();
                    // }
                    // }
                    Funciones.muestraTablero(tablero, intento, acertados, estadisticas);
                    Funciones.salir();
                    do {
                        // Aquí vuelvo a poner el array de intento a 0
                        for (int i = 0; i < intento.length; i++) {
                            for (int j = 0; j < intento.length; j++) {
                                intento[i][j] = 0;
                            }
                        }
                        Funciones.muestraTablero(tablero, intento, acertados, estadisticas);
                        acertados = Funciones.pideDatos(intento, tamaño, tablero, acertados, estadisticas, icono);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        Funciones.muestraTablero(tablero, intento, acertados, estadisticas);
                        Funciones.salir();
                    } while (estadisticas[0] > 0 && estadisticas[1] > 0 && estadisticas[2] < cantIconos);
                    Funciones.mensajeFinal(estadisticas, cantIconos);
                    break;
                case 5:
                    estadisticas[0] = 15;
                    estadisticas[1] = 3;
                    estadisticas[2] = 0;
                    estadisticas[3] = 3;
                    acertados = new String[cantIconos];
                    tablero = Funciones.generaTablero(tablero, icono, tamaño * tamaño);
                    // Este bucle muestra el tablero para probar si funciona o no
                    // for (String[] i : tablero) {
                    // for (String j : i) {
                    // System.out.print(j);
                    // }
                    // System.out.println();
                    // }
                    Funciones.muestraTablero(tablero, intento, acertados, estadisticas);
                    Funciones.salir();
                    do {
                        // Aquí vuelvo a poner el array de intento a 0
                        for (int i = 0; i < intento.length; i++) {
                            for (int j = 0; j < intento.length; j++) {
                                intento[i][j] = 0;
                            }
                        }
                        Funciones.muestraTablero(tablero, intento, acertados, estadisticas);
                        acertados = Funciones.pideDatos(intento, tamaño, tablero, acertados, estadisticas, icono);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        Funciones.muestraTablero(tablero, intento, acertados, estadisticas);
                        Funciones.salir();
                    } while (estadisticas[0] > 0 && estadisticas[1] > 0 && estadisticas[2] < cantIconos);
                    Funciones.mensajeFinal(estadisticas, cantIconos);
                    break;
                default:
                    break;
            }
            System.out.print("¿Quiere volver a jugar? (s/n): ");
            eleccion = s.nextLine();
            if (eleccion.equalsIgnoreCase("s")) {
                continuar = true;
            }else{
                continuar = false;
            }
        } while (continuar);

    }
}
