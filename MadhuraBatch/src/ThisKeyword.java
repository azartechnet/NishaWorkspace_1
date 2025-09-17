class Demo12
{
	int a1,b1;
	void get1(int pid,int cid)
	{
		this.a1=pid;
		this.b1=cid;
		System.out.println("Your data is::"+pid+""+cid);
	}
	void get2()
	{
		System.out.println("Your data is::"+a1+""+b1);
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		
		Demo12 f1=new Demo12();
		f1.get1(1001,2001);
		f1.get2();

	}

}
