package ej1;

import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
		Alumno alumno1;
		Alumno alumno2;
		Alumno alumno3;
		//String mensaje;
		int suma;
		Scanner sc = new Scanner(System.in);
		
		alumno1 = new Alumno();
		
		alumno1.nombre = "Pedro";
		alumno1.apellido1 = "Martín";
		alumno1.apellido2 = "Gómez";
		
		alumno1.mostrar();
		
		suma = alumno1.sumarNotas(10, 7);
		
//		mensaje = "NOMBRE: " + alumno1.nombre + "\n"
//				+ "PRIMER APELLIDO: " + alumno1.apellido1 + "\n"
//				+ "SEGUNDO APELLIDO: " + alumno1.apellido2 + "\n";
//		
//		System.out.println(mensaje);
		
		alumno2 = new Alumno("María", "Pérez", "Martínez");
		
		alumno2.mostrar();
		
//		mensaje = "NOMBRE: " + alumno2.nombre + "\n"
//				+ "PRIMER APELLIDO: " + alumno2.apellido1 + "\n"
//				+ "SEGUNDO APELLIDO: " + alumno2.apellido2 + "\n";
//		
//		System.out.println(mensaje);
		
		alumno3 = new Alumno();
		
		System.out.println("Introduzca NOMBRE:");
		alumno3.nombre = sc.nextLine();
		
		System.out.println("Introduzca PRIMER APELLIDO:");
		alumno3.apellido1 = sc.nextLine();
		
		System.out.println("Introduzca SEGUNDO APELLIDO:");
		alumno3.apellido2 = sc.nextLine();
		
		alumno3.mostrar();
		
		suma = alumno3.sumarNotas(5, 10);
		System.out.println(suma);
		
		
		sc.close();
		
		
		
		
		
		
	}
	 
}
