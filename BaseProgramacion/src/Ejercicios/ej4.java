package Ejercicios;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {

		/*
		 * 4. Programa que muestra todos los divisores de un n�mero introducido. Entre los divisores no se incluir�
		 * el propio n�mero
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero:");
		numero = sc.nextInt();
		
		for ( int i=1; i < numero; i++) {
			
			if (numero%i == 0) {
				System.out.println(i+ " Es un divisor");
			}
			
		}
		sc.close();
	}

}
