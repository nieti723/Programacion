package boletin.ejercicio06;

public class Vivienda {
	protected double precio;
	protected int numeroHabitaciones;
	protected String nombreBarriada;
	protected String calle;

	public Vivienda(double precio, int numeroHabitaciones, String nombreBarriada, String calle) {
		super();
		this.precio = precio;
		this.numeroHabitaciones = numeroHabitaciones;
		this.nombreBarriada = nombreBarriada;
		this.calle = calle;
	}

	@Override
	public String toString() {
		return "Vivienda [precio=" + precio + ", numeroHabitaciones=" + numeroHabitaciones + ", nombreBarriada="
				+ nombreBarriada + ", calle=" + calle;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public String getNombreBarriada() {
		return nombreBarriada;
	}
}
