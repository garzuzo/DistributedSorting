package co.edu.icesi.frascati.distributed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CyclicBarrier;

import org.osoa.sca.annotations.Reference;

public class Controller implements IDistSort {
	@Reference(name = "IMergeSort1")
	private IMergeSort mergeSort1;


	private String[] arr1;

	public String[] mergeSort(String[] cadena) {

		System.out.println("Controller comienza su proceso para el arreglo de tamanio: " + cadena.length);
		arr1 = mergeSort1.partialMergeSort(cadena, 0, cadena.length-1);

		System.out.println("Controller Finished");

		return arr1;
	}
}
