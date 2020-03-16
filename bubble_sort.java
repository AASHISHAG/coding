// largest element goes in the end after every pass

import java.util.Arrays;

public class bubble_sort {
	
	public static void main(String[] args) {
		
		int[] original_array = {2,9,4,6,11,1};
		int temp;
		for(int i=0; i<original_array.length; i++) {
			
			for(int j=0; j<original_array.length-i-1; j++) {
				
				if(original_array[j]>=original_array[j+1]) {
					temp = original_array[j];
					original_array[j] = original_array[j+1];
					original_array[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(original_array));
	}
}
