import java.util.Scanner;

public class BranchingP1 {

	int a,age,bns,sal;
	Scanner sc=new Scanner(System.in);
	
	void get1()
	{
		System.out.println("Enter the a value is::");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Its is Even");
		}
		else
		{
			System.out.println("Its is Odd");
		}
	}
	void get2()
	{
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>60)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=sal+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Age is low");
		}
	}
	void get3()
	{
		int marks=75;
		if(marks>=90)
		{
			System.out.println("Grade:A+");
		}
		else if(marks>=80)
		{
			System.out.println("Grade:A");
		}
		else if(marks>=70)
		{
			System.out.println("Grade:B");
		}
		else if(marks>=60)
		{
			System.out.println("Grade:C");
		}
		else
		{
			System.out.println("Grade:D");
		}
	}
	void get4()
	{
		int exp=1;
		switch(exp)
		{
		case 1:
			System.out.println("Case-1");
			System.out.println("Enter the a value is::");
			a=sc.nextInt();
			if(a==1001)
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not Equal");
			}
			break;
		case 2:
			System.out.println("Case-2");
			break;
		case 3:
			System.out.println("Case-3");
			break;
		default:
			System.out.println("Default case");
			break;
		}
	}
	public static void main(String[] args) {
		
		BranchingP1 f1=new BranchingP1();
//		f1.get1();
		//f1.get2();
		//f1.get3();
		f1.get4();

	}

}
