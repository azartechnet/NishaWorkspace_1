import java.lang.*;
public class Sample2 {

	String empname="azar";//global variable
	void fun1()
	{
		int empid=1001;//localvariable
		System.out.println("Inside fun1::"+empid);
	}
	void fun2()
	{
		System.out.println("Inside fun2::"+empname);
	}
	public static void main(String[] args) {
	
		Sample2 f1=new Sample2();
		f1.fun1();
		f1.fun2();

	}

}
