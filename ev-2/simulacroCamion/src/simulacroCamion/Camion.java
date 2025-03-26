package simulacroCamion;

public class Camion extends MedioDeTransporte {

	private String sonidoCamion;

	// CONSTRUCTOR

	public Camion(int anyoFabricacion, Claxon claxon) {
		
		super(anyoFabricacion, claxon);
		switch (claxon.ordinal()) { // Rellena la variable sonidoCamion con el valor elegido por el usuario
		case 0:
			sonidoCamion = "brrrroonn";
			break;
		case 1:
			sonidoCamion = "fiiiiiii";
			break;
		}
		contadorPitos++;
		System.out.println(getSonidoCamion());
	}

	public String getSonidoCamion() {
		return sonidoCamion;
	}

	@Override
	public String toString() {
		return "Camion: " + super.toString() + "\nClaxon: " + sonidoCamion;
	}
	
}
