abstract class Sample12
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is normal method");
	}
}
class Demo20 extends Sample12
{
	void get1()
	{
		System.out.println("Abstract Method to be define");
	}
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		Demo20 f1=new Demo20();
		f1.get1();
		f1.get2();

	}

}
