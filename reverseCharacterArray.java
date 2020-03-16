
public class reverseCharacterArray {

	char[] reverse(char[] original) {
		
		return original;
	}
	
	public static void main(String[] args) {
		
		char[] original = {'h','e','l','l','o'};
		
		
		// method-1
		char tmp;
		int left = 0;
		int right = original.length - 1;
		
		while( left<right ) {
			tmp = original[left];
			original[left] = original[right];
			original[right] = tmp;
			left ++;
			right --;
		}
		
		System.out.println("Reversed String: " + new String(original));
		
		// method-2
		
		
		
	}

}
