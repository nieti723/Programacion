package libro;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Scanner s = new Scanner(System.in);

        //VARIABLES
        //HashMap que va a guardar las palabras en español y su traducción en inglés
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
        //Variable que va a guardar la palabra en español que el usuario va a introducir
        String palabra;
        
        //CÓDIGO
        System.out.println("Introduce una palabra en español y te diré su traducción en inglés");
        System.out.print("Introduce la palabra: ");
        palabra = s.nextLine();
        //Comprobamos si la palabra introducida está en el diccionario
        if(diccionario.containsKey(palabra)){
            System.out.println("La traducción de " + palabra + " es \"" + diccionario.get(palabra)+ "\"");
        }else{
            System.out.println("La palabra introducida no está en el diccionario");
        }
    }
}
