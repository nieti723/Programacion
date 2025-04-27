package moviles;

import java.util.ArrayList;
import java.util.Collections;


public class Principal {

	public static void main(String[] args) {
		ArrayList<Movil> moviles = new ArrayList<>();

		moviles.add(new Movil("iPhone 12 Pro Max", 1259));
		moviles.add(new Movil("Xiaomi Mi 10 Pro", 999));
		moviles.add(new Movil("Samsung Z Flip 5G", 1550));
		moviles.add(new Movil("Huawei P40 Pro+", 1399));
		moviles.add(new Movil("Samsung Z Flip 5G", 1550));
		moviles.add(new Movil("Samsung S20", 1500));
		moviles.add(new Movil("LG V50", 899));
		moviles.add(new Movil("Xiaomi Mi 10 Pro", 999));
		moviles.add(new Movil("Samsung S30", 1300));
		moviles.add(new Movil("Huawei P50 Pro+", 1399));
		moviles.add(new Movil("Samsung Z Flip 4G", 1550));
		moviles.add(new Movil("Huawei P40 Pro+", 1399));
		
		//Hecho con bucle 
//		for (int i = 0; i < moviles.size(); i++) {
//			if (moviles.subList(i+1, moviles.size()).contains(moviles.get(i))) {
//				moviles.remove(i);
//				i--;
//			}
//		}
		
		Collections.sort(moviles);
		for (Movil movil : moviles) {
			System.out.println(movil);
		}

//		//Hecho con Hash para eliminar duplicados
//		HashSet<Movil> movilesSinDup = new HashSet<>();
//		movilesSinDup.addAll(moviles);
//		moviles.clear();
//		moviles.addAll(movilesSinDup);
//		Collections.sort(moviles);
//		
//		for (Movil movil : moviles) {
//			System.out.println(movil);
//		}
		
		
	}

}
