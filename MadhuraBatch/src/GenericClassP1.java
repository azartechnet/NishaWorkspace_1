class Demo16<M>
{
	public M t;
	public void setValue(M t)
	{
		this.t=t;
	}
	public void get()
	{
		System.out.println("This is get value is::"+t);
	}
}
public class GenericClassP1 {

	public static void main(String[] args) {
		
		Demo16<Integer>h1=new Demo16<Integer>();
		Demo16<String>h2=new Demo16<String>();
		
		h1.setValue(1001);
		h1.get();
		
		h2.setValue("azar");
		h2.get();

	}

}
