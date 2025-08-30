import java.util.Scanner;

public class ArrayTwoP1 {

	int productid[][]=new int[5][5];
	int i,j,n,m;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array value is::");
				productid[i][j]=sc.nextInt();
			}
		}
	}
	void display()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Your value is::"+productid[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		
		ArrayTwoP1 g1=new ArrayTwoP1();
		g1.get1();
		g1.display();

	}

}
