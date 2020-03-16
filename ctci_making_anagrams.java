import java.util.Map;
import java.util.HashMap;

public class ctci_making_anagrams {
	
	public static HashMap<Character, Integer> stringToHashMap(String s){
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c:s.toCharArray()){
            if(!map.containsKey(c)){
                    map.put(c,1);
            }else{
               map.put(c, map.get(c)+1) ;
            }
		}
		return map;	
	}
	
	public static int countRemaining (HashMap<Character, Integer> map, int delete) {
		
		for (char key : map.keySet()) {
			if(map.get(key)>0)
				delete = delete + map.get(key);
        }
		return delete;
	}

	public static void main(String[] args) {

		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		
		HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapB = new HashMap<Character, Integer>();
        int delete = 0;
        
        mapA = stringToHashMap(a);
        mapB = stringToHashMap(b);
        
        for (char key : mapA.keySet()) {
             if(mapB.containsKey(key)){

            	 int valueA = mapA.get(key);
            	 int valueB = mapB.get(key);
            	 
            	 mapA.put(key, valueA-valueB);
                 mapB.put(key, valueB-valueA);
             }                    
        }

        delete = countRemaining(mapA, delete);
        delete = countRemaining(mapB, delete);

        System.out.println(delete);

	}
	


}
