class Product
{
	Product()
	{
		System.out.println("This is default constructor");
	}
	Product(int pid,String pname)
	{
		System.out.println("This is Param Constructor"+pid+""+pname);
	}
}

public class ConstructorP1 {

	public static void main(String[] args) {
	
		new Product();
		new Product(1001,"apple");

	}

}
