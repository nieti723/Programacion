package boletin.ejercicio06;

public class Piso extends Vivienda {
	private boolean balcon;

	public Piso(double precio, int numeroHabitaciones, String nombreBarriada, String calle, boolean balcon) {
		super(precio, numeroHabitaciones, nombreBarriada, calle);
		this.balcon = balcon;
	}

	@Override
	public String toString() {
		return super.toString() + (balcon ? ", Balcón: tiene balcón" : "") + "]";
	}

	public boolean isBalcon() {
		return balcon;
	}
}
