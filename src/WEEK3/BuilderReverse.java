package WEEK3;

public class BuilderReverse {
	public static void main (String[]args) {
	String	s1= "madam";
	StringBuilder sb = new StringBuilder(s1);
	sb.reverse();
	boolean f = sb.toString().equals(s1);
	System.out.println(f);
	}

}
