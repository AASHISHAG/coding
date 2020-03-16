import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class hash_map {

	public static void main(String[] args) {
		
		String[] magazine = {"give", "me", "one", "grand", "today", "night"};
		String[] note = {"give", "one", "grand", "today"};
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.containsKey("");
		
		Map<String, Integer> magazineMap = new HashMap<String, Integer>();
        String match = "Yes";
        
        for(int i=0; i<magazine.length; i++){
        	if(!magazineMap.containsValue(magazine[i])) {
        		magazineMap.put(magazine[i],1);
        		}
        	else{
        		magazineMap.put(magazine[i],magazineMap.get(magazine[i])+1);
        		}
            }
        
        System.out.println(Arrays.asList(magazineMap));
    	
        for(int i=0; i<note.length; i++){
        	
        	if (magazineMap.containsKey(note[i])){
        		if(magazineMap.get(note[i]) == 1) {
        			magazineMap.remove(note[i]);
        		}
        		else{	
        			magazineMap.put(note[i], magazineMap.get(note[i])-1);
        		}
        	}
            else{
            	match = "No";
            	break;
                }                            
            }
        
        System.out.println(magazineMap);
        System.out.println(match);
    }

}


