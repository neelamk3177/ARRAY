package WEEK3;
 import java.util.Set;
 import java.util.HashSet;
public class lonsubstringinset {
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
		 String s = "abcha";
		 System.out.println(allUnique(s));
	}
}
