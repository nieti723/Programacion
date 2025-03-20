package tema9;


public class PruebaPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(Type.margarita, Size.mediana);
        Pizza p2 = new Pizza(Type.funghi, Size.familiar);
        p2.sirve();
        Pizza p3 = new Pizza(Type.cuatro_quesos, Size.mediana);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("Pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Servidas: " + Pizza.getTotalServidas());
    }

}
