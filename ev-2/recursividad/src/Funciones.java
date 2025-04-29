public class Funciones {

    public static int factorial(int n) {
        if (n <= 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static String invertirCadena(String palabra) {
        if (palabra.length() == 1) {
            return palabra;
        } else {
            return palabra.substring(palabra.length() - 1) + invertirCadena(palabra.substring(0, palabra.length() - 1));
        }
    }

    public static int dividir(int n, int div) {
        if (n < div) {
            return 0;
        } else {
            return 1 + dividir(n - div, div);
        }
    }

    public static int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumaDigitos(n / 10);
        }
    }

    public static int volteaNumero(int n) {
        if (n == 0) {
            return 0;
        } else {
            return ((n % 10) * ((int) Math.pow(10, Integer.toString(n).length() - 1))) + volteaNumero(n / 10);
        }
    }

    public static int multiplicar(int n1, int n2) {
        if (n2 <= 1) {
            return n1;
        } else {
            return n1 + multiplicar(n1, n2 - 1);
        }
    }
}
