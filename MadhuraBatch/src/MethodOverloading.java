
public class MethodOverloading {

	void get1(int a,int b)
	{
		System.out.println("Your value is::"+a+""+b);
	}
	void get1(String name)
	{
		System.out.println("Your name is::"+name);
	}
	public static void main(String[] args) {
		
		MethodOverloading f1=new MethodOverloading();
		f1.get1(100,200);
		f1.get1("apple");

	}

}
