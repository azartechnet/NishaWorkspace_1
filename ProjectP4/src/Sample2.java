import java.util.Scanner;

class Sample10 {
	
	String uname;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the uname is::");
		uname=sc.next();
		if(uname.equals("admin"))
		{
			System.out.println("LoginSuccess!!!");
		}
		else
		{
			System.out.println("LoginFail!!!");
		}
	}

	public static void main(String[] args) {
		
		Sample1 f1=new Sample1();
		f1.get1();

	}

}

