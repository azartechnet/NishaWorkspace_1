interface B2
{
	int a=100;
	void get1();
}
interface B3 extends B2
{
	int b=30;
	void get2();
}
class Foo implements B3
{
	public void get1()
	{
		System.out.println("This is B2 Interface::"+a);
	}
	public void get2()
	{
		int c;
		c=a*b;
		System.out.println("This is B3 Interface::"+c);
	}
}
public class InterfaceConcepts {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1();
		f1.get2();

	}

}
