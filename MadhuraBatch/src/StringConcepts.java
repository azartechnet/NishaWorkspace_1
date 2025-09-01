
public class StringConcepts {

	public static void main(String[] args) {
//		
//		String s1="  mohamed";
//		String s2=new String("welcome");
//		System.out.println(s1.length());
//		System.out.println(s1.charAt(0));
//		System.out.println(s1.substring(0,3));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.trim());
		
		StringBuilder sb=new StringBuilder("welcome");
		System.out.println(sb.insert(0,"azar"));
		System.out.println(sb.append("****"));

	}

}
