package AytoMadrid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fichero {

	Scanner in;
	Dato dato;
	Contaminante conta;
	ArrayList<Dato> datos;
	ArrayList<String> horasDeMuestreo;
	String puntoDeMuestreo;
	String pdm;
	String contaminante;
	String fecha;

	public Fichero() {
		in = new Scanner(System.in);
	}

	public void leerFichero() {
		try {
			FileReader fr = new FileReader("./horario.csv");
			BufferedReader br = new BufferedReader(fr);
			String lineaRuta = br.readLine();
			datos = new ArrayList<Dato>();
			horasDeMuestreo = new ArrayList<String>();
			conta = new Contaminante();
			while (lineaRuta != null) {
				String horarioAire[] = lineaRuta.split(";");
				puntoDeMuestreo = horarioAire[4].substring(0, 8);
				contaminante = horarioAire[3];
				fecha = horarioAire[7] + "/" + horarioAire[6] + "/" + horarioAire[5];
				for (int i = 8; i < horarioAire.length; i += 2) {
					horasDeMuestreo.add(horarioAire[i]);
				}
				lineaRuta = br.readLine();
				dato = new Dato(contaminante, puntoDeMuestreo, fecha, horasDeMuestreo);

				datos.add(dato);
				System.out.println(dato.toString());
				horasDeMuestreo.clear();

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
