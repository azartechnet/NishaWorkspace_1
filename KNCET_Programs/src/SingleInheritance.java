import java.util.Scanner;

class B1
{
	int empid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the empid is::");
		empid=sc.nextInt();
	}
}
class D1 extends B1
{
	void display()
	{
		System.out.println("Your value is::"+empid);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		D1 f1=new D1();
		f1.get1();
		f1.display();

	}

}
