package libro;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio11 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        Scanner s = new Scanner(System.in);

        //VARIABLES
        //HashMap del ejercicio anterior para escoger palabras aleatoriamente
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("hola", "hello");
        diccionario.put("adios", "goodbye");
        diccionario.put("por favor", "please");
        diccionario.put("gracias", "thank you");
        diccionario.put("lo siento", "sorry");
        diccionario.put("si", "yes");
        diccionario.put("no", "no");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("comida", "food");
        diccionario.put("agua", "water");
        diccionario.put("casa", "house");
        diccionario.put("escuela", "school");
        diccionario.put("libro", "book");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("coche", "car");
        diccionario.put("ciudad", "city");
        diccionario.put("pais", "country");
        diccionario.put("trabajo", "work");
        //Variable que va a guardar la palabra en inglés que el usuario va a introducir
        String palabra;
        //Contador fallos
        int wrong = 0;
        //Contador aciertos
        int right = 0;
        //Numero aleatorio que generaremos
        int random;

        //CÓDIGO
        System.out.println("Traduce las siguientes palabras al inglés");
        //Bucle que se repite 5 veces y coge 5 palabras aleatorias y pide al usuario que las traduzca
        for (int i = 0; i < 5; i++) {
            //Generamos el numero aleatorio
            random = (int) (Math.random() * diccionario.size());
            //Cogemos una palabra aleatoria del diccionario
            System.out.print(diccionario.keySet().toArray()[random] + ": ");
            //Pedimos al usuario que introduzca la traducción de la palabra
            palabra = s.nextLine();
            //Comprobamos si la palabra introducida es igual a la traducción de la palabra aleatoria
            if (palabra.equals(diccionario.get(diccionario.keySet().toArray()[random]))) {
                right++;
            } else {
                wrong++;
            }
        }
        System.out.println("Aciertos: " + right);
        System.out.println("Fallos: " + wrong);
    }
}
