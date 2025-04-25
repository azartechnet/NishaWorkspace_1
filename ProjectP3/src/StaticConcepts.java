
public class StaticConcepts 
{
	 static int gameScore=0;//Static variables
     StaticConcepts()
     {
    	 gameScore++;
    	 System.out.println(gameScore);
     }
	public static void main(String[] args) {
		
		new StaticConcepts();
		new StaticConcepts();

	}

}
