package Ejemplos;

import java.io.IOException;
import java.util.Scanner;

public class Ejemplo_Abrir_Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		
	do {	
		System.out.println("MENU");
		System.out.println("=======");
		System.out.println("1. CALCULADORA");
		System.out.println("2. BLOC DE NOTAS");
		System.out.println("3. Salir");
		System.out.println("Introduzca opcion: ");
		
		opcion = sc.nextInt();
		
		if (opcion == 1) {
		
			try {
				Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
			}
			catch (IOException e) {
				System.out.println("Fichero no encontrado");
			}
		}
		
		else if (opcion == 2) {
			try {
				Runtime.getRuntime().exec("C:\\Windows\\System32\\notepad.exe");
			}
			catch (IOException e) {
				System.out.println("Fichero no encontrado");
			}
		}
		
		else if (opcion == 3) {
			System.out.println("¡HASTA PRONTO!");
		}
	}while(opcion!=3);

	}

}
