package Ejercicios;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		
		/*
		 * 5. Programa que lee 4 números, y en el caso en el que el primero introducido sea igual al último, nos muestra
		 * la media. En caso contrario no se mostrará nada.
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		int primero = 0;
		int ultimo = 0;
		int suma = 0; //acumulador
		float media;
		Scanner sc = new Scanner(System.in);
		
		for (int contadorNumeros = 1; contadorNumeros <= 4; contadorNumeros++) {
			
			System.out.println("Introduzca número");
			
			if(contadorNumeros == 1) {
				primero = sc.nextInt();
				suma = suma + primero;
			}
			
			if(contadorNumeros == 4) {
				ultimo = sc.nextInt();
				suma = suma + ultimo;
			}
			
			if(contadorNumeros !=1 && contadorNumeros!=44) {
				suma = suma + sc.nextInt();
			}
		}
		if (primero == ultimo) {
			media = suma / 4;
			System.out.println("La media es " + media);
			sc.close();
		}
	}

}
