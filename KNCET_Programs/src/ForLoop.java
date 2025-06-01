
public class ForLoop {
	public static void main(String[] args) {
		
		int n=5,i,sum=0,prd=1;
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Its is Even"+i);
				sum=sum+i;
				System.out.println("sum of even number is "+sum);
				
			}
			else
			{
				System.out.println("Its is Odd"+i);
				prd=prd*i;
				System.out.println("Product of odd number is "+prd);
			}
			
		}
		

	}

}
