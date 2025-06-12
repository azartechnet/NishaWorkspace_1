abstract class Demo120
{
	abstract void get1();
	void get2()
	{
		System.out.println("Welcome");
	}
}
class D120 extends Demo120
{
	public void get1()
	{
		System.out.println("This is Abstract");
	}
}
public class AbstractP1 {

	public static void main(String[] args) {
		
		D120 f1=new D120();
		f1.get1();
		f1.get2();

	}

}
