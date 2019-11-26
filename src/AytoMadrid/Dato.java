package AytoMadrid;

import java.util.ArrayList;

public class Dato {
	String pdm, fecha, contaminante;
	ArrayList<String> horas;

	public Dato(String contaminante, String pdm, String fecha, ArrayList<String> horas) {
		this.pdm = pdm;
		this.fecha = fecha;
		this.contaminante = contaminante;
		this.horas = horas;
	}
	
	

	public String getPdm() {
		return pdm;
	}



	public void setPdm(String pdm) {
		this.pdm = pdm;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getContaminante() {
		return contaminante;
	}



	public void setContaminante(String contaminante) {
		this.contaminante = contaminante;
	}



	public ArrayList<String> getHoras() {
		return horas;
	}



	public void setHoras(ArrayList<String> horas) {
		this.horas = horas;
	}



	@Override
	public String toString() {
		return "Dato: contaminante=" + contaminante + ", pdm=" + pdm + ", fecha=" + fecha + ", horas=" + horas;
	}
}
