
public class GenericClass<M> {

	public M t;
	void setValue(M t)
	{
		this.t=t;
	}
	public void get1()
	{
		System.out.println("This is get value is::"+t);
	}
	public static void main(String[] args) {
		
		GenericClass<Integer>obj1=new GenericClass<Integer>();
		obj1.setValue(1001);
		GenericClass<String>obj2=new GenericClass<String>();
		obj2.setValue("Azar");
		obj1.get1();
		obj2.get1();

	}

}
