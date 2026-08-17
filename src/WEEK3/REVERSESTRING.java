package WEEK3;
public class REVERSESTRING {

	public static void main(String[] args) {
		String str = "abcdefgh";
		String s = "";
		for(int i =0; i <str.length(); i ++) {
			char c= str.charAt(i);
			s = c+s;
		}
		
   System.out.println(s);
	}

}
 