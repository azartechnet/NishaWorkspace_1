abstract class Sample
{
   abstract void get1();
   public void get2()
   {
	   System.out.println("This is normal method");
   }
}
class Der1 extends Sample
{
	public void get1()
	{
		System.out.println("This is get1 function");
	}
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		Der1 f1=new Der1();
		f1.get1();
		f1.get2();

	}

}
