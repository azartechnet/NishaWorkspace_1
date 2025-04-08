import java.util.Scanner;

public class SwitchCase {

	int exp;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the exp::");
		exp=sc.nextInt();
	    switch(exp)
	    {
	    case 1:
	    	System.out.println("Case-1");
	    	break;
	    case 2:
	    	System.out.println("Case-2");
	    	break;
	    case 3:
	    	System.out.println("Case-3");
	    	break;
	    default:
	    	System.out.println("Default case");
	    	break;
	    }
	}
	public static void main(String[] args) {
		
		SwitchCase f1=new SwitchCase();
		f1.get1();

	}

}
