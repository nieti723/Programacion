package boletin.ejercicio09;

public class Television extends HouseholdAppliance {

	// Atributos
	private final int defaultRes = 20;
	private int res = defaultRes;
	private final boolean defaultTdt = false;
	private boolean tdt = defaultTdt;
	private static double totalTV;
	// Constructores

	public Television() {
		super();
	}

	public Television(double finalPrice, int weight) {
		super(finalPrice, weight);
	}

	public Television(double finalPrice, String color, char energyConsumption, int weight, String[] availableColor,
			int res, boolean tdt) {
		super(finalPrice, color, energyConsumption, weight, availableColor);
		this.res = res;
		this.tdt = tdt;
	}

	// Métodos

	@Override
	public void finalPrice() {

		if (res > 40) {
			finalPrice *= 1.3;
		}
		if (tdt) {
			finalPrice += 50;
		}

		super.finalPrice();
		totalTV += finalPrice;
	}

	// Getters y setters

	public int getRes() {
		return res;
	}

	public boolean isTdt() {
		return tdt;
	}
	
	public static double getTotalTV() {
		return totalTV;
	}
}
