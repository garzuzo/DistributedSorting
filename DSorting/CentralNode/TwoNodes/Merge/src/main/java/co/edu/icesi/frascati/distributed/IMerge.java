package co.edu.icesi.frascati.distributed;

import org.osoa.sca.annotations.Service;

@Service
public interface IMerge {
	public String[] merge(String[] arr1, String[] arr2);
}
