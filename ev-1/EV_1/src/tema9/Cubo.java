package tema9;

public class Cubo {
	private double capacidad;
	private double contenido;
	private int id;
	private static int contador = 0;

	public Cubo(double capacidad, double contenido) {
		super();
		this.capacidad = capacidad;
		this.contenido = contenido;
		contador++;
		id = contador;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public double getContenido() {
		return contenido;
	}

	public void verter(Cubo cubo2) {
		if (contenido + cubo2.contenido > cubo2.capacidad) {
			contenido -= cubo2.capacidad - cubo2.contenido;
			cubo2.contenido = cubo2.capacidad;
		} else {
			cubo2.contenido += contenido;
			contenido = 0;
		}
	}

	@Override
	public String toString() {
		return "-------------------------------------------------\nCubo " + id + ": \nCapacidad: " + capacidad
				+ "\nContenido: " + contenido;
	}

}
