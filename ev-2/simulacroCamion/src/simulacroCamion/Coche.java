package simulacroCamion;

public class Coche extends MedioDeTransporte {

	// Array que va a guardar cada elemento de la melodía que va a tener el coche
	private String[] melodia;

	public Coche(int anyoFabricacion, Claxon claxon) {

		super(anyoFabricacion, claxon);
		generaSonidosMelodia();
	}

	// Método que genera los sonidos de la melodía
	public String[] generaSonidosMelodia() {

		int tam = (int) ((Math.random() * 4) + 3);
		contadorPitos += tam;
		melodia[0] = SonidosMelodia.values()[1].name();
		melodia[tam] = SonidosMelodia.values()[1].name();
		for (int i = 1; i < tam - 1; i++) {
			int valor = (int) (Math.random() * 6);
			melodia[i] = SonidosMelodia.values()[valor].name();
		}

		return melodia;
	}
	
	public void suenaMelodia() {
		for (String string : melodia) {
			System.out.println(string +", ");
		}
	}

}
