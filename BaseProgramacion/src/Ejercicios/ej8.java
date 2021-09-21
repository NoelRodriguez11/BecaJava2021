package Ejercicios;

import java.util.Scanner;

public class ej8 {
	
	public static void main(String[] args) {
		/*
		 * 8. Programa que lee 4 números. Al finalizar mostrará el máximo introducido, y cuántas veces se repite dicho máximo
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		int numero;
		int maximo = Integer.MIN_VALUE;
		int contRepeticionesMaximo = 0;
		String mensaje;
		Scanner sc = new Scanner(System.in);
		
		for (int i=1 ; i<=4; i++) {
			System.out.println("Introduzca número");
			numero = sc.nextInt();
			
			if(numero > maximo) {
				maximo = numero;
				contRepeticionesMaximo = 1;
			}
			
			else if (numero == maximo) {
				contRepeticionesMaximo++;
			}
		}
		mensaje = "El maximo es " + maximo + " y se repite " + contRepeticionesMaximo + " veces ";
		System.out.println(mensaje);
		sc.close();
	}
	
}
