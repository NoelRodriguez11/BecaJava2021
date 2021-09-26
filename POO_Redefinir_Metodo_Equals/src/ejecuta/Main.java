package ejecuta;

import java.util.HashMap;

import clases.Movil;

public class Main {

	public static void main(String[] args) {
		
		//HashMap<Integer, Movil> moviles = new HashMap<Integer, Movil>();
		var moviles = new HashMap<Integer, Movil>();	
		
		Movil movilJuan = new Movil(111, "Samsung", 4, 4);
		Movil movilMaria = new Movil(232, "Iphone", 6, 4);
		Movil movilPedro = new Movil(955, "Xiaomi", 4, 5);
		
		Movil movilBusqueda = new Movil(232, "Iphone", 6, 4);
		
		moviles.put(111, movilJuan);
		moviles.put(232, movilMaria);
		moviles.put(955, movilPedro);
		
		movilMaria.equals(movilBusqueda);
		
		if (moviles.containsValue(movilBusqueda)) {
			System.out.println("Encontrado.");
		}
		else {
			System.out.println("NO encontrado");
		}
	}

}
