
public class ThreadP3 extends Thread
{

	public void run()
	{
		try
		{
			System.out.println("SleepIn");
			Thread.sleep(10000);
			System.out.println("ThreadProcess::"+Thread.currentThread().getName());
			System.out.println("ThreadPriority::"+currentThread().getPriority());
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadP3 t1=new ThreadP3();
		ThreadP3 t2=new ThreadP3();
		t1.setName("sdlc");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		t2.start();
		t1.isAlive();
		t1.isInterrupted();

	}

}
