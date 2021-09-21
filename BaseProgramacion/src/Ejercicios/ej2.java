package Ejercicios;

import java.util.Scanner;

public class ej2 {
	
	public static void main(String[] args) {
		
		/*
		 * 2. Programa que lee 3 números comprendidos entre el 20 y 40, ambos inclusive. En el caso
			  en el que algún número introducido no se encontrara dentro del rango permitido, se
			  mostrará un mensaje de error y seguirá pidiendo números. El programa finalizará cuando
			  se hayan introducido 3 números válidos y mostrará el número máximo introducido de los
			  3 válidos. Además indicará cuántos números de los introducidos no han sido válidos.
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		int numero;
		int incorrectos = 0;
		int correctos = 0;
		int maximo = 19;
		int minimo = 41;
		Scanner sc = new Scanner(System.in);
		
		//for(int i=1; i<=3;) {
		do {
			System.out.println("Introduzca número:");
			numero = sc.nextInt();
			if(numero < 20 || numero > 40) {
				System.out.println("Incorrecto, introduzca un número entre 20 y 40");
				incorrectos++;
			}
			else {
				System.out.println("Correcto");
				correctos++;
				
				/*Cuando queremos sacar el numero maximo de los tres que pedimos iniciamos una variable con el numero
				 * anterior al minimo permitido y lo comparamos con el numero pasado por consola, para sacar el minimo seria
				 * lo mismo pero al reves
				*/
				if(numero > maximo) {
					maximo = numero;
				}
				if(numero < minimo) {
					minimo = numero;
				}
			}
		}
		while(correctos<3);
		System.out.println("Ya se han introducido los 3 números");
		System.out.println("Se han introducido " + incorrectos + " números incorrectos");
		System.out.println("El número máximo es: "+ maximo);
		System.out.println("El número mínimo es: " + minimo);
		sc.close();
	}

}
