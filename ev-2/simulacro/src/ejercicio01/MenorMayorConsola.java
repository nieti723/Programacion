package ejercicio01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class MenorMayorConsola {
    public static void main(String[] args) {

        String linea = "";
        ArrayList<Double> numeros = new ArrayList<>();
        

        try {
            BufferedReader bf = new BufferedReader(new FileReader(args[0]));
            while (linea != null) {
                linea = bf.readLine();
                if (linea != null) {
                    linea = linea.replace(",", "");
                    numeros.add(Double.parseDouble(linea));
                }
            }
            bf.close();
        } catch (IOException e) {
            System.out.println("No se puede encontar el archivo: ");
        }
        
        System.out.println("Menor: " + Collections.min(numeros));
        System.out.println("Mayor: " + Collections.max(numeros));

        // javac MenorMayorConsola.java 
        // java MenorMayorConsola.java numeros.txt

        // APARTADO B
        
        numeros.add(Double.parseDouble(args[1]));
        numeros.add(Double.parseDouble(args[2]));
        numeros.add(Double.parseDouble(args[3]));

        Collections.sort(numeros);
        Collections.reverse(numeros);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("numerosMayorMenor.txt"));
            for (int i = 0; i < numeros.size(); i++) {
                if (i == numeros.size() - 1) {
                    bw.write(numeros.get(i).toString());
                } else {
                    bw.write(numeros.get(i) + ",\n");
                }
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }

        // javac MenorMayorConsola.java
        // java MenorMayorConsola.java numeros.txt 7.2 3.6 5.5

    }
}
