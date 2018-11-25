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
	@Reference(name="IMergeSort5")
	private IMergeSort mergeSort5;
	@Reference(name="IMergeSort6")
	private IMergeSort mergeSort6;
	@Reference(name="IMergeSort7")
	private IMergeSort mergeSort7;
	@Reference(name="IMergeSort8")
	private IMergeSort mergeSort8;
	@Reference(name="IMergeSort9")
	private IMergeSort mergeSort9;
	@Reference(name="IMergeSort10")
	private IMergeSort mergeSort10;
	@Reference(name="IMergeSort11")
	private IMergeSort mergeSort11;
	@Reference(name="IMergeSort12")
	private IMergeSort mergeSort12;
	
	@Reference(name="IMerge")
	private IMerge merge;
	
	private String[] arr1;
	private String[] arr2;
	private String[] arr3;
	private String[] arr4;
	private String[] arr5;
	private String[] arr6;
	private String[] arr7;
	private String[] arr8;
	private String[] arr9;
	private String[] arr10;
	private String[] arr11;
	private String[] arr12;
		
	private CyclicBarrier cyclicBarrier;
	
	public String[] mergeSort (String[] cadena) {

		// TODO Auto-generated method stub
		cyclicBarrier = new CyclicBarrier(11);
		System.out.println("Controller comienza su proceso para el arreglo de tamanio: " + cadena.length);		
		
		int tamSub1= cadena.length/12;
		int tamSub2= (cadena.length/12)*2;
		int tamSub3= (cadena.length/12)*3;
		int tamSub4=(cadena.length/12)*4;
		int tamSub5= (cadena.length/12)*5;
		int tamSub6= (cadena.length/12)*6;
		int tamSub7= (cadena.length/12)*7;
		int tamSub8= (cadena.length/12)*8;
		int tamSub9= (cadena.length/12)*9;
		int tamSub10= (cadena.length/12)*10;
		int tamSub11= (cadena.length/12)*11;
		int tamSub12= (cadena.length/12)*12;
		
		//particion de arreglo original para cada partialMergeSort
		arr1 = Arrays.copyOfRange(cadena,0,tamSub1-1);
		arr2= Arrays.copyOfRange(cadena,tamSub1,tamSub2-1);

		arr3 = Arrays.copyOfRange(cadena,tamSub2,tamSub3-1);
		arr4= Arrays.copyOfRange(cadena,tamSub3,tamSub4-1);
		
		arr5 = Arrays.copyOfRange(cadena,tamSub4,tamSub5-1);
		arr6= Arrays.copyOfRange(cadena,tamSub5,tamSub6-1);
		
		arr7 = Arrays.copyOfRange(cadena,tamSub6,tamSub7-1);
		arr8= Arrays.copyOfRange(cadena,tamSub7,tamSub8-1);
		
		arr9 = Arrays.copyOfRange(cadena,tamSub8,tamSub9-1);
		arr10= Arrays.copyOfRange(cadena,tamSub9,tamSub10-1);
		
		arr11 = Arrays.copyOfRange(cadena,tamSub10,tamSub11-1);
		arr12= Arrays.copyOfRange(cadena,tamSub11,tamSub12-1);

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
		Thread t5 = new Thread() {
            public void run() {
             	arr5= mergeSort5.partialMergeSort(arr5, 0, arr5.length-1);
            	 System.out.println("mergesort5 ejecutandose");
                 try {
                	 cyclicBarrier.await();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
		};
		Thread t6 = new Thread() {
            public void run() {
             	arr6= mergeSort6.partialMergeSort(arr6, 0, arr6.length-1);
            	 System.out.println("mergesort6 ejecutandose");
                 try {
                	 cyclicBarrier.await();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
		};
		Thread t7 = new Thread() {
            public void run() {
             	arr7= mergeSort7.partialMergeSort(arr7, 0, arr7.length-1);
            	 System.out.println("mergesort7 ejecutandose");
                 try {
                	 cyclicBarrier.await();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
		};
		Thread t8 = new Thread() {
            public void run() {
             	arr8= mergeSort8.partialMergeSort(arr8, 0, arr8.length-1);
            	 System.out.println("mergesort8 ejecutandose");
                 try {
                	 cyclicBarrier.await();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
		};
		
		Thread t9 = new Thread() {
            public void run() {
             	arr9= mergeSort9.partialMergeSort(arr9, 0, arr9.length-1);
            	 System.out.println("mergesort9 ejecutandose");
                 try {
                	 cyclicBarrier.await();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
		};
		
		Thread t10 = new Thread() {
            public void run() {
             	arr10= mergeSort10.partialMergeSort(arr10, 0, arr10.length-1);
            	 System.out.println("mergesort10 ejecutandose");
                 try {
                	 cyclicBarrier.await();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
		};
		
		Thread t11 = new Thread() {
            public void run() {
             	arr11= mergeSort11.partialMergeSort(arr11, 0, arr11.length-1);
            	 System.out.println("mergesort11 ejecutandose");
                 try {
                	 cyclicBarrier.await();
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
            }
		};
		
		Thread t12 = new Thread() {
            public void run() {
             	arr12= mergeSort12.partialMergeSort(arr12, 0, arr12.length-1);
            	 System.out.println("mergesort12 ejecutandose");
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
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		
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
		String[] cadena4= merge.merge(cadena3, arr5);
		String[] cadena5= merge.merge(cadena4, arr6);
		String[] cadena6= merge.merge(cadena5, arr7);
		String[] cadena7= merge.merge(cadena6, arr8);
		String[] cadena8= merge.merge(cadena7, arr9);
		String[] cadena9= merge.merge(cadena8, arr10);
		String[] cadena10= merge.merge(cadena9, arr11);
		String[] cadena11= merge.merge(cadena10, arr12);
		
		System.out.println("Controller Finished");
		
		return cadena11;
	}
}
