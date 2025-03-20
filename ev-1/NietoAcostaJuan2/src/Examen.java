import java.io.IOException;
import java.util.Scanner;

public class Examen {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        // Declaración de variables
        // Contador que va a controlar cuántas veces se repite un valor generado
        boolean repetido = false;
        // Contador de valores que se han repetido
        int valoresRepetidos = 0;
        int[] sorteo = new int[20];
        // Número que se genera
        int num;
        // Variable auxiliar que recoge el valor que se encuentra en la posición que
        // vamos a sustituir para ordenar el array
        int aux = 0;
        // Almacena los 6 primeros valores generados
        int[] apuestaGanadora = new int[6];
        // Almacena la apuesta generada
        int[] apuestaUsuario = new int[6];
        int[] apuestaUsuarioMultiplo3 = new int[6];
        String nombre, apellidos;
        // Contador para todo (universal)
        int cont = 0;
        String aciertos = "";
        String[][] ranking = new String[8][2];
        ranking[0][0] = "Nombre";
        ranking[0][1] = "Aciertos";
        ranking[1][0] = "Paco";
        ranking[1][1] = 0 +"";
        ranking[2][0] = "Paula";
        ranking[2][1] = 1 + "";
        ranking[3][0] = "Antonia";
        ranking[3][1] = 2 + "";
        ranking[4][0] = "Julio";
        ranking[4][1] = 3 + "";
        ranking[5][0] = "Susana";
        ranking[5][1] = 4 + "";
        ranking[6][0] = "Ramón";
        ranking[6][1] = 5 + "";
        String aux1, aux2;
        int hola = (int) ranking[1][1].charAt(0)-48;

