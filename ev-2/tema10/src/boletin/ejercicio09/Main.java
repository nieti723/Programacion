package boletin.ejercicio09;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//ArrayList que va a almacenar todos los electrodomésticos
		ArrayList<HouseholdAppliance> appliances = new ArrayList<>();
		appliances.add(new HouseholdAppliance());
		appliances.add(new Television());
		appliances.add(new WashingMachine());
		
		for (HouseholdAppliance element : appliances) {
			element.finalPrice();
		}
		
		System.out.println(HouseholdAppliance.getTotalPrice());
		System.out.println(Television.getTotalTV());
		System.out.println(WashingMachine.getTotalWM());
		
	}

}
