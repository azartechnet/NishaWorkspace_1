
public class ReverseNumber {

	public static void main(String[] args) {
		
		int reverse=0,n=123; 
		while (n != 0)
		   {
		      reverse = reverse * 10;
		      reverse = reverse + n%10;
		      n       = n/10;
		   }
		System.out.println("ReverseValue is::"+reverse);

	}

}
