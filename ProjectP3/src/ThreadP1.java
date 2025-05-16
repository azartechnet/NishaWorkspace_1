
public class ThreadP1 extends Thread
{

	public void run()
	{
		try
		{
		System.out.println("ThreadIN");
		Thread.sleep(10000);
		System.out.println("ThreadOUT");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
	void get1()
	{
		System.out.println("This is get1 function");
	}
	
	public static void main(String[] args) {
		
		ThreadP1 f1=new ThreadP1();
		f1.start();
		f1.get1();

	}

}
