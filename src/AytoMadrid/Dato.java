package AytoMadrid;

import java.util.ArrayList;

public class Dato {
	String pdm, fecha, contaminante;
	ArrayList<String> horas;



	public Dato(String contaminante, String pdm, String fecha) {
		this.pdm = pdm;
		this.fecha = fecha;
		this.contaminante = contaminante;
		this.horas = horas;
	}



	@Override
	public String toString() {
		return "Dato: contaminante=" + contaminante + ", pdm=" + pdm + ", fecha=" + fecha ;
	}








}
