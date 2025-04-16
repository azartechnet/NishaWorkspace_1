class Demo13<M>
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
public class GenericClass {

	public static void main(String[] args) {
	
		Demo13<Integer>f1=new Demo13<Integer>();
		f1.setValue(1000);
		Demo13<String>f2=new Demo13<String>();
		f2.setValue("admin");
		f1.get();
		f2.get();

	}

}
