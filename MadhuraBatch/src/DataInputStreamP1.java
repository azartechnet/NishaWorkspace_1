import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamP1 {

	int empid;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void get1() throws IOException
	{
		System.out.println("Enter the empid is::");
		empid=Integer.parseInt(dis.readLine());
		System.out.println("Enter the empname is::");
		empname=dis.readLine();
	}
	void get2()
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
	public static void main(String[] args) throws IOException {
		
		DataInputStreamP1 f1=new DataInputStreamP1();
		f1.get1();
		f1.get2();

	}

}
