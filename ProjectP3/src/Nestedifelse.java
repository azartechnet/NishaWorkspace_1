import java.util.Scanner;

public class Nestedifelse {

	int age,bns,salary;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salary is::");
			salary=sc.nextInt();
			if(salary>=20000)
			{
				bns=salary+5000;
				System.out.println("Your salary is::"+bns);
				
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Age is low");
		}
	}
	
	public static void main(String[] args) {
		
		Nestedifelse f1=new Nestedifelse();
		f1.get1();

	}

}
