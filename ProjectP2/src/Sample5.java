import java.util.Scanner;

public class Sample5 {

	int pid;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the pid is::");
		pid=sc.nextInt();
	}
	void process()
	{
		if(pid==1001)
		{
			System.out.println("Its is equal");
		}
		else
		{
			System.out.println("Its is not equal");
		}
	}
	void looping()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("I value is::"+i);
		}
	}
	public static void main(String[] args) {
		
		Sample5 f1=new Sample5();
		f1.get1();
		f1.process();
		f1.looping();

	}

}
