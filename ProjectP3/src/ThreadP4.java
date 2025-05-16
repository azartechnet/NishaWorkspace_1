
public class ThreadP4 extends Thread
{

	public void run()
	{
		int i;
		try
		{
			for(i=0;i<=5;i++)
			{
				System.out.println("I value is::"+i);
				Thread.sleep(10000);
			}
			System.out.println("ThreadOut");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
	
		ThreadP4 t1=new ThreadP4();
		ThreadP4 t2=new ThreadP4();
		t1.start();
		try
		{
			System.out.println("Join IN");
			t1.join(10000);
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
     t2.start();
	}

}
