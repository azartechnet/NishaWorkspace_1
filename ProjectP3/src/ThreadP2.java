
public class ThreadP2 extends Thread
{

	public void run()
	{
		System.out.println(""+currentThread().getPriority()+""+currentThread().getName());
	}
	public static void main(String[] args) {
		
		ThreadP2 t1=new ThreadP2();
		t1.start();
		ThreadP2 t2=new ThreadP2();
		t2.start();
		t1.setPriority(MAX_PRIORITY);
		t1.setName("sdlc");

	}

}
