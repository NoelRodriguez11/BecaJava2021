package Arrays;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		/*
		 *19. Realiza un programa que lea desde teclado 10 números y posteriormente muestre solamente
		 *    los que sean pares.
		 *    
		 *     Introduzca 4 números: 100, 201, 51, 18
		 *     
		 *     Los pares son: 100, 18
		 * 
		 */
			
		int numeros[] = new int[4];
		int num;
		int resto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 4 números");
		
		//Poblamos el array
		for (int i=0; i < 4; i++) {
			numeros[i] = sc.nextInt();
		}
		
		//Recorremos el array de principio a fin
		for (int i=0; i < 4; i++) {
			num = numeros[i];
			
			//Comprobamos si el número es par diviendolo entre 2 y si el resto es 0 será par
			resto = num%2;
			
			if(resto == 0) {
				System.out.println(num + " es par");
			}
		}
		//Mostrar el contenido del array
		
		
		sc.close();
	}

}
