import java.util.Scanner;

public class SwitchStmt {

	int exp;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the exp is::");
		exp=sc.nextInt();
		switch(exp)
		{
		case 1:
			System.out.println("case-1");
			break;
		case 2:
			System.out.println("case-2");
			break;
		case 3:
			System.out.println("case-3");
			break;
		default:
			System.out.println("default case");
			break;
		}
	}
	public static void main(String[] args) {
		
		SwitchStmt f1=new SwitchStmt();
		f1.get1();

	}

}
