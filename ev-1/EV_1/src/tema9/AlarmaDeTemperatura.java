package tema9;

public class AlarmaDeTemperatura {
	private int temperatura = 40;

	public AlarmaDeTemperatura() {
		
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void cambioTemperatura(int nuevaTemperatura) {
		if (temperatura + nuevaTemperatura < 0) {
			System.out.println("La temperatura resultante no puede ser negativa");
		} else {
			temperatura += nuevaTemperatura;
		}
	}

	@Override
	public String toString() {
		return "La temperatura actual es: " + temperatura;
	}
}
