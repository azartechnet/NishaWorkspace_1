interface B12
{
	int a=100;
	void get1();
}
interface B13 extends B12
{
	int b=20;
	void get2();
}
class D12 implements B13
{
	public void get1()
	{
		System.out.println("Get1 function is::"+a);
	}
	public void get2()
	{
		System.out.println("Get2 function is::"+b);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D12 f1=new D12();
		f1.get1();
		f1.get2();

	}

}
