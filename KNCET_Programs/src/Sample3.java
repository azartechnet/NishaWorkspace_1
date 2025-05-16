
public class Sample3 {
	
	String pname="apple";//class or instance variable
	void get1()
	{
		int pid=1001;//local variable
	    System.out.println("This is get1 method"+pid+""+pname);
	}
	void get2()
	{
	   System.out.println("This is get2 method"+pname);
	}
	public static void main(String[] args) {
		
		Sample3 f2=new Sample3();
		f2.get1();
		f2.get2();

	}

}
