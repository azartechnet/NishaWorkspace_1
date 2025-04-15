
public class StringBuliderP1 {

	public static void main(String[] args) {
		//String str="welcome";
		StringBuilder sb=new StringBuilder("welcome");
		
		System.out.println(sb.append("azar"));
		System.out.println(sb.delete(0,3));
		System.out.println(sb.insert(0,"azar"));
		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 4,"razae"));
		System.out.println(sb.deleteCharAt(0));
	}

}
