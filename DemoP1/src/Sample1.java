import java.util.Scanner;

class Employee
{
	int empid,salary;
	String empname;
	Scanner sc=new Scanner(System.in);
	void addEmployee()
	{
		System.out.println("Enter the empid and Salary is::");
		empid=sc.nextInt();
		salary=sc.nextInt();
		System.out.println("Enter the empname is::");
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your empid and empname is::"+empid+""+empname+""+salary);
	}
}
public class Sample1 {

	public static void main(String[] args) {
		
		Employee f1=new Employee();
		f1.addEmployee();
		f1.display();

	}

}
