package ejecuta;

import clases.Movil;

public class Main {

	public static void main(String[] args) {
		Movil movilJuan = new Movil(1, "Xiaomi", 4, 3);
		Movil movilMaria = new Movil(2, "Xiaomi", 5, 3);

		if (movilJuan.getImei() == movilMaria.getImei()) {
			System.out.println("Iguales");
		}
		else {
			System.out.println("Distintos");
		}
	}

}
