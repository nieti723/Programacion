package ejercicio02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio02 {
    public static void main(String[] args) {

        faltaOrtografia(args);

    }

    public static void faltaOrtografia(String[] args) {
        ArrayList<String> diccionario = new ArrayList<>();
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(args[0]));
            BufferedReader br2 = new BufferedReader(new FileReader(args[1]));

            String l1 = "";

            while (l1 != null) {
                l1 = br1.readLine();
                if (l1 != null) {
                    diccionario.add(l1);
                }
            }

            String l2 = "";
            String[] palabras;
            boolean error = false;
            String sus = "";
            while (l2 != null) {
                l2 = br2.readLine();
                if (l2 != null) {
                    palabras = l2.split(" ");
                    for (int i = 0; i < palabras.length; i++) {
                        error = false;
                        for (String d : diccionario) {
                            if (palabras[i].startsWith(d.substring(0, d.length()-1))) {
                                if (i == palabras.length-1) {
                                    error = true;
                                    sus = d + ".";
                                } else {
                                    error = true;
                                    sus = d;
                                }
                            }
                        }
                        if (error) {
                            System.out.print(sus + " ");
                        } else {
                            System.out.print(palabras[i] + " ");
                        }
                    }
                }
                System.out.println();
            }
            
            br1.close();
            br2.close();
        } catch (IOException e) {
            System.err.println("Fichero no encontrado");
        }
    }

    

}
