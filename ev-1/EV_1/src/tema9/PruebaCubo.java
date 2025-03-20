package tema9;

public class PruebaCubo {

	public static void main(String[] args) {
		Cubo c1 = new Cubo(100, 70);
		Cubo c2 = new Cubo(70, 50);
		System.out.println(c1);
		System.out.println(c2);
		c1.verter(c2);
		System.out.println(c1);
		System.out.println(c2);
	}

}
