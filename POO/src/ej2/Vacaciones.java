package ej2;

public class Vacaciones {
	
	private int dias;
	protected String destino;
	private boolean playa;
	
	public Vacaciones(int dias, String destino, boolean playa) {
		this.dias = dias;
		this.destino = destino;
		this.playa = playa;
	}

	public Vacaciones() {
		
	}
	
	public void mostrar() {
		String texto;
		
		texto = "DIAS: " + this.dias + "\n"
			  + "DESTINO: " + this.destino + "\n"
			  + "PLAYA: " + ((this.playa == true)?"Sí":"No");
		
		System.out.println(texto);
			  
	}
	
	
	
	
	

}
