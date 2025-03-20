package boletin.ejercicio09;

public class HouseholdAppliance {

	private final double basePrice = 100;
	protected double price = basePrice;
	private final String defaultColor = "Blanco";
	protected String color = defaultColor;
	private final char defaulEnergyConsumption = 'F';
	protected char energyConsumption = defaulEnergyConsumption;
	private final int defaultWeight = 5;
	protected int weight = defaultWeight;
	protected String[] availableColor = { "Blanco", "Negro", "Rojo", "Azul", "Gris" };
	protected char[] availableConsumption = { 'A', 'B', 'C', 'D', 'E', 'F' };

	// CONSTRUCTORES

	public HouseholdAppliance() {

	}

	public HouseholdAppliance(double price, int weight) {

		this.price = price;
		this.weight = weight;
	}

	public HouseholdAppliance(double price, String color, char energyConsumption, int weight, String[] availableColor) {

		this.price = price;
		this.color = color;
		this.weight = weight;
		checkColor(color);
		checkEnergyConsumption(energyConsumption);
	}

	// MÉTODOS

	private void checkEnergyConsumption(char energyConsumption) {

		boolean valid = false;
		for (char c : availableConsumption) {
			if (c == energyConsumption) {
				valid = true;
			}
		}
		if (!valid) {
			this.energyConsumption = defaulEnergyConsumption;
		} else {
			this.energyConsumption = energyConsumption;
		}
	}

	private void checkColor(String color) {

		boolean valid = false;
		for (String string : availableColor) {
			if (string.equals(color)) {
				valid = true;
			}
		}
		if (!valid) {
			this.color = defaultColor;
		} else {
			this.color = color;
		}
	}
	
	public void finalPrice() {
		switch (energyConsumption) {
		case 'A':
			price += 100;
			break;
		case 'B':
			price += 80;
			break;
		case 'C':
			price += 60;
			break;
		case 'D':
			price += 50;
			break;
		case 'E':
			price += 30;
			break;
		case 'F':
			price += 10;
			break;
		}
	}
}
