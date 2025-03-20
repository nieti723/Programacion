package tema9;

public class Punto {
    private double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void distancia(Punto p2) {
        double distancia;
        distancia = Math.sqrt((Math.pow(x-p2.x,2))+(Math.pow(y-p2.y, 2)));
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}
