package boletin.ejercicio08;

public class Producto {
	private String nombre;
	private double precio;
	private static double total;
	
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}


	public static double getTotal() {
		return total;
	}


	public static void setTotal(double total) {
		Producto.total = total;
	}


	@Override
	public String toString() {
		return "Nombre: " + nombre + ", precio: " + precio;
	}
}
