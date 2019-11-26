package AytoMadrid;

import java.util.HashMap;
import java.util.Map;

public class Contaminante {
	
	

	public void punto_de_muestreo(Map<String, String> pdm) {
		pdm.put("28079035", "Pza. del Carmen");
		pdm.put("28079004", "Pza. Espa�a");
		pdm.put("28079039", "Barrio del Pilar");
		pdm.put("28079008", "Escuelas Aguirre");
		pdm.put("28079038", "Cuatro Caminos");
		pdm.put("28079011", "Av. Ram�n y Cajal");
		pdm.put("28079040", "Vallecas");
		pdm.put("28079016", "Arturo Soria");
		pdm.put("28079017", "Villaverde Alto");
		pdm.put("28079018", "C/ Farolillo");
		pdm.put("28079036", "Moratalaz ");
		pdm.put("28079027", "Barajas");
		pdm.put("28079047", "M�ndez �lvaro");
		pdm.put("28079048", "P�. Castellana");
		pdm.put("28079049", "Retiro");
		pdm.put("28079050", "Pza. Castilla");
		pdm.put("28079054", "Ensanche Vallecas");
		pdm.put("28079055", "Urb. Embajada (Barajas)");
		pdm.put("28079056", "Plaza El�ptica");
		pdm.put("28079057", "Sanchinarro");
		pdm.put("28079058", "El Pardo");
		pdm.put("28079059", "Parque Juan Carlos I");
		pdm.put("28079060", "Tres Olivos");
		
		
	}
	
	

	public void contaminant(Map<String, String> conta) {
		conta.put("01" , "Di�xido de Azufre");
		conta.put("06" , "Mon�xido de Carbono"); 
		conta.put("07" , "Mon�xido de Nitr�geno");
		conta.put("08" , "Di�xido de Nitr�geno");
		conta.put("09" , "Part�culas < 2.5 �m");
		conta.put("10" , "Part�culas < 10 �m");
		conta.put("12" , "�xidos de Nitr�geno");
		conta.put("14" , "Ozono");
		conta.put("20" , "Tolueno");
		conta.put("30" , "Benceno");
		conta.put("35" , "Etilbenceno");
		conta.put("37" , "Metaxileno");
		conta.put("38" , "Paraxileno");
		conta.put("39" , "Ortoxileno");
		conta.put("42" , "Hidrocarburos totales (hexano)");
		conta.put("43" , "Metano");
		conta.put("44" , "Hidrocarburos no met�nicos (hexano)");
	}

}
