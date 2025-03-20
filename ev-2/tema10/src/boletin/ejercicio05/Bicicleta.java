package boletin.ejercicio05;

public class Bicicleta extends Vehiculo {
	private int caballito;
	private boolean caida = false;

	public Bicicleta() {
	}

	public void andar(int distancia) {
		if (caida) {
			System.out.println("Te has caído, no puedes seguir andando en bici");
		} else {
			if (distancia < 0) {
				System.out.println("La distancia no puede ser negativa");
			} else {
				setKilometrosRecorridos(getKilometrosRecorridos() + distancia);			
				setKilometrosTotales(getKilometrosTotales() + distancia); 
			}
		}
	}

	public void caballito() {
		if (caida) {
			System.out.println("Te has caído, no puedes seguir andando en bici");
		} else {
			caballito++;
			if (caballito >= 3) {
				System.out.println("NO!!!!! Te has caído 🤕🧑‍🦽‍");
				caida = true;
			}
		}
	}

	public int getCaballito() {
		return caballito;
	}

	public void setCaballito(int caballito) {
		this.caballito = caballito;
	}

	public boolean isCaida() {
		return caida;
	}

	public void setCaida(boolean caida) {
		this.caida = caida;
	}

	@Override
	public String toString() {
		return "Bicicleta:\n" + "Id: " + super.getId() + "\nDistancia recorrida: " + getKilometrosRecorridos() + " km";
	}
}
