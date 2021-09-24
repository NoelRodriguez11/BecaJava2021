package clases;

public class Mascota extends Object {

	//CONSTRUCTORES
	public Mascota() {
		
	}
	
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//CAMPOS
	private String nombre;
	private int edad;
	
	//SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//METODOS

	@Override
	public String toString() {
		String texto;
		
		texto = "NOMBRE: " + nombre + "\n"
			  + "EDAD " + edad + "\n";
		
		return texto;
	}
	
	
	
}
