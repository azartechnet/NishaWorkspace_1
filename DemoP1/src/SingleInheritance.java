class B
{
	String pname="apple";
	void get1()
	{
		System.out.println("This is Base class"+pname);
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("This is Dervied class"+pname);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
	
		D f1=new D();
		f1.get1();
		f1.get2();
		

	}

}
