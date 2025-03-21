package boletin.ejercicio09;

public class HouseholdAppliance {

	private final double basePrice = 100;
	protected double finalPrice = basePrice;
	private static double totalPrice;
	private final String defaultColor = "Blanco";
	protected String color = defaultColor;
	private final char defaulEnergyConsumption = 'F';
	protected char energyConsumption = defaulEnergyConsumption;
	private final int defaultWeight = 5;
	protected int weight = defaultWeight;
	private String[] availableColor = { "Blanco", "Negro", "Rojo", "Azul", "Gris" };
	private char[] availableConsumption = { 'A', 'B', 'C', 'D', 'E', 'F' };

	// CONSTRUCTORES

	public HouseholdAppliance() {

	}

	public HouseholdAppliance(double finalPrice, int weight) {

		this.finalPrice = finalPrice;
		this.weight = weight;
	}

	public HouseholdAppliance(double finalPrice, String color, char energyConsumption, int weight,
			String[] availableColor) {

		this.finalPrice = finalPrice;
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
			finalPrice += 100;
			break;
		case 'B':
			finalPrice += 80;
			break;
		case 'C':
			finalPrice += 60;
			break;
		case 'D':
			finalPrice += 50;
			break;
		case 'E':
			finalPrice += 30;
			break;
		case 'F':
			finalPrice += 10;
			break;
		}

		if (weight < 20) {
			finalPrice += 10;
		} else if (weight < 50) {
			finalPrice += 50;
		} else if (weight < 80) {
			finalPrice += 80;
		} else {
			finalPrice += 100;
		}

		totalPrice += finalPrice;
	}

	// toString
	
	@Override
	public String toString() {
		return "HouseholdAppliance [finalPrice=" + finalPrice + ", color=" + color + ", energyConsumption="
				+ energyConsumption + ", weight=" + weight + "]";
	}
	
	// Getters y setters

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public static double getTotalPrice() {
		return totalPrice;
	}

	public static void setTotalPrice(double totalPrice) {
		HouseholdAppliance.totalPrice = totalPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getEnergyConsumption() {
		return energyConsumption;
	}

	public void setEnergyConsumption(char energyConsumption) {
		this.energyConsumption = energyConsumption;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
