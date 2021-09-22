package Ejercicios;

import java.util.Scanner;

public class ej12 {
	public static void main(String[] args) {
		/*
		   12. Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		   número es primo si tiene dos únicos divisores que son el 1 y él mismo.
		 */
		
		Scanner sc = new Scanner(System.in);
		boolean primo = true;
		int numero;
		int resto;
		String mensaje;
		
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		
		for(int candidatoDivisor = 2; candidatoDivisor < numero && primo == true; candidatoDivisor++) {
			
			resto = numero%candidatoDivisor;
			
			if(resto == 0) {
				primo = false;
			}
		}
		
		mensaje = (primo == true)?"Es primo":"No es primo";
		System.out.println(mensaje);
			
			/*if (primo == true) {
				System.out.println("Es primo");
			}
				
			else {
				System.out.println("No es primo");
			}*/
			
			sc.close();
		}
	}