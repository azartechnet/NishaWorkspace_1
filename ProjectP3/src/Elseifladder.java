import java.util.Scanner;

public class Elseifladder {

	public static void main(String[] args) {
		
		int m1,m2,m3,tot;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks::");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		tot=m1+m2+m3;
		if(tot>=900)
		{
			System.out.println("Grade-A");
		}
		else if(tot>=700)
		{
			System.out.println("Grade-B");
		}
		else if(tot>=500)
		{
			System.out.println("Grade-C");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
