import java.util.Scanner;

public class Sample3 {

	int empid,salary;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid and Salary::");
		empid=sc.nextInt();
		salary=sc.nextInt();
		System.out.println("Enter the empname is::");
		empname=sc.next();
		
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+salary+""+empname);
	}
	public static void main(String[] args) {
	
		Sample3 f1=new Sample3();
		f1.input();
		f1.display();

	}

}
