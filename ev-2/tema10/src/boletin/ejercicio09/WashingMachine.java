package boletin.ejercicio09;

public class WashingMachine extends HouseholdAppliance {

	// Atributos
	private final int defaultLoad = 5;
	private int load = defaultLoad;
	private static double totalWM;

	// Constructores
	public WashingMachine() {

	}

	public WashingMachine(double finalPrice, int weight) {
		super(finalPrice, weight);
	}

	public WashingMachine(double finalPrice, String color, char energyConsumption, int weight, String[] availableColor,
			int load) {
		super(finalPrice, color, energyConsumption, weight, availableColor);
		this.load = load;
	}
	
	// Métodos
	
	@Override
	public void finalPrice() {
		
		if (load > 30) {
			finalPrice += 50;
		}
		super.finalPrice();
		totalWM += finalPrice;
	}

	// Getters y setters

	public int getLoad() {
		return load;
	}

	public static double getTotalWM() {
		return totalWM;
	}
}
