
public class palindrome {
	public static void main(String[] args) {
		int x = 121;
		int reverse=0, temp=0, number=x;
        while(number>0){
            temp = number%10;
            number = number/10;
            reverse = reverse*10 + temp;
        }
        System.out.println(x==reverse);
	}
}
