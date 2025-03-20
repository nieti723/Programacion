package libro.ejercicio13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gestisimal {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        clearConsole();

        Scanner s = new Scanner(System.in);

        // VARIABLES
        // Recoge la opción elegida por el usuario
        int option;
        // Recoge la cantidad de productos a añadir o quitar
        int quantity;
        // Recogen los datos a modificar de un producto
        String code;
        String description;
        double buyPrice;
        double sellPrice;
        int stock;
        // Booleano para controlar el bucle
        boolean exit = false;
        // Booleano para controlar si el producto existe
        boolean exists = false;
        // ArrayList que va a contener todos los objetos Item
        ArrayList<Item> items = new ArrayList<>();
        // ArayList que va a contener los items vendidos
        ArrayList<Item> itemsVendidos = new ArrayList<>();

        // CÓDIGO
        do {
            System.out.println("GESTISIMAL");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Venta");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");
            option = s.nextInt();
            clearConsole();

            switch (option) {
                case 1:
                    if (items.isEmpty()) {
                        System.out.println("No hay productos almacenados");
                    } else {
                        System.out.println("LISTADO");
                        System.out.println("---------------------------------");
                        for (Item item : items) {
                            System.out.println(item);
                            System.out.println("---------------------------------");
                        }
                    }
                    break;
                case 2:
                    exists = false;
                    System.out.println("ALTA");
                    System.out.print("Código: ");
                    code = s.next();
                    // Comprobamos si el código ya está en uso
                    for (Item item : items) {
                        if (code.equals(item.getCode())) {
                            exists = true;
                        }
                    }
                    // Si el código ya está en uso no se añade el producto, sino se añade
                    if (exists) {
                        System.out.println("Ese código ya está en uso");
                    } else {
                        System.out.print("Descripción: ");
                        s.nextLine();
                        description = s.nextLine();
                        System.out.print("Precio de compra: ");
                        buyPrice = s.nextDouble();
                        System.out.print("Precio de venta: ");
                        sellPrice = s.nextDouble();
                        System.out.print("Stock: ");
                        stock = s.nextInt();
                        items.add(new Item(code, description, buyPrice, sellPrice, stock));
                    }
                    break;
                case 3:
                    System.out.println("BAJA");
                    System.out.print("Introduzca el código del producto a eliminar: ");
                    code = s.next();
                    // Comprobamos si el producto existe
                    for (Item item : items) {
                        if (code.equals(item.getCode())) {
                            exists = true;
                        }
                    }
                    // Si existe lo borramos
                    if (exists) {
                        for (int i = 0; i < items.size(); i++) {
                            if (items.get(i).getCode().equals(code)) {
                                items.remove(i);
                            }
                        }
                    } else {
                        System.out.println("El producto no existe");
                    }
                    break;
                case 4:
                    System.out.println("MODIFICACIÓN");
                    System.out.print("Introduzca el código del producto a modificar: ");
                    code = s.next();
                    // Comprobamos si el producto existe
                    for (Item item : items) {
                        if (code.equals(item.getCode())) {
                            exists = true;
                        }
                    }
                    // Si existe lo modificamos
                    if (exists) {
                        for (int i = 0; i < items.size(); i++) {
                            if (items.get(i).getCode().equals(code)) {
                                System.out.print("Nuevo código: ");
                                code = s.next();
                                System.out.print("Nueva descripción: ");
                                s.nextLine();
                                description = s.nextLine();
                                System.out.print("Nuevo precio de compra: ");
                                buyPrice = s.nextDouble();
                                System.out.print("Nuevo precio de venta: ");
                                sellPrice = s.nextDouble();
                                System.out.print("Nuevo stock: ");
                                stock = s.nextInt();
                                items.get(i).setCode(code);
                                items.get(i).setDescription(description);
                                items.get(i).setBuyPrice(buyPrice);
                                items.get(i).setSellPrice(sellPrice);
                                items.get(i).setStock(stock);
                            }
                        }
                    } else {
                        System.out.println("El producto no existe");
                    }
                    break;
                case 5:
                    System.out.println("ENTRADA DE MERCANCÍA");
                    System.out.print("Introduzca el código del producto: ");
                    code = s.next();
                    // Comprobamos si el producto existe
                    for (Item item : items) {
                        if (code.equals(item.getCode())) {
                            exists = true;
                        }
                    }
                    // Si existe añadimos la cantidad de productos
                    if (exists) {
                        System.out.print("Cantidad a añadir: ");
                        quantity = s.nextInt();
                        for (Item item : items) {
                            if (code.equals(item.getCode())) {
                                item.setStock(item.getStock() + quantity);
                            }
                        }
                    } else {
                        System.out.println("El producto no existe");
                    }
                    break;
                case 6:
                    System.out.println("VENTA");
                    do {

                        System.out.print("Introduzca el código del producto (-1 para salir): ");
                        code = s.next();
                        if (!code.equals("-1")) {

                            // Comprobamos si el producto existe
                            for (Item item : items) {
                                if (code.equals(item.getCode())) {
                                    exists = true;
                                }
                            }
                            // Si existe restamos la cantidad de productos
                            if (exists) {
                                System.out.print("Cantidad a vender: ");
                                quantity = s.nextInt();
                                for (Item item : items) {
                                    if (code.equals(item.getCode())) {
                                        if (item.getStock() >= quantity) {
                                            item.setStock(item.getStock() - quantity);
                                            itemsVendidos.add(item);
                                        } else {
                                            System.out.println("No hay suficiente stock");
                                        }
                                    }
                                }
                            } else {
                                System.out.println("El producto no existe");
                            }
                        }
                    } while (!code.equals("-1"));

                    if (!itemsVendidos.isEmpty()) {

                        System.out.println("VENTA REALIZADA");
                        System.out.println("---------------------------------");
                        for (Item item : itemsVendidos) {
                            System.out.println(item);
                            System.out.println("---------------------------------");
                        }
                        itemsVendidos.clear();
                    }
                    break;
                case 7:

                    exit = true;
                    break;
                default:

                    System.out.println("Opción no válida");
                    break;
            }
            if (!exit) {
                System.out.println("Pulse Intro para continuar");
                s.nextLine();
                s.nextLine();
                clearConsole();
            }
        } while (!exit);
        System.out.println("Hasta luego, vuelva pronto");
    }

    // Método para limpiar la consola
    public static void clearConsole() throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
