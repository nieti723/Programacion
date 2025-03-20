package boletin.ejercicio09;

public class Lavadora extends Electrodomestico{
	private final int defaultCarga = 5;
	private int carga;
	private static double precioFinal;

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Lavadora(double precioBase, String color, char consumo, double peso, int carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga + defaultCarga;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	public void precioFinal() {
		super.precioFinal();
		if (carga > 30) {
			precioFinal += 50;
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\n- Carga: " + carga;
	}
}
