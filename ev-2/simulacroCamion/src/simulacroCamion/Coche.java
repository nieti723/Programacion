package simulacroCamion;


public class Coche extends MedioDeTransporte {

	// Array que va a guardar cada elemento de la melodía que va a tener el coche
	private String[] melodia;

	public Coche(int anyoFabricacion, Claxon claxon) {

		super(anyoFabricacion, claxon);
		this.melodia = generaSonidosMelodia();
		suenaMelodia();
	}

	// Método que genera los sonidos de la melodía
	public String[] generaSonidosMelodia() {

		int tam = (int) ((Math.random() * 4) + 3);
		contadorPitos += tam;
		numSonidos = tam;
		String[] melodia = new String[tam];
		melodia[0] = SonidosMelodia.pii.name();
		melodia[tam-1] = SonidosMelodia.pii.name();
		for (int i = 1; i < tam - 1; i++) {
			int valor = (int) (Math.random() * 6);
			melodia[i] = SonidosMelodia.values()[valor].name();
		}
		
		return melodia;
	}
	
	public void suenaMelodia() {
		for (String string : melodia) {
			System.out.print(string +", ");
		}
	}
	
	public static String clonaMelodia(String[] mel){
		
	    	String copiaMel = String.join(", ", mel);
	    
		return copiaMel;
	}

	@Override
	public String toString() {
		return "Coche: " + super.toString() + "\nTipo de claxon: " + claxon;
	}

	public String[] getMelodia() {
	    return melodia;
	}
	
}
