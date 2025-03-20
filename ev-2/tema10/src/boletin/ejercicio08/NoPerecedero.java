package boletin.ejercicio08;

public class NoPerecedero extends Producto{
	private Tipo tipo;

	public NoPerecedero(String nombre, double precio, Tipo tipo) {
		super(nombre, precio);
		this.tipo = tipo;
		super.setTotal(super.getTotal()+precio);
	}

	@Override
	public String toString() {
		return super.toString() + ", tipo: " + tipo;
	}
}
