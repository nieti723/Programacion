package ejercicio7;

public class PilotoDeFormula1 implements MetodosDePilotoFormula1{
	private String nombre;
	private String apellido;
	private String escuderia;
	private String nacionalidad;
	private int trofeosGanados;
	private int numeroEnParrilla;
	private int edad;
	private int tiempoEnF1;
	private int tiempoEnEscuderia;
	
	@Override
	public String getEscuderia() {
		return escuderia;
	}

	@Override
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getApellido() {
		return apellido;
	}

	@Override
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String getNacionalidad() {
		return nacionalidad;
	}

	@Override
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public int getTrofeosGanados() {
		return trofeosGanados;
	}

	@Override
	public void setTrofeosGanados(int trofeosGanados) {
		this.trofeosGanados = trofeosGanados;
	}

	@Override
	public int getNumeroEnParrilla() {
		return numeroEnParrilla;
	}

	@Override
	public void setNumeroEnParrilla(int numeroEnParrilla) {
		this.numeroEnParrilla = numeroEnParrilla;
	}

	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int getTiempoEnF1() {
		return tiempoEnF1;
	}

	@Override
	public void setTiempoEnF1(int tiempoEnF1) {
		this.tiempoEnF1 = tiempoEnF1;
	}

	@Override
	public int getTiempoEnEscuderia() {
		return tiempoEnEscuderia;
	}

	@Override
	public void setTiempoEnEscuderia(int tiempoEnEscuderia) {
		this.tiempoEnEscuderia = tiempoEnEscuderia;
	}

	@Override
	public void celebracionTriunfo() {
	}

	@Override
	public void circuito(String nombCircuito) {
	}

	@Override
	public void adelanta(String piloto) {
	}

	@Override
	public void gana() {
	}

	@Override
	public void averia() {
	}

	@Override
	public int nuevoTrofeo() {
		return 0;
	}

	@Override
	public void nuevaEscuderia(String nuevaEscuderia) {
	}
	
}
