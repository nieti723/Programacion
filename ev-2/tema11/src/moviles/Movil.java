package moviles;

import java.util.Objects;

public class Movil implements Comparable<Movil>{
	private String nombre;
	private int precio;

	public Movil(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return nombre + " (" +  precio + " euros)";
	}

	@Override
	public int compareTo(Movil o) {
		if (this.precio - o.precio == 0) {
			return this.nombre.compareTo(o.nombre);
		} else {
			return this.precio - o.precio;			
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movil other = (Movil) obj;
		return Objects.equals(nombre, other.nombre) && precio == other.precio;
	}
}
