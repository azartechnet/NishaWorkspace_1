import java.util.Scanner;

public class RevisionP1 {

	String empname="azar";//global variable
	int salary;
	Scanner sc=new Scanner(System.in);
	void input()//user define function 
	{
		int empid=1001;//local variable
		
		System.out.println("Enter the salary is::");
		salary=sc.nextInt();
		System.out.println("This is input function"+empid+""+empname+""+salary);
	}
	void display()
	{
		System.out.println("This is display function"+empname);
	}
	public static void main(String[] args) {
	
		System.out.println("Main Function");
		RevisionP1 g1=new RevisionP1();
		g1.input();
		g1.display();

	}

}
