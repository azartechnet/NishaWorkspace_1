class Demo17
{
	public <M> M test(M t)
	{
		return t;
	}
}
public class GenericMethodP1 {

	public static void main(String[] args) {
	
		Demo17 g1=new Demo17();
		System.out.println(g1.test(1001));
		System.out.println(g1.test("azar"));

	}

}
