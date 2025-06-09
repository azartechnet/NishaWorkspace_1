import java.util.Scanner;

class B2
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the a value is::");
		a=sc.nextInt();
	}
}
class D2 extends B2
{
	void get2()
	{
		System.out.println("Enter the b value is::");
		b=sc.nextInt();
	}
}
class D3 extends D2
{
	void display()
	{
		System.out.println("Your value is::"+a+""+b);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		D3 f1=new D3();
		f1.get1();
		f1.get2();
		f1.display();

	}

}
