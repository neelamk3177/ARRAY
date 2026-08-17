package WEEK3;
public class DeleteCharacter {

	public static void main(String[] args) {
	    StringBuilder sb = new StringBuilder("Programming");

	    sb.deleteCharAt(0);
	    sb.setCharAt(0, 'A');

	    System.out.println(sb);
	}
}