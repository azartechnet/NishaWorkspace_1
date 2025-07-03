
class Product
{
	String empname="azar";//global variable
	void addProduct()
	{
		int empid=1001;//local variable
		System.out.println("This is addProduct"+empid);
	}
	void viewProduct()
	{
		System.out.println("This is viewProduct"+empname);
	}
}

public class Sample {

	public static void main(String as[]) {
	
		System.out.println("This is Main Class");
		Product p1=new Product();
		p1.addProduct();
		p1.viewProduct();
		

	}

}
