package boletin.ejercicio08;

public class Main {
	public static void main(String[] args) {
		Producto[] productos = new Producto[4];
		productos[0] = new Perecedero("producto 1", 10, DiasParaCaducar.tres);
		productos[1] = new Perecedero("producto 2", 20, DiasParaCaducar.uno);
		productos[2] = new NoPerecedero("producto 3", 5, Tipo.tipo1);
		productos[3] = new NoPerecedero("producto 4", 5, Tipo.tipo2);
		
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		
		System.out.println("El total es " + Producto.getTotal() + "€");
	}
}
