
public class MethodOverloadingP1 {

	void get1(int a)
	{
		System.out.println("Your value is::"+a);
	}
	void get1(String name,int salary)
	{
		System.out.println("Your value is::"+name+""+salary);
	}
	public static void main(String[] args) {
		

		MethodOverloadingP1 f1=new MethodOverloadingP1();
		f1.get1(100);
		f1.get1("azar",10000);
		
	}

}
