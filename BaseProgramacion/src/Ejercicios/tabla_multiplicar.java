package Ejercicios;

public class tabla_multiplicar {

	public static void main(String[] args) {
		
		//Mostrar las 10 primeras tablas de multiplicar
		
		//TABLA DEL 1
		// 1 x 1 = 1
		// 1 x 2 = 2
		//.......
		// 1 x 10 = 10
		// ===========
		// La suma vale xxxx
		
		//TABLA DEL 2
		// 2 x 1 = 2
		// 2 x 2 = 4
		//.......
		// 2 x 10 = 20
		// ===========
		// La suma vale xxxx
		
		int resultado;
		String fila;
		int suma;
		
		for (int numero = 1; numero <= 10; numero++) {
			
			System.out.println("-----------------------");
			System.out.println("TABLA DEL " +numero);
			System.out.println("-----------------------");
			
			suma = 0;
		
		for (int j=1; j <= 10; j++) {
			
			resultado = numero * j;
			
			suma += resultado;
			
			resultado = numero * j;
			fila = numero + " X " + j + " = " + resultado;
			
			System.out.println(fila);
		}
		System.out.println("====================");
		System.out.println("La suma vale " +suma);
	}

	}
}
