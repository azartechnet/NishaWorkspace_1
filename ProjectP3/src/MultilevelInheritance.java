class B1
{
	int a=10;
	void get1()
	{
		System.out.println("This Base class");
	}
}
class D1 extends B1
{
	
	int b=20;
	void get2()
	{
		System.out.println("This is InterDervied class");
	}
}
class D2 extends D1
{
	int c;
	void get3()
	{
		c=a*b;
		System.out.println("Final Dervied Class::"+c);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
