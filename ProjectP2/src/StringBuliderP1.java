
public class StringBuliderP1 {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("welcome");
		System.out.println(sb.append("Azar"));
		System.out.println(sb.length());
		System.out.println(sb.charAt(0));
		System.out.println(sb.indexOf("c",3));
		System.out.println(sb.lastIndexOf("e",3));
		//System.out.println(sb.reverse());
		System.out.println(sb.insert(6,"******"));
	}

}
