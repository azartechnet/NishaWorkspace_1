import java.util.Scanner;

public class Nesedifelse {

	public static void main(String[] args) {
	
		int age,sal,bns;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("Your value is::"+bns);
			}
			else
			{
				bns=sal+1000;
				System.out.println("your value is::"+bns);
			}
		}
		else
		{
			System.out.println("Age is low");
		}

	}

}
