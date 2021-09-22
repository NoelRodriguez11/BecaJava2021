package Ejercicios;

import java.util.Calendar;
import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		
		/*11. Programa que lee nombre y año de nacimiento de una serie de alumnos hasta introducir
		como nombre de alumno "fin". En ese momento mostrará la edad media de los alumnos y
		el nombre del alumno menor. NOTA: Al introducir como nombre "fin", no nos ha de pedir el
		año de nacimiento*/
		
		String nombre;
		String nombreMenor ="";
		int ano_nacimiento;
		int ano_actual = Calendar.getInstance().get(Calendar.YEAR);
		int edad;
		int suma = 0; //acumulador
		int contador = 0;
		float media = 0;
		int menor = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		
		//Pedimos nombre y año de nacimiento
		
		do {
			
		System.out.println("Introduce el nombre del alumno");
		nombre = sc.nextLine();
		
		if (nombre.equals("fin")) {
			break;
		}
		
		System.out.println("Introduce el año del alumno");
		ano_nacimiento = Integer.valueOf(sc.nextLine());
		
		edad = ano_actual - ano_nacimiento;
		suma += edad;
		
		if(edad < menor) {
			menor = edad;
			nombreMenor = nombre;
		}
		contador++;
		
		media = (float)suma / (float)contador;
		
		}while(!nombre.equals("fin"));
		
		sc.close();
		
		System.out.println("El nombre del alumno menor es " +nombreMenor+ "y su edad es "+menor );
		System.out.println("La edad media de los alumnos es "+media);
		


	}

}
