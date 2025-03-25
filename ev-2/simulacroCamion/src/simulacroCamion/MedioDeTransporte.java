package simulacroCamion;

public class MedioDeTransporte {
	
	protected final int anyoFabricacion;
	protected Claxon claxon;
	protected static int contadorPitos;
	
	// CONSTRUCTOR 
	public MedioDeTransporte(int anyoFabricacion, Claxon claxon) {
		this.anyoFabricacion = anyoFabricacion;
		this.claxon = claxon;
	}
	
	//GETTERS Y SETTERS

	public Claxon getClaxon() {
		return claxon;
	}

	public void setClaxon(Claxon claxon) {
		this.claxon = claxon;
	}

	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}

	public static int getContadorPitos() {
		return contadorPitos;
	}

}
