
public class ThreadP3 implements Runnable
{
	public void run()
	{
		System.out.println("This is run method");
	}

	public static void main(String[] args) {
		
		ThreadP3 f1=new ThreadP3();
		Thread t1=new Thread(f1);
		t1.start();

	}

}
