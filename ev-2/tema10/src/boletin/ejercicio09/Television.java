package boletin.ejercicio09;

public class Television extends Electrodomestico{

    private int res = 20;
    private boolean tdt = false;

    public Television() {}
    
    public Television (double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television (int res, boolean tdt) {
        this.res = res;
        this.tdt = tdt;
    }

    //MÉTODOS

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (res > 40) {
            precioFinal += precioBase * 0.3;
        }
        if (tdt) {
            precioFinal += 50;
        }
    }
    
    // GETTERS

    public int getRes() {
        return res;
    }


    public boolean isTdt() {
        return tdt;
    }

    @Override
    public String toString() {
        return super.toString() + "\n- Resolución: " + res + "\n- TDT: " + tdt;
    }

    
}
