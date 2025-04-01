import java.io.DataInputStream;
import java.io.IOException;

public class Sample4 {

	int empid,salary;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void input()throws IOException
	{
		System.out.println("Enter the empid and Salary");
		empid=Integer.parseInt(dis.readLine());
		salary=Integer.parseInt(dis.readLine());
		System.out.println("Enter the empname is::");
		empname=dis.readLine();
		System.out.println("Your value is::"+empid+""+salary+""+empname);
	}
	public static void main(String[] args) throws IOException {
		
		Sample4 f1=new Sample4();
		f1.input();

	}

}
