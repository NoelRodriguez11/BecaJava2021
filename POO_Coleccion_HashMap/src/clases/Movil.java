package clases;

public class Movil {

	//Constructores
	//==============
	public Movil(int memoria, String marca, int tamanoPantalla) {
		super();
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
	}
	
	//Campos
	//==============
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	
	//Métodos
	//===========
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}
	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}
	
	@Override
	public String toString() {
		String texto;
		
		texto = "MEMORIA: " + memoria + "\n"
			  + "MARCA: " + marca + "\n"
			  + "PANTALLA: " + tamanoPantalla + "\n";
		
		return texto;
	}
	
	public void aumentarMemoria() {
		this.memoria++;
	}
	
	
	
}
