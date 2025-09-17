class Demo
{
	static int a=10;
	static void get1()
	{
		a++;
		System.out.println("Your data is::"+a);
	}
}
public class StaticP1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get1();

	}

}
