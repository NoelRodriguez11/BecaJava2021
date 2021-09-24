package ejecuta;

import clases.Movil;

public class Main {

	public static void main(String[] args) {

		Movil moviles[] = new Movil[3];
		
		Movil m1 = new Movil(8, "Apple", 4);
		Movil m2 = new Movil(10, "Samsung", 5);
		Movil m3 = new Movil(12, "Xiaomi", 4);
	
		Movil moviles2[] = {new Movil(9, "Apple", 5), new Movil(11, "Samsung", 2), new Movil(13, "Xiaomi", 5)};
		
		Movil movil;
		
		String texto;
		
		moviles[0] = m1;
		moviles[1] = m2;
		moviles[2] = m3;
		
		for(int i=0; i<3; i++) {
			System.out.println(moviles[i].toString());
		}
	}

}
