package boletin.ejercicio06;

public class Casa extends Vivienda{
	private boolean jardin;
	private boolean patio;
	
	public Casa(double precio, int numeroHabitaciones, String nombreBarriada, String calle, boolean jardin,
			boolean patio) {
		super(precio, numeroHabitaciones, nombreBarriada, calle);
		this.jardin = jardin;
		this.patio = patio;
	}

	@Override
	public String toString() {
		return super.toString() + " jardin=" + jardin + ", patio=" + patio + "]";
	}
}
