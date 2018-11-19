package co.edu.icesi.frascati.distributed;

import org.osoa.sca.annotations.Reference;

public class Client implements Runnable {

	@Reference(name="sort")
	private IDistSort sort;
	
	private ArraysGenerator ag;
	private String[] arrTen;
	private String[] arrTw;
	private String[] arrTh;
	private String[] arrFo;
	private String[] arrFi;

	private String path="./src/main/resources/";
	
	public void generateArrays() {

		arrTen = ag.arrays(10000000);
		arrTw = ag.arrays(20000000);
		arrTh = ag.arrays(30000000);
		arrFo = ag.arrays(40000000);
		arrFi = ag.arrays(50000000);

	}

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//ag=new ArraysGenerator();
		//generateArrays();
		
	}

}
