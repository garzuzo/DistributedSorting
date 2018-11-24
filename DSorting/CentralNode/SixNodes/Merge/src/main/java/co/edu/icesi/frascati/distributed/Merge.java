package co.edu.icesi.frascati.distributed;

public class Merge implements IMerge {

	public String[] merge(String[] arr1, String[] arr2) {
		
		String[] arr= new String[arr1.length+arr2.length];
		  
        /* Create temp arrays */
		String L[] =  arr1.clone(); 
        String R[] = arr2.clone(); 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = 0; 
        while (i < L.length && j < R.length) 
        { 
            if (L[i].compareTo(R[j])<=0) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < L.length) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < R.length) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
		
		return arr;
	}

}
