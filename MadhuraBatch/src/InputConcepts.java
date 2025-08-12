import java.util.Scanner;

public class InputConcepts {

	
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid is::");
		empid=sc.nextInt();
		System.out.println("Enter the empname is::");
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your data is::"+empid+""+empname);
	}
	
	public static void main(String[] args) {
		
		InputConcepts s1=new InputConcepts();
		s1.input();
		s1.display();

	}

}
