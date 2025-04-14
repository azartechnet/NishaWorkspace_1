interface B1
{
	int pid=1001;
	void get1();
}
interface B2 extends B1
{
	void get2();
}
class Demo12 implements B2
{
	public void get1()
	{
		System.out.println("Your get1 data is::"+pid);
	}
	public void get2()
	{
		System.out.println("Your get2 data");
	}
}
public class InterfaceConcepts {

	public static void main(String[] args) {
		
		Demo12 f1=new Demo12();
		f1.get1();
		f1.get2();

	}

}
