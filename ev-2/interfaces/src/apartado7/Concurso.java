package apartado7;

public interface Concurso {
	public double getPremio();

	public String getNombreParticipante();

	public void setEdadParticipante(int edad);

	public int getEdadParticipante();

	public static double getMediaEdadParticipantes(Concursante[] concursantes) {
		double suma = 0;
		double media;
		for (Concursante concursante : concursantes) {
			suma += concursante.getEdadParticipante();
		}
		media = suma / concursantes.length;
		return media;
	}

	public static void ganadorConcurso(Concursante[] concursantes) {
		int ganador = (int)(Math.random()*5);
		System.out.println(".... El/la ganador/a de esta edición ha sido: " + concursantes[ganador]);
	}
}
