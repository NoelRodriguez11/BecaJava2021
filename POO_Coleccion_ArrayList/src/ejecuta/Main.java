package ejecuta;

import java.util.ArrayList;

import clases.Movil;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Movil> moviles = new ArrayList<Movil>();
		
		Movil movilJuan = new Movil (111, "Iphone", 4, 4);
		Movil movilMaria = new Movil (222, "Samsung", 6, 5);
		Movil movilPedro = new Movil (333, "Huawei", 8, 4);
		
		moviles.add(movilJuan);
		moviles.add(movilMaria);
		moviles.add(movilPedro);
		
		System.out.println("CONTENIDO DEL ARRAYLIST");
		for (Movil movil: moviles) {
			System.out.println(movil);
		}
		
		
	}

}
