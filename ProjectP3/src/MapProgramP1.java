import java.util.Map;
import java.util.TreeMap;

public class MapProgramP1 {

	TreeMap<Integer,String>g1=new TreeMap<Integer, String>();
	void get1()
	{
		g1.put(1001,"azar");
		g1.put(1002,"mohamed");
		g1.put(1003, "raja");
		g1.put(1004,"sheik");
		for(Map.Entry m:g1.entrySet())
		{
			System.out.println("Your Key is::"+m.getKey()+"Your value is::"+m.getValue());
		}
		System.out.println("Your size is::"+g1.size());
		System.out.println("Remove the data is::"+g1.remove(1001));
		System.out.println("Searching the data is::"+g1.containsKey(1001));
		System.out.println("After Removing the data is::"+g1.size());
	}
	public static void main(String[] args) {
		
		MapProgramP1 f1=new MapProgramP1();
		f1.get1();

	}

}
