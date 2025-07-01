
public class ThreadP2 implements Runnable
{

	public void run()
	{
		System.out.println("This is Run method..");
	}
	public static void main(String[] args) {
		
		ThreadP2 p1=new ThreadP2();
		Thread t1=new Thread(p1);
		t1.start();

	}

}
