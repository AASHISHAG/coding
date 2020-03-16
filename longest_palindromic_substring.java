
public class longest_palindromic_substring {

	public static void main(String[] args) {

		String s = "babad";
		String sub1 = "xx", sub, rev;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (i + j < s.length()) {
					sub = s.substring(i - j, i + j);
					rev = reverse(s);
					System.out.println(sub);
					System.out.println(rev);
					if (sub.equals(rev))
						sub1 = sub;
				}
			}
		}
		// System.out.println(reverse("aashish"));
	}

	public static String reverse(String s) {
		char[] in = s.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}

}
