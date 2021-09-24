package clases;

public class Curso {
	
	
	//Constructores
	//===============
	public Curso() {
		setDenominacion("");
		setHoras(0);
		setAcademia("");
	}
	
	public Curso(String denominacion, int horas, String academia) {
		this.denominacion = denominacion;
		this.horas = horas;
		this.academia = academia;
	}


	//Campos (No hace falta inicializar)
	private String denominacion = "";
	private int horas = 0;
	private String academia = "";
	
	//Métodos
	
	//GETTERS
	public String getDenominacion() {
		
		String respuesta;
		
		if (this.denominacion.equals("") == true) {
			respuesta = "Sin denominación";
		}
		
		else {
			respuesta = this.denominacion.toUpperCase();
		}
		
		return respuesta;
	}
	
	public int getHoras() {
		return this.horas;
	}
	
	public String getAcademia() {
		return this.academia;
	}
	
	//SETTERS
	public void setDenominacion(String denominacion) {
			this.denominacion = denominacion;
		}
		
	public void setHoras(int horas) {
			if(horas < 0) {
				System.out.println("Valor incorrecto. Las horas no pueden ser negativas.");
			}
			else {
				this.horas = horas;
			}
		}
		
	public void setAcademia(String academia) {
			this.academia = academia;
		}
		
}
