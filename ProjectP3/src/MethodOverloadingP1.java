
public class MethodOverloadingP1 {

	void get1(int empid,String empname)
	{
		System.out.println("Your empid is::"+empid+""+empname);
	}
	void get1(int salary)
	{
		System.out.println("Your salary is::"+salary);
	}
	public static void main(String[] args) {
		
		MethodOverloadingP1 f1=new MethodOverloadingP1();
		f1.get1(1001,"azar");
		f1.get1(20000);

	}

}
