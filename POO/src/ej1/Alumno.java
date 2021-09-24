package ej1;

public class Alumno {
	
	//Campos ó propiedades
	public String nombre;
	public String apellido1;
	public String apellido2;
	
	//Constructor
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	
	//Métodos
	//-------
	public void mostrar() {
		String mensaje;
		
		mensaje = "NOMBRE: " + this.nombre + "\n"
				+ "PRIMER APELLIDO: " + this.apellido1 + "\n"
				+ "SEGUNDO APELLIDO: " + this.apellido2 + "\n";
		
		System.out.println(mensaje);
	}
	
	public int sumarNotas(int nota1, int nota2) {
		int resultado;
		
		resultado = nota1 + nota2;
		
		return resultado;
	}
	
	public float sumarNotas(float nota1, float nota2) {
		float resultado;
		
		resultado = nota1 + nota2;
		
		return resultado;
	}

}
