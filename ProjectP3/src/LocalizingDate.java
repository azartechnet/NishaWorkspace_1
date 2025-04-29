import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalizingDate {

	public static void main(String[] args) {

		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL,new Locale("en","US"));
		
		
		String d2=df.format(new Date());
		

		
		System.out.println(d2);


	}

}
