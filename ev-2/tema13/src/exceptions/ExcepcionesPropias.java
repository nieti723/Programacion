package exceptions;

public class ExcepcionesPropias {
	
	public static void esPar(int n) throws ExcepcionPares {
		if (n%2 == 0) {
			throw new ExcepcionPares("El número no puede ser par");
		}
	}

	public static void fueraIntervalo(int n1, int n2, int n) throws ExcepcionIntervalo{
		if (n < n1 || n > n2) {
			throw new ExcepcionIntervalo("Debe introducir un número entre " + n1 + " y " + n2);
		}
	}

	public static void restaNegativa(int n1, int n2) throws ExcepcionResta{
		if (n2 > n1) {
			throw new ExcepcionResta("El segundo operando no debe ser mayor que el primero");
		}
	}

	public static void divisionInfinita(int n) throws ExcepcionDivision{
		if (n == 0) {
			throw new ExcepcionDivision("El divisor no puede ser 0");
		}
	}

	public static void fueraRango(int n, int tam) throws ExcepcionRango{
		if (n > tam) {
			throw new ExcepcionRango("El valor no puede ser mayor a " + tam);
		}
	}
	
}
