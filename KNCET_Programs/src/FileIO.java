import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class FileIO {

	void writeData() throws IOException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\abc.txt");
			String name="welcome";
			byte s[]=name.getBytes();
			fos.write(s);
			System.out.println("FileInserted...");
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
			FileInputStream fis=new FileInputStream("D:\\abc.txt");
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void copyData() throws IOException
	{
		int i;
		try
		{
			FileInputStream fis=new FileInputStream("D:\\abc.txt");
			FileOutputStream fos=new FileOutputStream("D:\\xyz.txt");
			while((i=fis.read())!=-1)
			{
				fos.write(i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void seqread() throws IOException
	{
		try
		{
			int i;
			FileInputStream f1=new FileInputStream("D:\\abc.txt");
			FileInputStream f2=new FileInputStream("D:\\xyz.txt");
			SequenceInputStream sis=new SequenceInputStream(f1,f2);
			while((i=sis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	public static void main(String[] args) throws IOException {
		
		FileIO f1=new FileIO();
		//f1.writeData();
		//f1.readData();
		//f1.copyData();
		f1.seqread();

	}

}
