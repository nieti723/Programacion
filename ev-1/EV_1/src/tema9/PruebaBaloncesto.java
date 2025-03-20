package tema9;

public class PruebaBaloncesto {
    public static void main(String[] args) {
        JugadorBaloncesto j1 = new JugadorBaloncesto("Paco", Posicion.pivot);
        System.out.println(j1.getPosicion().ordinal());
    }
}
