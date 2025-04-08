
public class Sample1 {
	
	
	void get1()
	{
		int a=101;//local variable
		if(a==100)
		{
			System.out.println("A is equal");
		}
		else
		{
			System.out.println("A is not equal");
		}
	}

	public static void main(String[] args) {
		
		Sample1 f1=new Sample1();
		f1.get1();

	}

}
