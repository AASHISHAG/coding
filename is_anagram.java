import java.util.Arrays;

public class is_anagram {
	
	public static void main(String[] args) {
	
	String s1 = "abc";
	String s2 = "cba";
	
	char[] c1 = s1.toCharArray();
	char[] c2 = s2.toCharArray();
	
	boolean result = false;
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	if (Arrays.equals(c1,c2)) result = true;
	
	System.out.println(result);
	}
}