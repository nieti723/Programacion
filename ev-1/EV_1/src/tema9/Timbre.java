package tema9;

public class Timbre {
	private static boolean activo;

	public Timbre() {
		super();
	}
	
	public void timbre(int temperatura) {
		if (temperatura >= 80) {
			if (activo) {
				System.out.println("La alarma aún sigue activa");
			} else {
				System.out.println("Alarma Alarma Alarma La temperatura está muy alta");
				activo = true;
			}
		} else {
			if (activo) {
				System.out.println("Temperatura ha bajado a niveles normales");
				activo = false;
			} else {
				System.out.println("La temperatura está en niveles normales");
			}
		}
	}
}
