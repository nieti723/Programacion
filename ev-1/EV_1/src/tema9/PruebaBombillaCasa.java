package tema9;

import java.io.IOException;

public class PruebaBombillaCasa {
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        BombillaCasa[] habitaciones = new BombillaCasa[5];
        habitaciones[0] = new BombillaCasa("dormitorio", "apagada");
        habitaciones[1] = new BombillaCasa("cocina", "apagada");
        habitaciones[2] = new BombillaCasa("aseo", "apagada");
        habitaciones[3] = new BombillaCasa("portal", "encendida");
        habitaciones[4] = new BombillaCasa("comedor", "encendida");
        BombillaCasa.consultaGeneral(habitaciones);
        habitaciones[1].entrar("a por agua");
        habitaciones[1].salir();
        BombillaCasa.setLunaLlena(true);
        BombillaCasa.lunaLlena(habitaciones);
        BombillaCasa.consultaGeneral(habitaciones);
        BombillaCasa.saltoFusibles(habitaciones);
        BombillaCasa.reparaFusibles(habitaciones);
        BombillaCasa.consultaGeneral(habitaciones);
    }
}
