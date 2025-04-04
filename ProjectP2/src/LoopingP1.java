
public class LoopingP1 {

	void get1()
	{
		int n=5,i;
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even value is::"+i);
			}
			else
			{
				System.out.println("Odd value is::"+i);
			}
		}
	}
	public static void main(String[] args) {
		
		LoopingP1 f1=new LoopingP1();
		f1.get1();
		

	}

}
