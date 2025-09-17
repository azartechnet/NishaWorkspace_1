 class B12
{
	int a=100;
	void get1()
	{
		System.out.println("Your data is::"+a);
	}
}
class D12 extends B12
{
	void get2()
	{
		int a=200;
		System.out.println("Your derived class::"+super.a);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		
		D12 f1=new D12();
		f1.get1();
		f1.get2();

	}

}
