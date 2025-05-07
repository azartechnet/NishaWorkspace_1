import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	void writeFun()throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\m1.txt");
			String name="welcome";
			byte s[]=name.getBytes();
			fos.write(s);
			System.out.println("Message write in the file");
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void readData() throws IOException
	{
		try
		{
			int i;
			FileInputStream fis=new FileInputStream("D:\\m1.txt");
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	void copyData() throws IOException
	{
		int i;
		try
		{
			FileInputStream fis=new FileInputStream("D:\\m1.txt");
			FileOutputStream fos=new FileOutputStream("D:\\m2.txt");
			while((i=fis.read())!=-1)
			{
				fos.write(i);
			}
			
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}
	}
	public static void main(String[] args) throws IOException {
		
		FileIO f1=new FileIO();
		//f1.writeFun();
		//f1.readData();
		f1.copyData();

	}

}
