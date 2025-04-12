
public class fibconcepts {

	public static void main(String[] args) {
	
		 int n, first = 0, second = 1, next, c;
	      n=5;
	      for ( c = 0 ; c < n ; c++ )
	      {
	      if ( c <= 1 )
	         next = c;
	      else
	      {
	         next = first + second;
	         first = second;
	         second = next;
	      }
	    System.out.println(next);
	   }

	}

}
