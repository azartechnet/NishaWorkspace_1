import java.util.Scanner;

public class RuntimeInputP1 {

	int empid,salary;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid and salary is::");
		empid=sc.nextInt();
		salary=sc.nextInt();
		System.out.println("Enter the empname is::");
		empname=sc.next();
	}
	void display()
	{
		System.out.println("your value is::"+empid+"\t"+salary+"\t"+empname);
	}
	public static void main(String[] args) {
		
		RuntimeInputP1 f1=new RuntimeInputP1();
		f1.input();
		f1.display();

	}

}
