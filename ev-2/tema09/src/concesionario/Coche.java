package concesionario;

public class Coche {
	private String matricula;
	private String modelo;
	private String motor;
	private double precio;
	private String color;
	private static double inversion;

	public Coche(String matricula, String modelo, String motor, double precio, String color) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.motor = motor;
		this.precio = precio;
		this.color = color;
		inversion += precio;
	}
	
	public static void datosCoche(Coche[] array, int pos) {
		for (int i = 0; i < array.length; i++) {
			if (i==pos-1) {
				if (array[i] != null) {
					System.out.println(array[i]);					
				} else {
					System.out.println("Ese coche no ha sido creado aún");
				}
			}
		}
	}

	public static double getInversion() {
		return inversion;
	}

	@Override
	public String toString() {
		return modelo + " con matrícula " + matricula + ":\n\n- Motor: " + motor + "\n- Precio:" + precio
				+ "\n- Color: " + color + "\n";
	}

}
