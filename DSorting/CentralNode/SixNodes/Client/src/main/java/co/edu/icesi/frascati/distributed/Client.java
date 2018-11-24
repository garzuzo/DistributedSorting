package co.edu.icesi.frascati.distributed;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.osoa.sca.annotations.Reference;

public class Client implements Runnable {

	@Reference(name = "sort")
	private IDistSort sort;

	private ArraysGenerator ag;
	private String[] arrTen;
	private String[] arrTw;
	private String[] arrTh;
	private String[] arrFo;
	private String[] arrSi;

	int n1 = 12000000;
	int n2 = 24000000;
	int n3 = 36000000;
	int n4 = 48000000;
	int n5 = 60000000;

	private String path = "./src/main/resources/";

	public void generateArrays() {

		arrTen = ag.arrays(12000000);
		arrTw = ag.arrays(24000000);
		arrTh = ag.arrays(36000000);
		arrFo = ag.arrays(48000000);
		arrSi = ag.arrays(60000000);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ag = new ArraysGenerator();
			generateArrays();

			// arreglo 1
			long start = System.currentTimeMillis();

			arrTen = sort.mergeSort(arrTen);
			long end = System.currentTimeMillis();
			long totalTime = end - start;
			System.out.println("arreglo 12000000:" + totalTime);

			// se escribe en otro archivo el tiempo
			FileWriter fw2 = new FileWriter(new File(path + "Tiempo_" + n1 + ".txt"));
			BufferedWriter bw2 = new BufferedWriter(fw2);
			PrintWriter wr2 = new PrintWriter(bw2);

			wr2.write(totalTime + "");

			// arreglo 2
			start = System.currentTimeMillis();

			arrTen = sort.mergeSort(arrTen);
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("arreglo 24000000:" + totalTime);

			// se escribe en otro archivo el tiempo
			fw2 = new FileWriter(new File(path + "Tiempo_" + n2 + ".txt"));
			bw2 = new BufferedWriter(fw2);
			wr2 = new PrintWriter(bw2);

			wr2.write(totalTime + "");

			// arreglo 3
			start = System.currentTimeMillis();

			arrTen = sort.mergeSort(arrTen);
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("arreglo 36000000:" + totalTime);

			// se escribe en otro archivo el tiempo
			fw2 = new FileWriter(new File(path + "Tiempo_" + n3 + ".txt"));
			bw2 = new BufferedWriter(fw2);
			wr2 = new PrintWriter(bw2);

			wr2.write(totalTime + "");

			// arreglo 4
			start = System.currentTimeMillis();

			arrTen = sort.mergeSort(arrTen);
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("arreglo 48000000:" + totalTime);

			// se escribe en otro archivo el tiempo
			fw2 = new FileWriter(new File(path + "Tiempo_" + n4 + ".txt"));
			bw2 = new BufferedWriter(fw2);
			wr2 = new PrintWriter(bw2);

			wr2.write(totalTime + "");

			// arreglo 5
			start = System.currentTimeMillis();

			arrTen = sort.mergeSort(arrTen);
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("arreglo 60000000:" + totalTime);

			// se escribe en otro archivo el tiempo
			fw2 = new FileWriter(new File(path + "Tiempo_" + n5 + ".txt"));
			bw2 = new BufferedWriter(fw2);
			wr2 = new PrintWriter(bw2);

			wr2.write(totalTime + "");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
