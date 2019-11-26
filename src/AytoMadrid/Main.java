package AytoMadrid;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Contaminante contaminante = new Contaminante();
		Fichero fichero = new Fichero();
		Map punto_de_muestreo = new HashMap<Integer, String>();
		Map contaminantes = new HashMap<String, String>();

		contaminante.punto_de_muestreo(punto_de_muestreo);
		contaminante.contaminant(contaminantes);
		fichero.leerFichero();	
	}

}
