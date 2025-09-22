import java.util.HashMap;
import java.util.Map;

public class MapConcept1 {

	HashMap<Integer,String>list1=new HashMap<Integer, String>();
	void get1()
	{
		list1.put(1001,"azar");
		list1.put(1002,"mohamed");
		list1.put(1003,"sdlc");
		for(Map.Entry h1:list1.entrySet())
		{
			System.out.println(h1.getKey());
			System.out.println(h1.getValue());
		}
		System.out.println("Remove data is::"+list1.remove(1001));
		System.out.println("Searching is::"+list1.containsKey(1002));
		System.out.println("Total size is::"+list1.size());
		System.out.println("Your data is::"+list1);
	}
	public static void main(String[] args) {
		
		MapConcept1 f1=new MapConcept1();
		f1.get1();

	}

}
