package tema9;

import java.io.IOException;
import java.util.Scanner;

public class PruebaCuentaCorriente {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner s = new Scanner(System.in);

        boolean continuar = true;
        int op;
        CuentaCorriente[] cuentas = new CuentaCorriente[10];
        String nombre, contrasena;
        int numCuenta, pos = 0, pos2 = 0, cont = 0;
        double cantidad;

        // Presentación
        System.out.println("BIENVENIDO A LA GESTIÓN DE CUENTAS CORRIENTES");
        System.out.println("A CONTINUACIÓN SE LE MOSTRARÁ UN MENÚ CON LAS OPCIONES");
        System.out.print("Pulse una tecla para continuar: ");
        s.nextLine();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        do {
            do {
                System.out.println("---MENÚ---");
                System.out.println("1. Crear una cuenta");
                System.out.println("2. Consultar saldo de su cuenta");
                System.out.println("3. Añadir dinero a su cuenta");
                System.out.println("4. Retirar dinero de su cuenta");
                System.out.println("5. Hacer una transferencia a otra cuenta");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                op = s.nextInt();
                if (op > 6 || op < 1) {
                    System.out.println("Valor incorrecto, introduzca un valor válido");
                }
            } while (op > 6 || op < 1);
            s.nextLine();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            switch (op) {
                case 1:
                    System.out.print("Introduzca su nombre: ");
                    nombre = s.nextLine();
                    System.out.print("Introduzca una contraseña: ");
                    contrasena = s.next();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    cuentas[cont] = new CuentaCorriente(nombre, contrasena);
                    System.out.println(cuentas[cont]);
                    System.out.print("Pulse una tecla para continuar: ");
                    s.nextLine();
                    s.nextLine();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    cont++;
                    break;
                case 2:
                    System.out.print("Introduzca su número de cuenta: ");
                    numCuenta = s.nextInt();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    for (int i = 0; i < cuentas.length; i++) {
                        if (cuentas[i] != null) {
                            if (numCuenta == cuentas[i].getNumeroCuenta()) {
                                System.out.println("Bienvenido " + cuentas[i].getNombre());
                                pos = i;
                            }
                        }
                    }
                    System.out.print("Introduzca su contraseña: ");
                    contrasena = s.next();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    cuentas[pos].saldo(contrasena);
                    System.out.print("Pulse una tecla para continuar: ");
                    s.nextLine();
                    s.nextLine();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;
                case 3:
                    System.out.print("Introduzca su número de cuenta: ");
                    numCuenta = s.nextInt();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    for (int i = 0; i < cuentas.length; i++) {
                        if (cuentas[i] != null) {
                            if (numCuenta == cuentas[i].getNumeroCuenta()) {
                                System.out.println("Bienvenido " + cuentas[i].getNombre());
                                pos = i;
                            }
                        }
                    }
                    System.out.print("Introduzca su contraseña: ");
                    contrasena = s.next();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Bienvenido " + cuentas[pos].getNombre());
                    System.out.print("Introduzca la cantidad a ingresar: ");
                    cantidad = s.nextDouble();
                    cuentas[pos].imposicion(cantidad, contrasena);
                    System.out.print("Pulse una tecla para continuar: ");
                    s.nextLine();
                    s.nextLine();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;
                case 4:
                    System.out.print("Introduzca su número de cuenta: ");
                    numCuenta = s.nextInt();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    for (int i = 0; i < cuentas.length; i++) {
                        if (cuentas[i] != null) {
                            if (numCuenta == cuentas[i].getNumeroCuenta()) {
                                System.out.println("Bienvenido " + cuentas[i].getNombre());
                                pos = i;
                            }
                        }
                    }
                    System.out.print("Introduzca su contraseña: ");
                    contrasena = s.next();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    System.out.println("Bienvenido " + cuentas[pos].getNombre());
                    System.out.print("Introduzca la cantidad a retirar: ");
                    cantidad = s.nextDouble();
                    cuentas[pos].reintegro(cantidad, contrasena);
                    System.out.print("Pulse una tecla para continuar: ");
                    s.nextLine();
                    s.nextLine();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    break;
                case 5:
                    if (CuentaCorriente.getContCuentas() < 2) {
                        System.out.println("No se puede realizar una transferencia ya que no existe otra cuenta");
                    } else {
                        System.out.print("Introduzca su número de cuenta: ");
                        numCuenta = s.nextInt();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        for (int i = 0; i < cuentas.length; i++) {
                            if (cuentas[i] != null) {
                                if (numCuenta == cuentas[i].getNumeroCuenta()) {
                                    System.out.println("Bienvenido " + cuentas[i].getNombre());
                                    pos = i;
                                }
                            }
                        }
                        System.out.print("Introduzca su contraseña: ");
                        contrasena = s.next();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("Bienvenido " + cuentas[pos].getNombre());
                        System.out.print("Introduzca el número de la cuenta a la que va a transferir: ");
                        pos2 = s.nextInt();
                        if (cuentas[pos2] == null) {
                            System.out.println("No existe esa cuenta");
                        } else {
                            System.out.print("Introduzca la canrtidad a transferir: ");
                            cantidad = s.nextDouble();
                            cuentas[pos].traspaso(cantidad, cuentas[pos2], contrasena);
                            System.out.print("Pulse una tecla para continuar: ");
                            s.nextLine();
                            s.nextLine();
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        }
                    }
                    break;
                case 6:
                    continuar = false;
                    break;
            }
        } while (continuar);

    }
}
