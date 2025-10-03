
public class ThreadP1 extends Thread
{

	public void run()
	{
		
		try {
			System.out.println("Thread_IN");
			Thread.sleep(10000);
			System.out.println("This is Thread-1");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadP1 t1=new ThreadP1();
		t1.start();

	}

}
