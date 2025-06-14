class DemoP1
{
	DemoP1()
	{
		System.out.println("This is default cons..");
	}
	DemoP1(int empid,String empname)
	{
		System.out.println("This is param cons.."+empid+""+empname);
	}
}
public class ConstructorP1 {

	public static void main(String[] args) {
		
		new DemoP1();
		new DemoP1(1001,"azar");

	}

}
