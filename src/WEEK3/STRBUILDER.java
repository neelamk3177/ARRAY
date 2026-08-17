package WEEK3;

public class STRBUILDER {

	public static void main(String[] args) {
		String str = "abcde";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
		
	}

}
