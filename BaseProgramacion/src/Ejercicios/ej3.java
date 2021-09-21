package Ejercicios;

import java.util.Scanner;

public class ej3 {
	
	public static void main(String[] args) {
		
		/*
		 * 3. Programa que lee de manera consecutiva números hasta que se introducen dos números iguales seguidos.
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		int numero;
		int numero2;
		boolean continuar = true;
		
		Scanner sc = new Scanner(System.in);
		
		/*Dejamos esta variable fuera del bucle porque en el caso de que los números no coincidan pediría de nuevo otros dos
		 * números y seguiría pidiendolos de dos en dos hasta que los dos numeros dentro del bucle coincidiesen.
		 */
		
		System.out.println("Introduzca número");
		numero = sc.nextInt();
		
		do {
			
			System.out.println("Introduzca número");
			numero2 = sc.nextInt();
			
			if(numero == numero2) {
				continuar = false;
			}
			
			//Igualamos el número de dentro del bucle con el de fuera para que no se pierda.
			numero = numero2;
		}
		while (continuar == true);
		System.out.println("Los dos números coinciden, proceso terminado.");
		sc.close();
	}

}
