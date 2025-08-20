import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		
		int i,n;
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
			//System.out.println("I value is::"+i);
		}
		System.out.println("Fact value is::"+f);

	}

}
