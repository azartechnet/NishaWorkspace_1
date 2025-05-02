
public class ExceptionP3 {

	void get1()
	{
		try
		{
			//String s1="mohamed";
			String s1=null;
			System.out.println("TotalLength is::"+s1.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("This is NullPointer Exception");
		}
	}
	public static void main(String[] args) {
		
		ExceptionP3 f1=new ExceptionP3();
		f1.get1();

	}

}
