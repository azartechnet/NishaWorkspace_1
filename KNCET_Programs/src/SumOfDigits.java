
public class SumOfDigits {

	public static void main(String[] args) {
		int n=123,remainder,sum=0;
		while (n != 0)
		   {
		      remainder = n % 10;
		      sum       = sum + remainder;
		      n         = n /10;
		   }
		System.out.println("Sum of the digits::"+sum);

	}

}
