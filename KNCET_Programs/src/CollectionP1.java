import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionP1 {


//	HashSet<String>list1=new HashSet<String>();
	//TreeSet<String>list1=new TreeSet<String>();
	ArrayList<String>list1=new ArrayList<String>();
	void get1()
	{
		list1.add("a1");
		list1.add("a2");
		list1.add("a3");
		list1.add("a4");
		list1.add("a4");//duplicate not to allow
		System.out.println("Size of the list::"+list1.size());
		System.out.println("Searching::"+list1.contains("a1"));
		System.out.println("Removing the data::"+list1.remove("a1"));
		System.out.println("After removing the size is::"+list1.size());
		System.out.println("Your data is::"+list1);
		Iterator g1=list1.iterator();
		while(g1.hasNext())
		{
			System.out.println("Inside the loop data::"+g1.next());
		}
	}
	public static void main(String[] args) {
		
		CollectionP1 f1=new CollectionP1();
		f1.get1();

	}

}
