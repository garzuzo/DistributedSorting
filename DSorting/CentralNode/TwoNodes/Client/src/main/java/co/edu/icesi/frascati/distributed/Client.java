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

		arrTen = ag.arrays(12000000);
		arrTw = ag.arrays(24000000);
		arrTh = ag.arrays(36000000);
		arrFo = ag.arrays(48000000);
		arrFi = ag.arrays(60000000);

	}

	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//ag=new ArraysGenerator();
		//generateArrays();
		
	}

}
