package tema9;

public class JugadorBaloncesto {
    @SuppressWarnings("unused")
    private String nombre;
    private Posicion posicion;


    public JugadorBaloncesto(String nombre, Posicion posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }


    public Posicion getPosicion() {
        return posicion;
    }

    
}
