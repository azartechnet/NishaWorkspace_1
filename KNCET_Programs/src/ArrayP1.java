import java.util.Scanner;

class Demo12
{
	int empid[]=new int[5];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n is::");
		n=sc.nextInt();
	}
	void logic()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			empid[i]=sc.nextInt();
		}
		for(i=0;i<=n;i++)
		{
			System.out.println("Your value is::"+empid[i]);
		}
	}
}
public class ArrayP1 {

	public static void main(String[] args) {
		
		
		Demo12 f1=new Demo12();
		f1.input();
		f1.logic();

	}

}
