
public class ThreadP1 extends Thread
{

	public void run()
	{
		try
		{
			System.out.println("SleepIn");
			Thread.sleep(10000);
			System.out.println("ThreadProcess"+Thread.currentThread().getName());
			System.out.println("Priority::"+currentThread().getPriority());
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		
	}
	public static void main(String[] args) {
		
		ThreadP1 f1=new ThreadP1();
		ThreadP1 f2=new ThreadP1();
		
		f1.setName("sdlc");
		f1.setPriority(MAX_PRIORITY);
		f2.setPriority(MIN_PRIORITY);
		f1.start();
		f2.start();
		f1.isAlive();
		f1.isInterrupted();

	}

}
