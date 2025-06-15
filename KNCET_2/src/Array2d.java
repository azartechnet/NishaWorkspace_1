import java.util.Scanner;

public class Array2d {

	int empid[][]=new int[2][2];
	int n,m,i,j;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("Enter the array value is::");
				empid[i][j]=sc.nextInt();
				System.out.println("Your array value is::"+empid[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		 
		Array2d f1=new Array2d();
		f1.get1();
		f1.get2();

	}

}
