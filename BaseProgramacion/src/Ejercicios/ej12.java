package Ejercicios;

import java.util.Scanner;

public class ej12 {
	public static void main(String[] args) {
		/*
		   12. Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		   número es primo si tiene dos únicos divisores que son el 1 y él mismo.
		 */
		
		//Variables
		Scanner sc = new Scanner(System.in);
		boolean primo = true;
		int numero;
		int resto;
		String mensaje;
		
		//Pedimos el número por consola
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		
		//Inicio del bucle 
		for(int candidatoDivisor = 2; candidatoDivisor < numero && primo == true; candidatoDivisor++) {
			
			//Comprobamos el resto dividiendo el número por todos los números desde el 2 hasta llegar a el mismo
			resto = numero%candidatoDivisor;
			
			//Si el resto es igual a 0 entonces el número sera primo
			if(resto == 0) {
				primo = false;
			}
		}
		
		mensaje = (primo == true)?"Es primo":"No es primo";
		System.out.println(mensaje);
			
			sc.close();
		}
	}