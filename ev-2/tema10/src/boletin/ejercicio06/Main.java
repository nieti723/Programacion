package boletin.ejercicio06;

public class Main {

	public static void main(String[] args) {
		Casa v1 = new Casa(120000, 3, "Barriada del Carme", "Calle falsa 123", false, true);
		Piso v2 = new Piso(150000, 3, "Barriada del Carmen", "Calle falsa 178", false);
		Piso v3 = new Piso(0, 4, "El paseo de Consolación", "calle Av. de Italia 1290", true);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println("¿Tiene balcón el piso situado en " + v3.getNombreBarriada() + ", con " + v3.getNumeroHabitaciones() + " habitaciones?: " +
				(v3.isBalcon() ? "Tiene balcón" : "No tiene balcón"));
	}	

}
