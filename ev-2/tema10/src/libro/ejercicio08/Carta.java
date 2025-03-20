package libro.ejercicio08;

import java.util.Objects;

public class Carta implements Comparable<Carta> {
	private String palo;
	private String carta;
	private int valor;
	
	public Carta(String palo, String carta, int valor) {
		this.palo = palo;
		this.carta = carta;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return carta + " de " + palo;
	}

	public String getPalo() {
		return palo;
	}

	public String getCarta() {
		return carta;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(carta, palo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(carta, other.carta) && Objects.equals(palo, other.palo) && valor == other.valor;
	}

	@Override
	public int compareTo(Carta o) {
		if (this.palo.equals(o.palo)) {
			return this.valor - o.valor;
		} else {
			return this.palo.compareTo(o.palo);
		}
	}
	
}
