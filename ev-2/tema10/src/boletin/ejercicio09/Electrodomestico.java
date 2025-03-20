package boletin.ejercicio09;

import java.util.Arrays;

public class Electrodomestico {
	protected double precioBase = 100;
	protected static double precioFinal;
	protected String color = "blanco";
	protected char consumo = 'F';
	protected double peso = 5;
	private final String[] colores = {"blanco", "negro", "rojo", "azul",  "gris"};
	private final char[] consumos = {'A', 'B', 'C', 'D', 'E', 'F'};

	public Electrodomestico(){}

	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		super();
		this.precioBase = precioBase;
		precioFinal += precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumo);
		comprobarColor(color);
	}

	private void comprobarConsumoEnergetico(char letra) {
		boolean valido = false;
		for (char c : consumos) {
			if (c == letra) {
				valido = true;
			}
		}
		if (valido) {
			consumo = letra;
		}
	}

	private void comprobarColor(String color) {
		boolean valido = false;
		for (String s : colores) {
			if (s.equalsIgnoreCase(color)) {
				valido = true;
			}
		}
		if (valido) {
			this.color = color;
		}
	}
	
	public void precioFinal() {
		switch (consumo) {
		case 'A':
			precioFinal += 100;
			break;
		case 'B':
			precioFinal += 80;
			break;
		case 'C':
			precioFinal += 60;
			break;
		case 'D':
			precioFinal += 50;
			break;
		case 'E':
			precioFinal += 30;
			break;
		case 'F':
			precioFinal += 10;
			break;
		}
		if (peso<20) {
			precioFinal += 10;
		} else if (peso<50) {
			precioFinal += 50;
		} else if (peso<80) {
			precioFinal += 80;
		} else {
			precioFinal += 100;
		}
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public static double getPrecioFinal() {
		return precioFinal;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String[] getColores() {
		return colores;
	}

	public char[] getConsumos() {
		return consumos;
	}

	@Override
	public String toString() {
		return "Electrodomestico:\n" + "- Precio base:" + precioBase + "\n- Color: " + color + "\n- Consumo:" + consumo + "\n- Peso:"
				+ peso;
	}
}
