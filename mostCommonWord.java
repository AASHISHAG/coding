import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class mostCommonWord {
 
    @SuppressWarnings("unchecked")
	public static void main(String []args) {
 
    	HashMap<String, Integer> count = new HashMap<String, Integer>();
    	 	
    	count.put("A",1);
    	count.put("B",2);
    	count.put("C",3);
    	count.put("D",4);
    	String s = "Hello";
    	System.out.println(s.contains("ll"));;
    	
    	Object[] a = count.entrySet().toArray();
    	Arrays.sort(a, new Comparator() {
    	    public int compare(Object o1, Object o2) {
    	        return ((Map.Entry<String, Integer>) o2).getValue()
    	                   .compareTo(((Map.Entry<String, Integer>) o1).getValue());
    	    }
    	});
    	int i =0;
    	for (Object e : a) {
    		i++;
    	    System.out.println(((Map.Entry<String, Integer>) e).getKey());
    	    if(i>=2)
    	    	break;
    }
 
}}