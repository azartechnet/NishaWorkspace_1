interface B
{
	int a=100;
	void get1();
}
interface B12 extends B
{
	void get2();
}
class D implements B12
{
	public void get1()
	{
		System.out.println("Interface value is::"+a);
	}
	public void get2()
	{
		System.out.println("Get2 functions");
	}
}
public class InterfaceP1 {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
