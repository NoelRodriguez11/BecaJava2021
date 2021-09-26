package Ejercicios;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		
		/*
		 * 5. Programa que lee 4 n�meros, y en el caso en el que el primero introducido sea igual al �ltimo, nos muestra
		 * la media. En caso contrario no se mostrar� nada.
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		int primero = 0;
		int ultimo = 0;
		int suma = 0; //acumulador
		float media;
		
		//Iniciamos el escaner
		Scanner sc = new Scanner(System.in);
		
		for (int contadorNumeros = 1; contadorNumeros <= 4; contadorNumeros++) {
			
			System.out.println("Introduzca n�mero");
			
			if(contadorNumeros == 1) {
				primero = sc.nextInt();
				
				//acumulamos el primer número a la suma
				suma = suma + primero;
			}
			
			if(contadorNumeros == 4) {
				ultimo = sc.nextInt();
				
				//acumulamos el último número a la suma
				suma = suma + ultimo;
			}
			
			if(contadorNumeros !=1 && contadorNumeros!=4) {
				suma = suma + sc.nextInt();
			}
		}
		
		/*Igualamos el primer número introducido con el último para compararlos, si son iguales hará una media
		de todos los números introducidos */
		if (primero == ultimo) {
			media = suma / 4;
			System.out.println("La media es " + media);
			sc.close();
		}
	}

}
