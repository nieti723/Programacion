package apartado7;

public class Main {

	public static void main(String[] args) {
		double media;
		Concursante[] concursantes = new Concursante[5];
		concursantes[0] = new Concursante("Antonio", 20);
		concursantes[1] = new Concursante("Carmen", 21);
		concursantes[2] = new Concursante("Laura", 22);
		concursantes[3] = new Concursante("Adela", 23);
		concursantes[4] = new Concursante("Luis", 26);
		media = Concurso.getMediaEdadParticipantes(concursantes);
		System.out.println("La media de edad de los concursantes es: " + media);
		System.out.println();
		Concursante.ganadorConcurso(concursantes);
	}

}
