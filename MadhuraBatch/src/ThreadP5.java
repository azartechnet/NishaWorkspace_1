
public class ThreadP5 extends Thread
{

	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getName()+"Its Running.."+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException t)
			{
				System.out.println(t);
			}
		}
	}
	public static void main(String[] args) {
		
		ThreadP5 t1=new ThreadP5();
		ThreadP5 t2=new ThreadP5();
		ThreadP5 t3=new ThreadP5();
		t1.start();
		try
		{
			System.out.println("T2IN..");
			t2.join();
			System.out.println("T2OUT..");
		}
		catch(InterruptedException t7)
		{
			System.out.println(t7);
		}
		t3.start();
		try
		{
			
			t3.join();
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	

}
