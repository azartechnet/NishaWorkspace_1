import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
	
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even value"+i);
			}
			else
			{
				System.out.println("Odd value"+i);
			}
		}
	}

}
