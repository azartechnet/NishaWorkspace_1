import java.util.Scanner;

public class Sample3 {

	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid and empname::");
		empid=sc.nextInt();
		empname=sc.next();
		
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
	public static void main(String[] args) {
		
		Sample3 obj=new Sample3();
		obj.input();
		obj.display();

	}

}
