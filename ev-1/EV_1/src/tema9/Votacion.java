package tema9;

public class Votacion {
    private int votos;
    private String nombre;

    public Votacion(String nombre) {
        this.nombre = nombre;
        votos = (int)(Math.random()*19001+6000);
    }

    public static void ganador(Votacion[] candidatos) throws InterruptedException {
        int ganador = 0, maxVotos = 0;
        System.out.println("Calculando ganador");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println();
        for (int i = 0; i < candidatos.length; i++) {
            if (candidatos[i].votos>maxVotos) {
                maxVotos = candidatos[i].votos;
                ganador = i;
            }
        }
        System.out.println(candidatos[ganador].nombre + " ha ganado las elecciones con un total de " + candidatos[ganador].votos + " votos");
    }

    @Override
    public String toString() {
        return "El candidato " + nombre + " ha conseguido: " + votos + " votos";
    }
}
