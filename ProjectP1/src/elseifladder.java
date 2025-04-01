import java.util.Scanner;

public class elseifladder {

	public static void main(String[] args) {
		
		int score;
		Scanner sc=new Scanner(System.in);
		score=sc.nextInt();
		if(score>=90)
		{
			System.out.println("Grade-A");
		}
		else if(score>=80)
		{
			System.out.println("Grade-B");
		}
		else if(score>=70)
		{
			System.out.println("Grade-C");
		}
		else
		{
			System.out.println("Grade-F");
		}

	}

}
