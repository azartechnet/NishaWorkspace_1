
public class ArmStrongConcepts {

	public static void main(String[] args) {
		int s=0;
		int n=202,rem;
		int temp=n;
		while(n>0)
		  {
		    rem=n%10;
		    s=s+rem*rem*rem;
		    n=n/10;
		    }
		if(temp==s)
		{
			System.out.println("This is armstrong"+s);
		}
		else
		{
			System.out.println("This is not a Armstrong"+s);
		}

	}

}
