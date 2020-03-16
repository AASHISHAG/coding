import java.util.Set;
import java.util.HashSet;

public class hash_set {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		String found = "NO";
        
		Set<Character> string = new HashSet<Character>();
		            
        for(char c:s1.toCharArray()) {
                    string.add(c);
            }

        for(char c:s2.toCharArray()) {
                    if(string.contains(c)){
                            found = "YES";
                            break;
                    }
        }
        
        // use retainAll
	}

}
