class Message
{
	String content;
	
}
class Writer extends Thread
{
	Message msg;
	Writer(Message msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		synchronized (msg)
		{
		    System.out.println("Writer Writing message...");
		    msg.content="Hello from Writer";
		    msg.notify();//Notify the reader
		}
	}
}
class Reader extends Thread
{
	Message msg;
	Reader(Message msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		synchronized (msg)
		{
		    try
		    {
		    	System.out.println("Reader:Waiting for Message");
		    	msg.wait();//wait for writer to notify
		    }
		    catch(InterruptedException t)
		    {
		    	System.out.println(t);
		    }
		    System.out.println("Reader::Received message::"+msg.content);
		}
	}
}
public class ITC {

	public static void main(String[] args) {
		
		Message m=new Message();
		Reader reader=new Reader(m);
		Writer writer=new Writer(m);
		reader.start();
		writer.start();

	}

}
