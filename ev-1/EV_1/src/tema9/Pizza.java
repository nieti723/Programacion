package tema9;

public class Pizza {
    private Type tipo;
    private Size tamano;
    private Status estado;
    private static int totalPedidas, totalServidas;


    public Pizza(Type tipo, Size tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
        estado = Status.pedida;
        totalPedidas++;
    }

    public void sirve() {
        if (estado.ordinal()==1) {
            System.out.println("Esa pizza ya se ha servido");
        } else {
            estado = Status.servida;
            totalServidas++;
        }
    }

    @Override
    public String toString() {
        return "Pizza " + tipo + " " + tamano + ", " + estado;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }
}
