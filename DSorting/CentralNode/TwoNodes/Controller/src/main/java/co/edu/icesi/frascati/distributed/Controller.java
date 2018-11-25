package co.edu.icesi.frascati.distributed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;

import org.osoa.sca.annotations.Reference;

public class Controller implements IDistSort{
	@Reference(name="IMergeSort1")
	private IMergeSort mergeSort1;
	@Reference(name="IMergeSort2")
	private IMergeSort mergeSort2;
	@Reference(name="IMergeSort3")
	private IMergeSort mergeSort3;
	@Reference(name="IMergeSort4")
	private IMergeSort mergeSort4;
	
	
	@Reference(name="IMerge")
	private IMerge merge;
	
	private String[] arr1;
	private String[] arr2;
	private String[] arr3;
	private String[] arr4;
	
		
	private CyclicBarrier cyclicBarrier;
	
	public String[] mergeSort (String[] cadena) {

		// TODO Auto-generated method stub
		cyclicBarrier = new CyclicBarrier(3);
		System.out.println("Controller comienza su proceso para el arreglo de tamanio: " + cadena.length);		
		
		int tamSub1= cadena.length/4;
		int tamSub2= (cadena.length/4)*2;
		int tamSub3= (cadena.length/4)*3;
		int tamSub4=(cadena.length/4)*4;
		
		
		//particion de arreglo original para cada partialMergeSort
		arr1 = Arrays.copyOfRange(cadena,0,tamSub1-1);
		arr2= Arrays.copyOfRange(cadena,tamSub1,tamSub2-1);

		arr3 = Arrays.copyOfRange(cadena,tamSub2,tamSub3-1);
		arr4= Arrays.copyOfRange(cadena,tamSub3,tamSub4-1);
		
		
		//definicion de los hilos
		Thread t1 = new Thread() {
            public void run() {
            	arr1= mergeSort1.partialMergeSort(arr1, 0, arr1.length-1);
                System.out.println("mergesort1 ejecutandose");
                try {                	
                	cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
		};
		
		
		Thread t2 = new Thread() {
            public void run() {
             	arr2= mergeSort2.partialMergeSort(arr2, 0, arr2.length-1);
             	 System.out.println("mergesort2 ejecutandose");
                try {
                	cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
		};
		Thread t3 = new Thread() {
            public void run() {
            	
             	arr3= mergeSort3.partialMergeSort(arr3, 0, arr3.length-1);
             	 System.out.println("mergesort3 ejecutandose");
                 try {
                	 cyclicBarrier.await();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
		};
		Thread t4 = new Thread() {
            public void run() {
             	arr4= mergeSort4.partialMergeSort(arr4, 0, arr4.length-1);
            	 System.out.println("mergesort4 ejecutandose");
                 try {
                	 cyclicBarrier.await();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
		};
		

		//comienzan los hilos
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		try {
			cyclicBarrier.await();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}		
        System.out.println("Todos los nodos ya ordenaron");
        
        //ahora los merge
		String[] cadena1= merge.merge(arr1,arr2);
		String[] cadena2= merge.merge(cadena1, arr3);
		String[] cadena3= merge.merge(cadena2, arr4);
	
		
		System.out.println("Controller Finished");
		
		return cadena3;
	}
}
