class Demo14
{
	public <M>  void test(M t)   
	{
		System.out.println(t);
	}
}
public class GenericMethods {

	public static void main(String[] args) {
	
		Demo14 f1=new Demo14();
//		System.out.println(f1.test(1001));
//		System.out.println(f1.test("azar"));
//		System.out.println(f1.test(12.5));
		f1.test(1001);
	}

}
