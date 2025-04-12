
public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int s=0,temp,n=153;
		int rem;
		temp=n;
		while(n>0)
		  {
		    rem=n%10;
		    s=s+rem*rem*rem;
		    n=n/10;
		    }
		if(temp==s)
		{
			System.out.println("This is armstrong"+temp);
		}
		else
		{
			System.out.println("This is not a armstrong::"+temp);
		}


	}

}
