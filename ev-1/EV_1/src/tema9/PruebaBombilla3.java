package tema9;

import java.io.IOException;

public class PruebaBombilla3 {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Bombilla3[] bombillas = new Bombilla3[5];
        bombillas[0] = new Bombilla3(50, "apagada");
        bombillas[1] = new Bombilla3(200, "encendida");
        bombillas[2] = new Bombilla3(150, "apagada");
        bombillas[3] = new Bombilla3(75, "encendida");
        bombillas[4] = new Bombilla3(90, "apagada");
        for (int i = 0; i < bombillas.length; i++) {
            System.out.println(bombillas[i]);
        }
        Bombilla3.potenciaTotal(bombillas);
        bombillas[3].apagar();
        Bombilla3.potenciaTotal(bombillas);
        bombillas[0].encender();
        Bombilla3.potenciaTotal(bombillas);
    }
}
