package co.edu.icesi.frascati.distributed;

import org.osoa.sca.annotations.Service;

@Service
public interface IDistSort {

	public String[] mergeSort(String[] arr);
}
