
public class VariablesP1 {

	int pid=1001;//class or instance variables
	String pname="apple";
	void get1()
	{
		int cid=2001;//local variable
		System.out.println("Your value is::"+pid+""+cid);
	}
	void get2()
	{
		System.out.println("your value is::"+pname);
	}
	public static void main(String[] args) {
		
        VariablesP1 f1=new VariablesP1();
        f1.get1();
        f1.get2();
	}

}
