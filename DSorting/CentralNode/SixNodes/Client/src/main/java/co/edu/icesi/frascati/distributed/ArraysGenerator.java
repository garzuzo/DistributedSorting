package co.edu.icesi.frascati.distributed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArraysGenerator {



	public static String[] arrays(int n) {

		System.out.println("Call the service...");
		// se lee el archivo y se pasa el string

		writer(n);
		File file = new File("./src/main/resources/" + n + ".txt");
		String[] arr = new String[n];
		
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
		System.out.println("created!");
		return arr;
	}

	public static void writer(int n) {

		BufferedWriter out;
		try {
			File file = new File("./src/main/resources/" + n + ".txt");
			if (!file.exists()) {
				out = new BufferedWriter(new FileWriter("./src/main/resources/" + n + ".txt"));

				for (int i = 0; i < n; i++) {
					// rango 1-10
					// int r1=(int) (Math.random()*30)+1;

					for (int r1 = 0; r1 < 5; r1++) {
						// rango de letras a-z
						char cAct = (char) ((int) (Math.random() * (122 - 97)) + 97);
						out.write(cAct + "");

					}

					if (i + 1 != n)
						out.write("\n");

				}
				out.close();
			} else {
				System.out.println("No se crearon las palabras, ya existe el archivo");
			}
		} catch (IOException e) {
			System.out.println("Hubo un error");
		}
	}
}
