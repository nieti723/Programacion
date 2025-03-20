package libro.ejercicio12;

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
	public int compareTo(Carta o) {
		if (this.palo.equals(o.palo)) {
			return this.valor - o.valor;
		} else {
			return this.palo.compareTo(o.palo);
		}
	}
	
}
