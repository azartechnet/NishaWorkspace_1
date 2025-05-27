import java.util.Scanner;

class Demo
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the a and b value is::");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void ifelse()
	{
		if(a==b)
		{
			System.out.println("Its is equal");
		}
		else
		{
			System.out.println("Its is not equal");
		}
	}
}
public class ControlStatementp1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.input();
		f1.ifelse();

	}

}
