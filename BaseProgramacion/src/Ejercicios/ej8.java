package Ejercicios;

import java.util.Scanner;

public class ej8 {
	
	public static void main(String[] args) {
		/*
		 * 8. Programa que lee 4  números. Al finalizar mostrará el máximo introducido,
		 *  y cuántas veces se repite dicho máximo
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		//Variables
		int numero;
		int maximo = Integer.MIN_VALUE;
		int contRepeticionesMaximo = 0;
		String mensaje;
		Scanner sc = new Scanner(System.in);
		
		//Iniciamos el bucle for para leer los 4 números
		for (int i=1 ; i<=4; i++) {
			System.out.println("Introduzca número");
			numero = sc.nextInt();
			
			//Si el número introducido es mayor al número máximo, ese número pasará a ser el máximo
			if(numero > maximo) {
				maximo = numero;
				contRepeticionesMaximo = 1;
			}
			
			/*Si el número introducido es igual al máximo entonces aumenta 
			el contador de veces que se ha repetido el número máximo*/
			else if (numero == maximo) {
				contRepeticionesMaximo++;
			}
		}
		mensaje = "El maximo es " + maximo + " y se repite " + contRepeticionesMaximo + " veces ";
		System.out.println(mensaje);
		sc.close();
	}
	
}
