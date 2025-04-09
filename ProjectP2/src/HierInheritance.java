class B13
{
	
	int a=100;
	void get1()
	{
		
		System.out.println("This is Base class");
	}
}
class D11 extends B13
{
	void get2()
	{
		System.out.println("This is get2 function"+a);
	}
}
class D12 extends B13
{
	void get3()
	{
		System.out.println("This is get3 function"+a);
	}
}
public class HierInheritance {

	public static void main(String[] args) {
		
		D11 f1=new D11();
		f1.get1();
		f1.get2();
		D12 f2=new D12();
		f2.get1();
		f2.get3();

	}

}
