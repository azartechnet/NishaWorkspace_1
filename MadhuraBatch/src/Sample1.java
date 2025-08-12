
public class Sample1 {

	String pname="apple";//class or instance variable
	void get1()
	{
		int pid=1001;//local variable
		System.out.println("This is get1 methods"+pid);
	}
	void get2()
	{
		System.out.println("This is get2 methods"+pname);
	}
	public static void main(String[] args) {
	
		Sample1 h1=new Sample1();
		h1.get1();
		h1.get2();

	}

}
