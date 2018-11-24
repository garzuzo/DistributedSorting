package co.edu.icesi.frascati.distributed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArraysGenerator {

	public static void main(String args[]) {
		arrays(12000000);
		arrays(24000000);
		arrays(36000000);
		arrays(48000000);
		arrays(60000000);

	}

	public static String[] arrays(int n) {

		System.out.println("Call the service...");
		// se lee el archivo y se pasa el string

		writer(n);
		File file = new File("./src/main/resources/" + n + ".txt");
		String[] arr = new String[n];
		if (file.exists()) {
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);

				for (int i = 0; i < n; i++) {
					arr[i] = br.readLine();

				}
			} catch (Exception e) {
				System.out.println("No se completo el procedimiento.");
				e.printStackTrace();

			}

		}
		System.out.println("created!");
		return arr;
	}

	public static void writer(int n) {

		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter("./src/main/resources/" + n + ".txt"));

			for (int i = 0; i < n; i++) {
				// rango 1-10
				// int r1=(int) (Math.random()*30)+1;

				for (int r1 = 0; r1 < 10; r1++) {
					// rango de letras a-z
					char cAct = (char) ((int) (Math.random() * (122 - 97)) + 97);
					out.write(cAct + "");

				}

				if (i + 1 != n)
					out.write("\n");

			}
			out.close();

		} catch (IOException e) {
			System.out.println("No se crearon las palabras");
		}
	}
}
