package ejecuta;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		//		-------------------------
		// Value | 20 | 10 | 15 | 40 |
		//		-------------------------
		// Key  Otoño Invierno Primavera Verano
		
		//HashMap<String , Integer> temperaturasMaxEstacion = new HashMap<String, Integer>();
		var temperaturasMaxEstacion = new HashMap<String, Integer>();
		int temperatura;
		String mensaje;
		
		temperaturasMaxEstacion.put("Otoño", 20);
		temperaturasMaxEstacion.put("Invierno", 10);
		temperaturasMaxEstacion.put("Primavera", 15);
		temperaturasMaxEstacion.put("Verano", 40);	
		
		temperatura = temperaturasMaxEstacion.get("Primavera");
		
		mensaje = "La máxima en primavera es de " + temperatura + " grados.";
		System.out.println(mensaje);
		
		//Eliminamos el item de clave Primavera
		temperaturasMaxEstacion.remove("Primavera");
		
		//Recorremos la colección Otoño, Invierno, Primavera, Verano, es decir, las claves
		for(String clave : temperaturasMaxEstacion.keySet() ) {
			
			temperatura = temperaturasMaxEstacion.get(clave);
			mensaje = "La máxima en primavera es de " + temperatura + " grados.";
			
			System.out.println(mensaje);
		}
	}

}
