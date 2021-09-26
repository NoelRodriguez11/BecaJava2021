package Ejercicios;

import java.util.Scanner;

public class ej7 {
	
	public static void main(String[] args) {
		/*
		 * 7. Programa que pide el número de calificaciones a introducir, y una nota de corte. A continuación se introducir�n
		 * las calificaciones, para finalmente indicar cuántas calificaciones han igualado o superado la nota de corte.
		 * 
		 * Autor: Noel
		 * Fecha: 20-09-2021
		 */
		
		//Declaramos las variables
		float nota;
		float notaCorte;
		int cantidadAsignaturas;
		int contCalificaciones = 0;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los datos
		System.out.println("¿Cuántas asignaturas desea introducir?");
		cantidadAsignaturas = sc.nextInt();
		
		System.out.println("Introduzca nota de corte");
		notaCorte = sc.nextFloat();
		
		//Iniciamos el bucle para introducir tantas notas como asignaturas hayamos introducido previamente
		for (int contadorNotas = 1; contadorNotas <= cantidadAsignaturas; contadorNotas++) {
			System.out.println("Introduzca nota:");
			nota = sc.nextFloat();
			
			/*Si la nota introducida por el escaner es superior o igual a la nota de corte, 
			entonces el número de calificaciones superadas aumenta*/
			if (nota >= notaCorte) {
				contCalificaciones++;
			}
		}
		System.out.println("El número de calificaciones que supera la nota de corte es " +contCalificaciones);
		sc.close();
	}
}
