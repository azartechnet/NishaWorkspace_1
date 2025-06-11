
public class MethodOverloading {

	void get1(String empname)
	{
		System.out.println("Your value is::"+empname);
	}
	void get1(int empid)
	{
		System.out.println("Your value is::"+empid);
	}
	public static void main(String[] args) {
		
		MethodOverloading f1=new MethodOverloading();
		f1.get1("azar");
		f1.get1(1001);

	}

}
