import java.util.Scanner;

public class NestedIfelse {

	int age,salary,bns;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the age is:::");
		age=sc.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			salary=sc.nextInt();
			if(salary>=20000)
			{
				bns=salary+500;
				System.out.println("Your bns is::"+bns);
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your bns is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low");
		}
	}
	public static void main(String[] args) {
		
		NestedIfelse f1=new NestedIfelse();
		f1.get1();

	}

}
