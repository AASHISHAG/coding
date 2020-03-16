import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class rough_work {

	public static void main(String[] args) {
		
		String s = "aba";
        long count = 0;
        for(int i=0; i<10; i=i+s.length()){
                for (char c:s.toCharArray()){
                        if(c == 'a') count++;
                }
                long n = 0;
                long x = n%10;

        }        
        System.out.println(count);
	}
}
