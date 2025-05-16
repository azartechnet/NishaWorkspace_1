import java.util.Scanner;

public class InputConcepts {

	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid and empname");
		empid=sc.nextInt();
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
	public static void main(String[] args) {
		
		InputConcepts f1=new InputConcepts();
		f1.input();
		f1.display();

	}

}
