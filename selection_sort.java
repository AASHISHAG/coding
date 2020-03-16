// smallest element comes in the front after every pass

import java.util.Arrays;

public class selection_sort {
	
	public static void main (String[] args) {
		
		int[] original_array = {2,9,4,6,11,1};
		int min, temp, pos=0;
		for(int i=0; i<original_array.length; i++) {
			
			for(int j=i; j<original_array.length; j++) {
				
				min = original_array[i];
				if(min>=original_array[j]) {
					min = original_array[j];
					pos = j;
				}
				
				temp = original_array[i];
				original_array[i] = original_array[pos];
				original_array[pos] = temp;
			}
		}
		System.out.println(Arrays.toString(original_array));
	}
}
