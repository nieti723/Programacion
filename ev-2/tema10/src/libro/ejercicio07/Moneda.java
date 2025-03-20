package libro.ejercicio07;

public class Moneda {
	//ATRIBUTOS
	//Valor de la moneda
	private String value;
	//sideición en la que cae
	private String side;
	
	public Moneda(String value, String side) {
		this.value = value;
		this.side = side;
	}

	@Override
	public String toString() {
		return value + " - " + side;
	}
	
}
