package boletin.ejercicio05;

public class Coche extends Vehiculo {
	private int quemaRueda;
	private boolean ruedas = true;

	public Coche() {
	}

	public void andar(int distancia) {
		if (!ruedas) {
			System.out.println("Tus ruedan han estallado");
		} else {
			if (distancia < 0) {
				System.out.println("La distancia no puede ser negativa");
			} else {
				setKilometrosRecorridos(getKilometrosRecorridos() + distancia);
				setKilometrosTotales(getKilometrosTotales() + distancia);
			}
		}
	}

	public void quemaRueda() {
		if (!ruedas) {
			System.out.println("Tus ruedan han estallado");
		} else {
			System.out.println("");
			quemaRueda++;
			if (quemaRueda >= 3) {
				System.out.println("NO!!!!! Tus ruedas han explotado 💥");
				ruedas = false;
			}
		}
	}

	@Override
	public String toString() {
		return "Coche:\n" + "Id: " + super.getId() + "\nDistancia recorrida: " + getKilometrosRecorridos() + " km";
	}
}
