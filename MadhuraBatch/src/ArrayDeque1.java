import java.util.ArrayDeque;

public class ArrayDeque1 {

	ArrayDeque<Integer> list1=new ArrayDeque<>();
	void get1()
	{
		list1.add(1001);
		list1.addFirst(2001);
		list1.add(1002);
		list1.addLast(3001);
		System.out.println("Your data is:"+list1);
		System.out.println("Data is::"+list1.getFirst());
		System.out.println("Remove is::"+list1.removeLast());
	}
	public static void main(String[] args) {
		
		ArrayDeque1 f1=new ArrayDeque1();
		f1.get1();

	}

}
