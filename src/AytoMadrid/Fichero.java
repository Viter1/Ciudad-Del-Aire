package AytoMadrid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero {

	Scanner in;
	Dato dato;
	ArrayList<Dato> datos;
	ArrayList<String> horasDeMuestreo;
	String puntoDeMuestreo;
	String contaminante;
	String fecha;
	String horas;

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
			int counter = 0;
			while (lineaRuta != null) {
				String horarioAire[] = lineaRuta.split(";");
				counter = 8;
				puntoDeMuestreo = horarioAire[4].substring(0, 8);
				contaminante = horarioAire[3];
				fecha = horarioAire[7] + "/" + horarioAire[6] + "/" + horarioAire[5];

				if (horarioAire.length >= 8 && horarioAire.length % 2 == 0) {
					horasDeMuestreo.add(horarioAire[counter]);
				}

				dato = new Dato(contaminante, puntoDeMuestreo, fecha);
				datos.add(dato);
				counter++;
				lineaRuta = br.readLine();

			}
			for (Dato dato : datos) {
				System.out.println(dato);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
