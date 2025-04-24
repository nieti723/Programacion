package lib;

import suma.ExcepcionPares;

public class ExcepcionesPropias {
	
	public static void esPar(int n) throws ExcepcionPares {
		if (n%2 == 0) {
			throw new ExcepcionPares("El número no puede ser par");
		}
	}
	
}
