
public class ThreadP4 extends Thread
{

	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread Running..."+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException t)
			{
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		ThreadP4 t1=new ThreadP4();
		t1.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread..."+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException t)
			{
				
			}
		}
	}

}
