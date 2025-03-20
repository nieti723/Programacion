package boligrafo;

import java.util.Objects;

public class Boligrafo implements Comparable<Boligrafo> {
	private int id;
	private String marca;
	private String modelo;
	private double precio;
	private static int cont = 1;

	public Boligrafo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		id = cont;
		cont++;
	}

	@Override
	public String toString() {
		return "Boli" + id + ": " + marca + "\t" + modelo + "\t\t" + precio + "€";
	}

	@Override
	public int compareTo(Boligrafo o) {
		return this.marca.compareTo(o.marca);
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Boligrafo other = (Boligrafo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
}
