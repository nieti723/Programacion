package boletin.ejercicio05;

public abstract class Vehiculo {
	protected static int vehiculosCreados;
	protected static int kilometrosTotales;
	private int kilometrosRecorridos;
	private int id;

	public Vehiculo() {
		vehiculosCreados++;
		id = vehiculosCreados;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}

	public static void setVehiculosCreados(int vehiculosCreados) {
		Vehiculo.vehiculosCreados = vehiculosCreados;
	}

	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	public static void setKilometrosTotales(int kilometrosTotales) {
		Vehiculo.kilometrosTotales = kilometrosTotales;
	}

	public int getId() {
		return id;
	}
}
