import java.util.Scanner;

public class ArrayP1 {

	int empid[]=new int[20];
	int n,i;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the array value is::");
			empid[i]=sc.nextInt();
		}
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Your array value is::"+empid[i]);
			
		}
	}
	public static void main(String[] args) {
		
		
		ArrayP1 f1=new ArrayP1();
		f1.input();
		f1.display();
	}

}
