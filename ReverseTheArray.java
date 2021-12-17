package Arrays;

import java.util.Arrays;

public class ReverseTheArray {
	public static void main(String[] args) {
		 int[] arr = {25, 14, 56, 15, 36, 56, 77, 1, 29, 49};

		    int temp;
		    
		    for (int i = 0; i < arr.length/2; i++) {
				
						  temp = arr[i];  
		                    arr[i] = arr[arr.length -i-1];  
		                    arr[arr.length-i-1] = temp; 
					
				}
			
		    System.out.println(Arrays.toString(arr));
		    
		    
		 }
		 }
