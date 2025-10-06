
public class ThreadP2 implements Runnable
{
	
	public void run()
	{
		try
		{
			for(int i=0;i<=5;i++)
			{
				Thread.sleep(10000);
				System.out.println("I value is::"+i);
			}
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		
		
		ThreadP2 p2=new ThreadP2();
		Thread t1=new Thread(p2);
		t1.start();
	}

}
