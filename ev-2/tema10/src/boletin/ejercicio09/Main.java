package boletin.ejercicio09;

public class Main {

    public static void main(String[] args) {
        
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        
        electrodomesticos[0] = new Electrodomestico(200, "rojo", 'A', 20);
        electrodomesticos[1] = new Electrodomestico(150, 30);
        electrodomesticos[2] = new Electrodomestico(100, "azul", 'B', 10);
        electrodomesticos[3] = new Lavadora(300, "blanco", 'C', 50, 30);
        electrodomesticos[4] = new Lavadora(250, 40);
        electrodomesticos[5] = new Lavadora(100, 50);
        electrodomesticos[6] = new Television(40, true);
        electrodomesticos[7] = new Television(400, 70);
        electrodomesticos[8] = new Television(50, false);
        electrodomesticos[9] = new Television(55, true);

        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(electrodomestico.toString());
            electrodomestico.precioFinal();
            System.out.println("--------------------");
        }

        System.out.println("Precio total electrodomésticos: " + Electrodomestico.getPrecioFinal());
        System.out.println("Precio total lavadoras: " + Lavadora.getPrecioFinal());
        System.out.println("Precio total televisores: " + Television.getPrecioFinal());
    }
}
