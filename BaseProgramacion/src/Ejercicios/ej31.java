package Ejercicios;

import java.util.Scanner;

public class ej31 {

	public static void main(String[] args) {
		/* Realiza un programa que gestione una tabla ordenada ascendentemente y con un máximo
			de 18 elementos. No se permitirán repetidos:
			Menú:
			1.- Introducir número entero.
			2.- Listar números.
			3.- Eliminar número.
			3.- Eliminar todos los números.
			4.- Salir.*/
		
		String menu;
		Scanner sc;
		int num;
		int[] numeros = new int[18];
		int opcion = 0;
		int i = 0;
		int j;
		int contIntercambios = 0;
		int auxiliar;
		int k;
		
		menu = "--MENÚ--\n"
			 + "1. - Introducir número entero\n"
			 + "2. Listar números\n"
			 + "3. Eliminar número\n"
			 + "4. Eliminar todos los números\n"
			 + "5. Salir\n";
		
		sc = new Scanner(System.in);
		
		do {
			System.out.println(menu);
			System.out.println("Introduzca opción: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					
					if (i == 18) {
						System.out.println("Array lleno, no se ha guardado.");
					}
					else {
					
					//Introducimos número
					System.out.println("Introduzca número");
					num = sc.nextInt();
					
					//Comprobamos que no esté repetido
					for(j=0; j<i && numeros[j]!=num; j++);
					
					if (i==j) {
						numeros[i] = num;
						i++;
						
						//Ordenamos el array con el algoritmo de la burbuja
						do {
							contIntercambios = 0;
							
							for(j = 0; j < numeros.length-1; j++) {
								//Si el número de la posición actual es mayor que el siguiente se intercambian
								auxiliar = numeros[j];
								numeros[j] = numeros[j+1];
								numeros[j+1] = auxiliar;
								
								//Incrementamos el contador de intercambios
								contIntercambios++;
							}
						}while(contIntercambios>0);
						
					}
					else {
						System.out.println("Número repetido. No se ha guardado en el array");
					}
					
					}
					break;
					
				case 2:
						if(i==0) {
							System.out.println("Sin datos");
						}
						else {
							System.out.println("Contenido del array");
							for(j = 0; j < i; j++) System.out.println(numeros[j]);
						}
					break;
					
				case 3:
					System.out.println("Introduzca número");
					num = sc.nextInt();
					
					for(j=0; j<i && numeros[j]!=num; j++);
					if (i==j) {
						System.out.println("No se ha encontrado, no eliminado");
					}
					
					else {
							for (k = j; k < i-1; k++) {
								numeros[k] = numeros[k+1];
							}
						}
						// decrementamos en una unidad la variable i,
						// puesto que hemos eliminado un elemento
						i--;
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("Opción incorrecta");
					break;
			}
			
		}while(opcion!=5);
		
	}

}
