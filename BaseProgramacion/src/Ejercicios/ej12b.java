package Ejercicios;

public class ej12b {
	public static void main(String[] args) {
		/*
		   12. Programa que muestra los números primos existentes entre el 1 y el 100. NOTA: Un
		   número es primo si tiene dos únicos divisores que son el 1 y él mismo.
		 */
		
		boolean primo;
		int resto;	
		
		for(int numero = 1; numero<=100; numero++) {
			
			primo = true;
			
			if(numero < 2) {
				primo = false;
			}
			
		for(int candidatoDivisor = 2; candidatoDivisor < numero && primo==true; candidatoDivisor++) {
			
			resto = numero%candidatoDivisor;
			
			if(resto == 0) primo = false;
			
		}
			
			if (primo == true) {
				System.out.println(numero);
					}
				}
		}
	}