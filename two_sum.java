import java.util.List;
import java.util.ArrayList;

public class two_sum {
	
	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int target = 13;
		
		List<Integer> numsList = new ArrayList<>(nums.length);
        
        for(int i:nums){
        	numsList.add(i);
        }
        
        System.out.println(numsList);
        
        int tmp = 0;
        int first = 0;
        int second = 0;
        
        for(int i=0; i<nums.length; i++){
            tmp = target - numsList.get(i);
            if (numsList.contains(tmp)){
                first = i;
                second = numsList.indexOf(tmp);
            }
        }
        
        System.out.println(first);
        System.out.println(second);
	}
}
