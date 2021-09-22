package Ejemplos;

import java.util.Random;

public class Ejemplo_bucle_anidado {

	public static void main(String[] args) {

		int segundos = 0;
		int aleatorio;
		Random r = new Random();
		
		for (int corredor = 1; corredor <= 3; corredor++) {
			
			
			
			aleatorio = r.nextInt(20)+1;
			for(segundos = 0; segundos <= aleatorio; segundos++) {
				
			}
			
			if (segundos < 10) {
				System.out.println("Muy rápido");
			}
			else {
				System.out.println("Lento");
			}
		}
	}

}
