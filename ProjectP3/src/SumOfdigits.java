import java.util.Scanner;

public class SumOfdigits {

	public static void main(String args[])
	{
		int n,sum=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		while (n != 0)
		   {
		      r = n % 10;
		      sum       = sum + r;
		      n         = n /10;
		   }
		System.out.println("Sumofdigits is::"+sum);
	}
}
