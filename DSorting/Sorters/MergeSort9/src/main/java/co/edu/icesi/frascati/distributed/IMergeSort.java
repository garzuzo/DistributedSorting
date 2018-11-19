package co.edu.icesi.frascati.distributed;
import org.osoa.sca.annotations.Service;

@Service
public interface IMergeSort {

	
	public String[] partialMergeSort(String[] arr, int l,int r);
}
