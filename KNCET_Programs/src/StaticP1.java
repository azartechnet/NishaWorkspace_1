
public class StaticP1 {

	static int a=10;
	StaticP1()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		new StaticP1();
		new StaticP1();
		new StaticP1();

	}

}
