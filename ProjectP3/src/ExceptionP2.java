import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionP2 {

	void get1()
	{
		try
		{
			int empid[]=new int[5];
			int i,n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the n value is::");
			n=sc.nextInt();
			for(i=0;i<=n;i++)
			{
				System.out.println("Enter the array value::");
				empid[i]=sc.nextInt();
			}
			for(i=0;i<=n;i++)
			{
				System.out.println("I value is::"+empid[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException t)
		{
			System.out.println("Check the Array Size");
		}
		catch(InputMismatchException t)
		{
			System.out.println("Check the Input formate");
		}
		finally
		{
			System.out.println("This is finally keyword");
		}
	}
	public static void main(String[] args) {
		
		ExceptionP2 f1=new ExceptionP2();
		f1.get1();

	}

}
