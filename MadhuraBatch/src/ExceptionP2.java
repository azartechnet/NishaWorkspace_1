import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionP2 {

	int empid[]=new int[2];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		try
		{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			empid[i]=sc.nextInt();
			System.out.println("Your array value is::"+empid[i]);
		}
		}
		catch(InputMismatchException t)
		{
			System.out.println("InputMismatch Exception");
		}
		catch(ArrayIndexOutOfBoundsException y)
		{
			System.out.println("ArrayIndexOutBounds Exception");
		}
	}
	public static void main(String[] args) {
		
		ExceptionP2 f1=new ExceptionP2();
		f1.get1();

	}

}
