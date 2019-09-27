package AytoMadrid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {
	Scanner in;
	ArrayList<String> datos;
	String puntoDeMuestreo;
	String contaminante;
	String horas;

	public Fichero() {
		in = new Scanner(System.in);
	}

	public void leerFichero() {
		try {
			FileReader fr = new FileReader("./horario.csv");
			BufferedReader br = new BufferedReader(fr);
			String lineaRuta = br.readLine();
			datos = new ArrayList<String>();
			while (lineaRuta != null) {
				String horarioAire[] = lineaRuta.split(";");
				puntoDeMuestreo = horarioAire[4].substring(0, 8);
				datos.add(puntoDeMuestreo);
				lineaRuta = br.readLine();
			}
			for (String string : datos) {
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
