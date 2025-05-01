
public class ExceptionP1 {

	void get1()
	{
		try
		{
		int a=100/0;
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the value");
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 function");
	}
	public static void main(String[] args) {
		
		ExceptionP1 f1=new ExceptionP1();
		f1.get1();

	}

}
