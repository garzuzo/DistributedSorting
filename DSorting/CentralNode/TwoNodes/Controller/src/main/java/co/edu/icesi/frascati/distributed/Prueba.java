package co.edu.icesi.frascati.distributed;

public class Prueba {

	public static void main(String[] args) {
		
		int[] arr= new int[12];
  
        /* Create temp arrays */
        int L[] =  {3,5,7,9,11,13}; 
        int R[] = {2,4,6,8,10,12}; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = 0; 
        while (i < L.length && j < R.length) 
        { 
            if (L[i] <= R[j]) 
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

	}
	
	

}
