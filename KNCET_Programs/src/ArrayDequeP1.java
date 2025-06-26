import java.util.ArrayDeque;

public class ArrayDequeP1 {

	ArrayDeque<Integer>list1=new ArrayDeque<Integer>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.addFirst(2001);
		list1.addLast(3001);
		System.out.println("your value is::"+list1);
		System.out.println("Your data size is::"+list1.size());
		System.out.println("Your data remove is::"+list1.removeFirst());
		System.out.println("Searching::"+list1.contains(1001));
	}
	public static void main(String[] args) {
	
		ArrayDequeP1 f1=new ArrayDequeP1();
		f1.get1();

	}

}
