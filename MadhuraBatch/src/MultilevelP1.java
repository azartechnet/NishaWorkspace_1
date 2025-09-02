class B1
{
	int a=100;
	void get1()
	{
		System.out.println("This is Base class");
	}
}
class D1 extends B1
{
	int b=200;
	void get2()
	{
		System.out.println("This is Dervied class");
	}
}
class D2 extends D1
{
	int c;
	void get3()
	{
		c=a*b;
		System.out.println("This is final dervied clasS::"+c);
	}
}
public class MultilevelP1 {

	public static void main(String[] args) {
		
		D2 g1=new D2();
		g1.get1();
		g1.get2();
		g1.get3();

	}

}