        // PROGRAMA
        // Bucle para generar los valores
        for (int i = 0; i < sorteo.length; i++) {
            do {
                // Reseteamos ambas variables para el bucle
                repetido = false;
                // Generamosel número
                num = (int) (Math.random() * 41) - 99;
                // Comprobamos que el valor generado no está ya en el array, si está repetido se
                // pone a true
                for (int j = i - 1; j >= 0 && !repetido; j--) {
                    if (num == sorteo[j]) {
                        repetido = true;
                    }
                }
                // Si el valor está repetido
                if (repetido) {
                    // Colocamos repetido a falso de nuevo
                    repetido = false;
                    // Aumentamos el contador de los valores repetidos
                    valoresRepetidos++;
                    // Mostramos el mensaje de que se ha repetido y cuantos valores llevamos
                    // repetidos
                    System.out.println(
                            "Valor repetido " + num + ". Hay un total de: " + valoresRepetidos + " valores repetidos.");
                    // Añadimos 1 al número generado
                    num++;
                    // Comprobamos si está en el array
                    for (int j = i - 1; j >= 0 && !repetido; j--) {
                        if (num == sorteo[j]) {
                            repetido = true;
                        }
                    }
                    // Si se encuentra en el array, repetido se pone a true y se muestra este
                    // mensaje
                    if (repetido) {
                        System.out.println("Valor no válido, será descartado");
                    }
                }
            } while (repetido);
            // Si el valor no se repite (aunque no debería ya que la condición de do while
            // es que repetido sea false para poder salir) metemos el valor en el array
            if (!repetido) {
                sorteo[i] = num;
            }
            // Bucle que ordena los valores de mayor a menor
            for (int j = i; j >= 0; j--) {
                // Aquí recorro el array desde i (para no recorrerlo entero) de forma regresiva
                // y voy comprobando si el valor es mayor y lo voy sustituyendo
                for (int j2 = j; j2 >= 0; j2--) {
                    if (sorteo[j] > sorteo[j2]) {
                        aux = sorteo[j2];
                        sorteo[j2] = sorteo[j];
                        sorteo[j] = aux;
                    }
                }
            }
        }
        for (int j = 0; j < apuestaGanadora.length; j++) {
            apuestaGanadora[j] = sorteo[j];
        }
        System.out.println();
        System.out.println("20 valores generados:");
        for (int i : sorteo) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Apuesta ganadora generada:");
        for (int i : apuestaGanadora) {
            System.out.print(i + " ");
        }
        // Bucle que genera los valores de la apuesta del usuario sin que se repitan y
        // ordenados de menor a mayor
        for (int i = 0; i < apuestaUsuario.length; i++) {
            do {
                // Reseteamos ambas variables para el bucle
                repetido = false;
                // Generamosel número
                num = (int) (Math.random() * 41) - 99;
                // Comprobamos que el valor generado no está ya en el array, si está repetido se
                // pone a true
                for (int j = i - 1; j >= 0 && !repetido; j--) {
                    if (num == apuestaUsuario[j]) {
                        repetido = true;
                    }
                }
            } while (repetido);
            // Si el valor no se repite (aunque no debería ya que la condición de do while
            // es que repetido sea false para poder salir) metemos el valor en el array
            if (!repetido) {
                apuestaUsuario[i] = num;
            }
            // Bucle que ordena los valores de menor a mayor
            for (int j = i; j >= 0; j--) {
                // Aquí recorro el array desde i (para no recorrerlo entero) de forma regresiva
                // y voy comprobando si el valor es mayor y lo voy sustituyendo
                for (int j2 = j; j2 >= 0; j2--) {
                    if (apuestaUsuario[j] < apuestaUsuario[j2]) {
                        aux = apuestaUsuario[j2];
                        apuestaUsuario[j2] = apuestaUsuario[j];
                        apuestaUsuario[j] = aux;
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Apuesta del usuario:");
        for (int i : apuestaUsuario) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Indique su nombre: ");
        nombre = s.nextLine();
        System.out.println();
        System.out.println("Indique sus apellidos:");
        apellidos = s.nextLine();
        System.out.println("Reordenando apuesta...");
        Thread.sleep(3000);
        for (int i = apuestaUsuarioMultiplo3.length - 1; i >= 0; i--) {
            if (apuestaUsuario[i] % 3 == 0) {
                apuestaUsuarioMultiplo3[cont] = apuestaUsuario[i];
                cont++;
            } else {
                apuestaUsuarioMultiplo3[i + cont] = apuestaUsuario[i];
            }
        }
        System.out.println();
        System.out.println("Apuesta del usuario que son múltiplos de 3");
        for (int i : apuestaUsuarioMultiplo3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Apuesta con valores iguales(Apuesta del usuario y sorteo ganador) entecomillados:");
        cont = 0;
        for (int i = 0; i < apuestaUsuarioMultiplo3.length; i++) {
            for (int j = 0; j < apuestaUsuarioMultiplo3.length; j++) {
                if (apuestaUsuarioMultiplo3[i] == apuestaGanadora[j]) {
                    aux = apuestaUsuarioMultiplo3[cont];
                    apuestaUsuarioMultiplo3[cont] = apuestaUsuarioMultiplo3[i];
                    apuestaUsuarioMultiplo3[i] = aux;
                    cont++;
                }
            }
        }
        aciertos = cont + "";
        for (int i = 0; i < apuestaUsuarioMultiplo3.length; i++) {
            if (i < cont) {
                System.out.print("\"" + apuestaUsuarioMultiplo3[i] + "\" ");

            } else {
                System.out.print(apuestaUsuarioMultiplo3[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Array bidimensional final:");
        System.out.println((int)aciertos.charAt(0));
        for (int i = 1; i < ranking.length; i++) {
            if ((int)aciertos.charAt(0)>(int)ranking[i][1].charAt(0) && (int)aciertos.charAt(0)<(int)ranking[i+1][1].charAt(0)) {
                for (int j = i; j < ranking.length; j++) {
                    aux1 = ranking[j][0];
                    aux2 = ranking[j][1];
                    ranking[j+1] = 
                }
            }
        }
        for (String[] strings : ranking) {
            for (String strings2 : strings) {
                System.out.print(strings2 + "\t");
            }
            System.out.println();
        }

    }
}
