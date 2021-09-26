package clases;

public class Movil {

	//Constructores
	//==============
	public Movil(int memoria, String marca, int tamanoPantalla, int imei ) {
		super();
		this.memoria = memoria;
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
		this.imei = imei;
	}
	
	//Campos
	//==============
	private int memoria;
	private String marca;
	private int tamanoPantalla;
	private int imei;
	
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
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	
	@Override
	public String toString() {
		String texto;
		
		texto = "MEMORIA: " + memoria + "\n"
			  + "MARCA: " + marca + "\n"
			  + "PANTALLA: " + tamanoPantalla + "\n";
		
		return texto;
	}
	
	@Override
	public boolean equals(Object objetoComparacion) {
		Movil movilComparacion = (Movil) objetoComparacion;
		boolean iguales = this.tamanoPantalla == movilComparacion.tamanoPantalla;
		
		
		return iguales;
	}
	
	public void aumentarMemoria() {
		this.memoria++;
	}
	
	
	
}
