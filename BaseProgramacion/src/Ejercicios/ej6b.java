package Ejercicios;

import java.util.Scanner;

public class ej6b {
	
	public static void main(String[] args) {
		/*
		 * 5. Programa que lee 4 números, y en el caso en el que el primero introducido sea igual al último, nos muestra
		 * la media. En caso contrario no se mostrará nada.
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		int primero;
		int ultimo;
		int suma = 0; //acumulador
		float media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca número");
		primero = sc.nextInt();
		
		for(int contadorNumeros = 2; contadorNumeros <= 4; contadorNumeros++) {
			System.out.println("Introduzca número");
			suma += sc.nextInt();
		}
		
		System.out.println("Introduzca número");
		ultimo = sc.nextInt();
		suma += ultimo;
		
		if(primero == ultimo) {
		media = suma / 4F;
		System.out.println("La media es " + media);
		}
		sc.close();
	}
}
