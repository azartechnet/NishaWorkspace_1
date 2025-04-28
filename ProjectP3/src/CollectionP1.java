import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionP1 {

	//HashSet<Integer>list1=new HashSet<Integer>();
	//TreeSet<Integer>list1=new TreeSet<Integer>();
	ArrayList<Integer>list1=new ArrayList<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1002);
		list1.add(1003);
		
		Iterator m=list1.iterator();
		while(m.hasNext())
		{
			System.out.println("Inside the loop is::"+m.next());
		}
		
		System.out.println("Your value is::"+list1);
		System.out.println("Searching the data::"+list1.contains(1001));
		System.out.println("TotalSize is::"+list1.size());
		System.out.println("Remove the data::"+list1.remove(1002));
		System.out.println("After Removing value is::"+list1);
		
	}
	public static void main(String[] args) {
		
		CollectionP1 f1=new CollectionP1();
		
		f1.get1();

	}

}
