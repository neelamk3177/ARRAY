package WEEK3;
import java.util.Set;
import java.util.HashSet;
public class nonduplicatesubstring {
	public  static boolean  allUnique(String str) {
		Set<Character> set = new HashSet<Character>();
		 for (char ch : str.toCharArray()) {
			 if (set.contains(ch)) {
				 return false;
			 } 
			 set.add(ch);
			 
		 }
return true;
	}

	public static void main(String[] args) {
		String mystr= "abbcd";
		int len = mystr.length();
		for( int i =0 ; i <len; i ++) {	
			for (int j = i ; j<len ; j++ ) {
				String s = mystr.substring(i , j+1);
				System.out.println(s);
			}
		}
}
}