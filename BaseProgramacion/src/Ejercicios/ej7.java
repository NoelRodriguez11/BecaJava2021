package Ejercicios;

import java.util.Scanner;

public class ej7 {
	
	public static void main(String[] args) {
		/*
		 * 7. Programa que pide el n�mero de calificaciones a introducir, y una nota de corte. A continuaci�n se introducir�n
		 * las calificaciones, para finalmente indicar cu�ntas calificaciones han igualado o superado la nota de corte.
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		//Declaramos las variables
		float nota;
		float notaCorte;
		int cantidadNotas;
		int contCalificaciones = 0;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los datos
		System.out.println("�Cu�ntas notas desea introducir?");
		cantidadNotas = sc.nextInt();
		
		System.out.println("Introduzca nota de corte");
		notaCorte = sc.nextFloat();
		
		//Calculamos
		for (int contadorNotas = 1; contadorNotas <= cantidadNotas; contadorNotas++) {
			System.out.println("Introduzca nota:");
			nota = sc.nextFloat();
			
			if (nota >= notaCorte) {
				contCalificaciones++;
			}
		}
		System.out.println("El n�mero de calificaciones que supera la nota de corte es " +contCalificaciones);
		sc.close();
	}
}
