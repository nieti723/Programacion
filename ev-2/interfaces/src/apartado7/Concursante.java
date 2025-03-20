package apartado7;

public class Concursante implements Concurso {
	private static double premio = 50;
	private String nombreParticipante;
	private int edadParticipante;

	public Concursante(String nombreParticipante, int edadParticipante) {
		super();
		this.nombreParticipante = nombreParticipante;
		this.edadParticipante = edadParticipante;
	}

	@Override
	public double getPremio() {
		return premio;
	}

	@Override
	public String getNombreParticipante() {
		return nombreParticipante;
	}

	@Override
	public void setEdadParticipante(int edad) {
		edadParticipante = edad;
	}

	@Override
	public int getEdadParticipante() {
		return edadParticipante;
	}

	@Override
	public String toString() {
		return nombreParticipante + " de " + edadParticipante + " años";
	}
	
	public static void ganadorConcurso(Concursante[] concursantes) {
		System.out.println("Prueba");
	}
}
