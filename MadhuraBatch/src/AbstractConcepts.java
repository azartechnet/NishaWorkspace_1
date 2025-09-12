abstract class Sample12
{
	abstract void get1();
	void get2()
	{
		int a=100;
		System.out.println("Your value is::"+a);
	}
}
class D13 extends Sample12
{
	public void get1()
	{
		System.out.println("Abstract Methods...");
	}
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		D13 f1=new D13();
		f1.get1();
		f1.get2();

	}

}
