
public class Sample1 {

	final int a=100;
	void get1()
	{ 
		a++;
		System.out.println("This is get1 method");
	}
	void get2()
	{
		System.out.println("This is get2 method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is Main function");
		Sample1 f1=new Sample1();
		f1.get1();
		f1.get2();

	}

}
