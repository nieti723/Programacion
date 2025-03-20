package tema9;

public class CuentaCorriente {
    private double saldo = 0;
    private String nombre;
    private String passwd;
    private int numeroCuenta;
    private static int contCuentas = 0;

    public CuentaCorriente(String nombre, String passwd) {
        this.nombre = nombre;
        this.passwd = passwd;
        numeroCuenta = contCuentas;
        contCuentas++;   
    }

    public void saldo(String contrasena) {
        if (contrasena.equals(passwd)) {
            System.out.println("Cuenta de " + nombre);
            System.out.println("Saldo actual: " + saldo);
        } else {
            System.out.println("Contraseña incorrecta, usted no puede acceder a su cuenta");
        }
    }

    public void imposicion(double cantidad, String contrasena) {
        if (contrasena.equals(passwd)) {
            if (cantidad < 0) {
                System.out.println("La cantidad no puede ser negativa");
            } else {
                saldo += cantidad;
            }
        } else {
            System.out.println("Contraseña incorrecta, usted no puede acceder a su cuenta");
        }
    }

    public void reintegro(double cantidad, String contrasena) {
        if (contrasena.equals(passwd)) {
            if (cantidad < 0) {
                System.out.println("La cantidad no puede ser negativa");
            } else {
                saldo -= cantidad;
            }
        } else {
            System.out.println("Contraseña incorrecta, usted no puede acceder a su cuenta");
        }
    }

    public void traspaso(double cantidad, CuentaCorriente otraCuenta, String contrasena) {
        if (contrasena.equals(passwd)) {
            if (cantidad < 0) {
                System.out.println("La cantidad no puede ser negativa");
            } else {
                otraCuenta.saldo += cantidad;
                saldo -= cantidad;
                System.out.println("Saldo restante: " + saldo);
            }
        } else {
            System.out.println("Contraseña incorrecta, usted no puede acceder a su cuenta");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getPasswd() {
        return passwd;
    }

    public static int getContCuentas() {
        return contCuentas;
    }

    @Override
    public String toString() {
        return "Cuenta de " + nombre + "\nNúmero de cuenta: " + numeroCuenta + "\nSaldo: " + saldo;
    }

    
}
