package ejecuta;

import clases.Hamster;
import clases.Mascota;

public class Main {

	public static void main(String[] args) {
		
		Mascota miMascota = new Mascota("Bobby", 8);
		String texto;
		Hamster hams = new Hamster("Marrón", "ExtraVital", "Hams", 3);

		texto = hams.toString();
		System.out.println(texto);
		
	}

}
