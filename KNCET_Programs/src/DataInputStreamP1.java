import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamP1 {

	int empid;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void get() throws  IOException
	{
		System.out.println("Enter the empid and empname");
		empid=Integer.parseInt(dis.readLine());
		empname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
	public static void main(String[] args) throws IOException {
		
		DataInputStreamP1 f1=new DataInputStreamP1();
		f1.get();
		f1.display();

	}

}
