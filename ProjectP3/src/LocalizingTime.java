import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalizingTime {

	public static void main(String[] args) {

		
		DateFormat df=DateFormat.getTimeInstance(DateFormat.LONG,new Locale("de","DE"));
		
		String d2=df.format(new Date());
		
		
		
		System.out.println(d2);


	}

}
