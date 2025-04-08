
public class StringManiputlation {

	public static void main(String[] args) {

    String s1=new String("welcome");
    String s2="admin";
    System.out.println(s1);
    System.out.println(s1.length());
    System.out.println(s1.charAt(0));
    System.out.println(s1.substring(0, 5));
    System.out.println(s1.replace('w', 'a'));
    System.out.println(s1.trim());
    System.out.println(s1.startsWith("w"));
    System.out.println(s1.endsWith("f"));
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.equals(s2));
    

	}

}
