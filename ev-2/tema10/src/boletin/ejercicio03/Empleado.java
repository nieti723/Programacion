package boletin.ejercicio03;

public class Empleado {
	private String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
}
