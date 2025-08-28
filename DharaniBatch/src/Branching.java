import java.util.Scanner;

public class Branching {

	void get1()
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Its is Even");
		}
		else
		{
			System.out.println("Its is Odd");
		}
	}
	public static void main(String[] args) {
		
		Branching f1=new Branching();
		f1.get1();

	}

}
