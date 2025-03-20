package boletin.ejercicio08;

public class Perecedero extends Producto {
	private DiasParaCaducar enumDias;

	public Perecedero(String nombre, double precio, DiasParaCaducar diasParaCaducar) {
		super(nombre, precio);
		this.enumDias = diasParaCaducar;
		switch (enumDias.ordinal()) {
		case 0:
			super.setTotal(super.getTotal()+(precio/4));
			break;
		case 1:
			super.setTotal(super.getTotal()+(precio/3));
			break;
		case 2:
			super.setTotal(super.getTotal()+(precio/2));
			break;
		default:
			System.out.println("El valor introducido en días no es válido");
			break;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", dias para que caduque: " + (enumDias.ordinal()+1);
	}
}
