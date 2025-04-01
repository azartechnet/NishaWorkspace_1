
public class Sample1 {
	
	String pname="apple";//global variable
	void get1()
	{
		int pid=1001;//localvariable
		System.out.println("This is method-1"+pid);
	}
	void get2()
	{
		System.out.println("This is method-2"+pname);
	}

	public static void main(String[] args) {
	
		
		Sample1 s1=new Sample1();
		s1.get1();
		s1.get2();

	}

}
