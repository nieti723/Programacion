package tema9;

import java.io.IOException;

public class PruebaVotacion {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Votacion[] candidatos = new Votacion[4];
        candidatos[0] = new Votacion("Alfedro");
        candidatos[1] = new Votacion("Carlota");
        candidatos[2] = new Votacion("Candida");
        candidatos[3] = new Votacion("Gilberto");
        for (Votacion votacion : candidatos) {
            System.out.println(votacion);
        }
        Votacion.ganador(candidatos);
    }
}
