
public class Looping2 {

	public static void main(String[] args) {
		
		int even=0,odd=1,i,n=5;
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd*i;
			}
		}
		System.out.println("Even value is::"+even);
		System.out.println("Odd value is::"+odd);
	}

}
