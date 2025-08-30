import java.util.Scanner;

public class ArrayP1 {

	String empname[]=new String[2];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the empname is::");
			empname[i]=sc.next();
		}
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			System.out.println("Your value is::"+empname[i]);
		}
	}
	public static void main(String[] args) {
		

		ArrayP1 p1=new ArrayP1();
		p1.input();
		p1.display();
		
	}

}
