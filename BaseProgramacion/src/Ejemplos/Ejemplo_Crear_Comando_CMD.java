package Ejemplos;

public class Ejemplo_Crear_Comando_CMD {

	public static void main(String[] args) {
		
//		String nombre;
//		
//		for (int i=0; i<args.length; i++) {
//			nombre = args[i];
//			System.out.println(nombre);
//		}
		
		String nombreCompleto;
		String nombreCompletoEnLinea;
		
		if(args.length!=3) {
			System.out.println("Comando incorrecto, debe recibir tres parámetros");
		}
		else {
			nombreCompleto = "NOMBRE: " + args[0] + "\n"
					       + "PRIMER APELLIDO: " + args[1] + "\n"
					       + "SEGUNDO APELLIDO; " + args[2] + "\n";
			System.out.println(nombreCompleto);
			
			nombreCompletoEnLinea = args[0] + " " + args[1] + " " + args[2];
			System.out.println(nombreCompletoEnLinea);
		}
	}

}
