import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class trywithresourcesP1 {

	public static void main(String[] args) throws IOException {
	
		String filePath="D:\\output.txt";
		String content="HelloWorld";
		
		try(FileWriter fw=new FileWriter(filePath))
		{
			fw.write(content);
			
			System.out.println("FileWritten...");
		}
		catch(FileNotFoundException t)
		{
			System.out.println(t);
		}

	}

}
