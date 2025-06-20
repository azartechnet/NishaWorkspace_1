
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapConcepts1 {

	TreeMap<Integer,String>g1=new TreeMap<Integer, String>();
	
	void get1()
	{
	   g1.put(1001,"a1");
	   g1.put(1002,"a2");
	   g1.put(1003,"a3");
	   g1.put(1004,"a4");
	   for(Entry<Integer, String> m1:g1.entrySet())
	   {
		   System.out.println("Your key is::"+m1.getKey()+"Your value is::"+m1.getValue());
	   }
	   System.out.println("Your size of the data ::"+g1.size());
	   
	   System.out.println("Remove the data is::"+g1.remove(1001));
	   
	   System.out.println("Searching the data is::"+g1.containsKey(1001));
	   
	   System.out.println("After removing data is::"+g1.size());
	}
	public static void main(String[] args) {
		
		MapConcepts1 f1=new MapConcepts1();
		f1.get1();

	}

}
