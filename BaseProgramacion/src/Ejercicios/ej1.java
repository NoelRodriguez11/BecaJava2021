package Ejercicios;

import java.util.Scanner;

public class ej1 {
	
	public static void main(String[] args) {
		
	

	/*
	 * 1. Programa que lee dos n�meros A y B, y nos informa si B es divisor de A o no.
	 * 
	 * Autor: Noel
	 * Fecha: 20-09-2021
	 */
	
	//Variables
	Scanner sc;
	int a;
	int b;
	String mensaje;
	
	//Abrir el escaner
	sc = new Scanner(System.in);
	
	//Pedida de n�meros por consola
	System.out.println("Introduce el primer n�mero:");
	a = sc.nextInt();
	
	System.out.println("Introduce el segundo n�mero:");
	b = sc.nextInt();
	
	//Inicio del condicional If
	if(a%b == 0) {
		mensaje = b + " es divisor de " + a;
	}
	else {
		mensaje = b + " no es divisor de " + a;
	}
	
	//Lanzamos el texto
	System.out.println(mensaje);
	sc.close();
	}
}
