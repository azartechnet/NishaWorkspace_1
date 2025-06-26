
public class ExceptionP1 {

	void get1()
	{
		
		try
		{
		int a=100/0;
		System.out.println("This is get1 function");
		}
		catch(ArithmeticException t)
		{
			System.out.println(t);
		}
		finally
		{
			get2();
		}
		
	}
	void get2()
	{
		System.out.println("This is get2 function");
	}
	void get3()
	{
		try
		{
			//String s1="welcome";
			String s1=null;
			System.out.println("Your string length is::"+s1.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please check the value"+t);
		}
	}
	public static void main(String[] args) {
		
		ExceptionP1 f1=new ExceptionP1();
		//f1.get1();
		f1.get3();

	}

}
