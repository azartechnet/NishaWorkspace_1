
public class StringP1 {

	public static void main(String[] args) {
		
		String str1=new String("Welcome");//To creating a reference
		System.out.println("Your value is::"+str1);
		
		String str2="mohamed";//Without creating a reference
		System.out.println("Your value is::"+str2);
		System.out.println("Length::"+str1.length());//6
		System.out.println(str1.charAt(0));//w
		System.out.println(str1.equals(str2));//False
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.startsWith("W"));
		System.out.println(str1.endsWith("e"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.substring(0, 5));

	}

}
