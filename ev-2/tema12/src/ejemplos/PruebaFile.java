package ejemplos;
import java.io.File;

public class PruebaFile {
    
    public static void main(String[] args) {
	
	File fichero = new File("./");
	
	String[] lista = fichero.list();
	
	for (int i = 0; i < lista.length; i++) {
	    System.out.println(lista[i]);
	}
	
    }
}
