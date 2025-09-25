
public class ExceptionP1 {

	void get1()
	{
		try
		{
		int a=100/0;
		System.out.println("Your value is::"+a);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the input"+t);
		}
		System.out.println("This is outside try catch block");
		
	}
	public static void main(String[] args) {
		
		ExceptionP1 f1=new ExceptionP1();
		f1.get1();

	}

}
