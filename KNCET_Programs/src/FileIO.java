import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
	void fileReader() throws IOException
	{
		FileReader fr=new FileReader("D:\\xyz.txt");
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		br.close();
		fr.close();
	}
	void fileWriter() throws IOException
	{
		try
		{
			
			FileWriter f1=new FileWriter("D:\\output.txt");
			f1.write("Welcome");
			f1.close();
			System.out.println("FileWriting...");
			
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void fileAppending() throws IOException
	{
		try(FileWriter out=new FileWriter("D:\\output.txt",true)){
			//Append mode
			out.write("\nAppendingdata2");
			System.out.println("Append Good");
		}
	}
	public static void main(String[] args) throws IOException {
		
		FileIO f1=new FileIO();
		//f1.writeData();
		//f1.readData();
		//f1.copyData();
		//f1.seqread();
		//f1.fileReader();
		//f1.fileWriter();
		f1.fileAppending();

	}

}
