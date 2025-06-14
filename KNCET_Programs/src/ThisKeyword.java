
public class ThisKeyword {

	int empid;
	String empname;
	void get1(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
		System.out.println("Get1 function is::"+empid+""+empname);
	}
	void get2()
	{
		System.out.println("This is get2 function::"+empid+""+empname);
	}
	public static void main(String[] args) {
		
		ThisKeyword f1=new ThisKeyword();
		f1.get1(1001,"azar");
		f1.get2();

	}

}
