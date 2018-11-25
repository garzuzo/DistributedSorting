package co.edu.icesi.frascati.distributed;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import org.osoa.sca.annotations.Reference;

public class Client implements Runnable {

	@Reference(name = "IDistSort")
	private IDistSort sort;

	private ArraysGenerator ag;
	private String[] arrTen;
	private String[] arrTw;
	private String[] arrTh;
	private String[] arrFo;
	private String[] arrSi;

	int n1 = 2400000;
	int n2 = 3600000;
	int n3 = 4800000;
	int n4 = 6000000;
	int n5 = 7200000;

	private String path = "./src/main/resources/";

	public void generateArrays() {

		arrTen = ag.arrays(n1);
		arrTw = ag.arrays(n2);
		arrTh = ag.arrays(n3);
		arrFo = ag.arrays(n4);
		arrSi = ag.arrays(n5);

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
			System.out.println("arreglo 1200000:" + totalTime);

			// se escribe en otro archivo el tiempo
			FileWriter fw2 = new FileWriter(new File(path + "Tiempo_" + n1 + ".txt"));
			BufferedWriter bw2 = new BufferedWriter(fw2);
			PrintWriter wr2 = new PrintWriter(bw2);

			wr2.write(totalTime + "");

			// arreglo 2
			start = System.currentTimeMillis();

			arrTw = sort.mergeSort(arrTw);
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("arreglo 2400000:" + totalTime);

			// se escribe en otro archivo el tiempo
			fw2 = new FileWriter(new File(path + "Tiempo_" + n2 + ".txt"));
			bw2 = new BufferedWriter(fw2);
			wr2 = new PrintWriter(bw2);

			wr2.write(totalTime + "");

			// arreglo 3
			start = System.currentTimeMillis();

			arrTh = sort.mergeSort(arrTh);
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("arreglo 3600000:" + totalTime);

			// se escribe en otro archivo el tiempo
			fw2 = new FileWriter(new File(path + "Tiempo_" + n3 + ".txt"));
			bw2 = new BufferedWriter(fw2);
			wr2 = new PrintWriter(bw2);

			wr2.write(totalTime + "");

			// arreglo 4
			start = System.currentTimeMillis();

			arrFo = sort.mergeSort(arrFo);
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("arreglo 4800000:" + totalTime);

			// se escribe en otro archivo el tiempo
			fw2 = new FileWriter(new File(path + "Tiempo_" + n4 + ".txt"));
			bw2 = new BufferedWriter(fw2);
			wr2 = new PrintWriter(bw2);

			wr2.write(totalTime + "");

			// arreglo 5
			start = System.currentTimeMillis();

			arrSi = sort.mergeSort(arrSi);
			end = System.currentTimeMillis();
			totalTime = end - start;
			System.out.println("arreglo 6000000:" + totalTime);

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
