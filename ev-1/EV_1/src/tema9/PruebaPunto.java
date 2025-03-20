package tema9;

import java.io.IOException;

public class PruebaPunto {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
        Punto p1 = new Punto(100, 200);
        Punto p2 = new Punto(400, 800);
        p1.distancia(p2);
    }
}
