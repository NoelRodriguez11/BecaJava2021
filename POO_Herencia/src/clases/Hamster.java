package clases;

public class Hamster extends Mascota {
	
	//CONSTRUCTORES
	
	public Hamster() {
		super();
	}

	public Hamster(String colorPelo, String marcaPienso,
				   String nombre, int edad ) {
		
		super(nombre, edad);
		
		this.colorPelo = colorPelo;
		this.marcaPienso = marcaPienso;
	}
	
	//CAMPOS
	
	public String colorPelo;
	public String marcaPienso;
	
	//Metodos
	
	@Override
	public String toString() {
		String texto;
		
		texto = super.toString()
				+ "COLOR PELO: " + this.colorPelo + "\n"
				+ "MARCA PIENSO: " + this.marcaPienso + "\n";
		
		return texto;
	}
}
