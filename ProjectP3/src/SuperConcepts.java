class B15
{
	int a=100;
	void get1()
	{
		System.out.println("Base class value is::"+a);
	}
}
class D15 extends B15
{
	void get2()
	{
		int a=200;
		System.out.println("Base class value is::"+super.a);
	}
}
public class SuperConcepts {

	public static void main(String[] args) {
	
		D15 f1=new D15();
		f1.get1();
		f1.get2();

	}

}
