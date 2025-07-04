
public class JoinConcepts extends Thread
{

	private String threadName;
	
	public JoinConcepts(String name)
	{
		threadName=name;
	}
	public void run()
	{
		System.out.println(threadName+"is  Starting...");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		System.out.println(threadName+"has finishing...");
	}
	public static void main(String[] args) {
		
		JoinConcepts t1=new JoinConcepts("Thread-1");
		JoinConcepts t2=new JoinConcepts("Thread-2");
		JoinConcepts t3=new JoinConcepts("Thread-3");
		
		//Start the thread
		t1.start();
		t2.start();
		t3.start();
		
		//join the thread
		
		try
		{
			t1.join(10000);
			System.out.println("Joined"+t1.getName());
			t2.join();
			System.out.println("Joined"+t2.getName());
		
			
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		System.out.println("All threads have finished works");

	}

}
