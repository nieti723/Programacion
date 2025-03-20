package tema9;

public class Bombilla3 {
    private int potencia, id;
    private String estado;
    private static int cont = 0;

    public Bombilla3(int potencia, String estado) {
        cont++;
        if (!estado.equals("apagada") && !estado.equals("encendida")) {
            this.estado = "apagada";
        } else {
            this.estado = estado;
        }
        this.potencia = potencia;
        this.id = cont;
    }

    public void encender() {
        if (estado.equals("encendida")) {
            System.out.println("La bombilla ya está encendida");
        } else {
            System.out.println("Voy a encender la luz " + id + " que tiene un consumo de: " + potencia + " W");
            estado = "encendida";
        }
    }
    
    public void apagar() {
        if (estado.equals("apagada")) {
            System.out.println("La bombilla ya está apagada");
        } else {
            System.out.println("Voy a apagar la luz " + id + " que tiene un consumo de: " + potencia + " W");
            estado = "apagada";
        }
    }

    @Override
    public String toString() {
        return "La bombilla " + id + " está " + estado;
    }

    public static void potenciaTotal(Bombilla3[] array) {
        int potenciaTotal = 0;
        for (Bombilla3 bombilla3 : array) {
            if (bombilla3.estado.equals("encendida")) {
                potenciaTotal += bombilla3.potencia;
            }
        }
        System.out.println("Actualmente la potencia total consumida por las bombillas encendidas es: " + potenciaTotal + " W");
    }
}
